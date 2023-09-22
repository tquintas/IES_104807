package weather;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.ipma_client.IpmaCityForecast; //may need to adapt package name
import weather.ipma_client.IpmaService;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {
    private static final Logger logger = LoggerFactory.getLogger(WeatherStarter.class);
    public static void main(String[] args ) {
        logger.debug("Initiated program.");
        Scanner scanner = new Scanner(System.in);
        boolean no_args = true;
        while (no_args) {
            int CITY_ID = 0;
            try {
                CITY_ID = Integer.parseInt(args[0]);
                no_args = false;
            } catch (Exception ex) {
                while (CITY_ID == 0) {
                    try {
                        System.out.println("Enter the city code, or q to exit: ");
                        String id = scanner.nextLine();
                        if (id.equalsIgnoreCase("q")) {
                            System.out.println("Exiting...");
                            logger.debug("Terminated program.");
                            return;
                        }
                        if (id.length() != 7) {
                            throw new Exception();
                        }
                        CITY_ID = Integer.parseInt(id);
                    } catch (Exception e) {
                        System.out.println("Not a valid id! Enter another.");
                        logger.error("Entered wrong input.", e);
                    }
                }
            }
            // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.ipma.pt/open-data/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            // create a typed interface to use the remote API (a client)
            IpmaService service = retrofit.create(IpmaService.class);
            // prepare the call to remote endpoint
            Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID);
            try {
                Response<IpmaCityForecast> apiResponse = callSync.execute();
                IpmaCityForecast forecast = apiResponse.body();

                if (forecast != null) {
                    var firstDay = forecast.getData().listIterator().next();
                    var date = firstDay.getForecastDate();
                    var maxTemp = Double.parseDouble(firstDay.getTMax());
                    var minTemp = Double.parseDouble(firstDay.getTMin());
                    var precipitation = Double.parseDouble(firstDay.getPrecipitaProb());

                    System.out.printf("For the city with code %d, in %s:\nMaximum temperature: %4.1f°C;\nMinimum temperature: %4.1f°C;\nPrecipitation probability: %3.1f%%.\n",
                            CITY_ID,
                            date,
                            maxTemp,
                            minTemp,
                            precipitation);
                    logger.info(String.format("Got the forecast results for the city with id %d.", CITY_ID));
                } else {
                    System.out.println("No results for this request!");
                    logger.error(String.format("No results for the request with id %d.", CITY_ID), new NullPointerException("NullError"));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                logger.debug("Program exited with internal error.");
            }
        }
    }
}
