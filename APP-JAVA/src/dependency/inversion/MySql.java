package dependency.inversion;

public class MySql implements IDatabaseOperations {
    @Override
    public void executeQuery(String query) {
        System.out.println("Ejecutando query en MySql: " + query);
    }

    @Override
    public void dump() {
        System.out.println("MySql dump realizado.");
    }

    @Override
    public void poll() {
        System.out.println("MySql poll realizado.");
    }
}
