import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    private static Config config;

    public static Ads getAdsDao() {
        if (adsDao == null) {
//            adsDao = new ListAdsDao();
            config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
