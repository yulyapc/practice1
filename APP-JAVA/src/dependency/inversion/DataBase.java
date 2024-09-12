package dependency.inversion;

public final class DataBase {

    MySql database = new MySql();

    public void executeQuery(String query) {
        database.executeQuery(query);
    }

    public void dump() {
        System.out.println("database dump is not available");
    }

    public void poll() {
        System.out.println("database poll is not available");
    }
}
