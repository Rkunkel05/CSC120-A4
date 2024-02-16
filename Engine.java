import FuelType;

// Make engine
public class Engine {
    // Define variables
    private int maxFuel = 100;
    private String FuelType;
    public Engine(String FuelType, int maxFuel) {
        this.FuelType = FuelType;
        this.maxFuel = maxFuel;
    }

    // Checks if fuel > 0, train goes. If 0, train can't go
    int Fuel = maxFuel;
    public boolean go(int startingFuel) {
        if (startingFuel > 0) {
            return true;
            Fuel = Fuel - 100;
        }
        else {
            return false;
        }
    }

    // Prints the amount of fuel
    public void fuelAmt(int Fuel, int startingFuel) {
        System.out.println(startingFuel);
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
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        int maxFuel = 100;
        while (myEngine.go(startingFuel)) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel."); 
    }
}

