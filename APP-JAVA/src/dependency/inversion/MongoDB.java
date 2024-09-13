package dependency.inversion;

public class MongoDB implements IDatabaseOperations {
    @Override
    public void executeQuery(String query) {
        // Implementación específica de MongoDB
        System.out.println("Ejecutando query en MongoDB: " + query);
    }

    @Override
    public void dump() {
        System.out.println("Backup de MongoDB realizado.");
    }

    @Override
    public void poll() {
        System.out.println("MongoDB poll realizado.");
    }
}
