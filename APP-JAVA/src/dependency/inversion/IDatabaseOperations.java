package dependency.inversion;

public interface IDatabaseOperations {
    void executeQuery(String query);
    void poll();
    void dump();
}
