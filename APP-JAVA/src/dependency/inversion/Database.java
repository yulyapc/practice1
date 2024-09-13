package dependency.inversion;

public final class Database {

    private IDatabaseOperations database;

    public Database(IDatabaseOperations database) {
        this.database = database;
    }

    public void executeQuery(String query) {
        database.executeQuery(query);
    }

    public void dump() {
        database.dump();
    }

    public void poll() {
        database.poll();
    }
}
