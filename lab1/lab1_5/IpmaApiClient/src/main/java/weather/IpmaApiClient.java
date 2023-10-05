package weather;

import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.ipma_client.IpmaCityForecast; //may need to adapt package name
import weather.ipma_client.IpmaService;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class IpmaApiClient {
    private final int CITY_ID;
    public IpmaApiClient(int city_id) throws IOException {
        CITY_ID = city_id;
    }
    public String RequestForecast() {
        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID);
        String message = "No results for this request!";
        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                var firstDay = forecast.getData().listIterator().next();
                var date = firstDay.getForecastDate();
                var maxTemp = Double.parseDouble(firstDay.getTMax());
                var minTemp = Double.parseDouble(firstDay.getTMin());
                var precipitation = Double.parseDouble(firstDay.getPrecipitaProb());

                message = String.format("For the city with code %d, in %s:\nMaximum temperature: %4.1f°C;\nMinimum temperature: %4.1f°C;\nPrecipitation probability: %3.1f%%.\n",
                        CITY_ID,
                        date,
                        maxTemp,
                        minTemp,
                        precipitation);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return message;
    }
}
