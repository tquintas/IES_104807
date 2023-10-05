package ua.tquintas;

import weather.IpmaApiClient;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    Toolkit toolkit;//j  av  a2  s .  c o m
    int[] city_ids = {1010500, 1020500, 1030300, 1030800,
            1040200, 1050200, 1060300, 1070500, 1080500,
            1081505, 1081100, 1080800, 1090700, 1090821,
            1100900, 1110600, 1121400, 1131200, 1141600,
            1151200, 1151300, 1160900, 1171400, 1182300,
            2310300, 2320100, 3410100, 3420300, 3430100,
            3440100, 3450200, 3460200, 3470100, 3480200, 3490100};
    Timer timer;

    public App() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(), 0, //initial delay
                20 * 1000); //subsequent rate
    }

    class RemindTask extends TimerTask {
        int maxCities = 10;
        Random random = new Random();
        public void run() {
            logger.debug("Starting");
            if (maxCities-- > 0) {
                int randomIndex = random.nextInt(city_ids.length);
                int city_id = city_ids[randomIndex];
                try {
                    IpmaApiClient ipmaApiClient = new IpmaApiClient(city_id);
                    logger.info("Got city forecast:\n"+ipmaApiClient.RequestForecast());
                } catch (Exception e)
                {
                    logger.error("Error found: "+e.getMessage(), e);
                    e.printStackTrace();
                }
            } else {
                logger.debug("Exited with status: 0");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args)
    {
        new App();
    }
}
