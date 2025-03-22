package patterns.singleton;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection() {
        //Empty constructor
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
