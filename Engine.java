// Make engine
public class Engine {
    // Define variables
    // Private because it doesn't need to be altered 
    private double maxFuel = 100;
    private String FuelType;
    public Engine(String FuelType, int maxFuel) {
        this.FuelType = FuelType;
        this.maxFuel = maxFuel;
    }

    // Checks if fuel > 0, train goes. If 0, train can't go
    public boolean go(int fuel) {
        if (fuel > 0) {
            fuel = fuel - 10;
            return true;
        } else {
            return false;
        }
    }

    // Prints the amount of fuel
    public void fuelAmt(int Fuel) {
        System.out.println(Fuel);
    }

    // FUEL:
    // Define type of fuel used
    // Define max fuel value
    // Function to check the current fuel level
    // Refuel() - Reset fuel level -> Max
    // Go() - Decrease fuel level + return true if fuel > 0, and false if fuel<0

    // CONSTRUCTOR:
    // Defines variables (:

    public static void main(String[] args) {
        import CSC120.FuelType;
        Engine myEngine = new Engine(FuelType.ELECTRIC,100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}

