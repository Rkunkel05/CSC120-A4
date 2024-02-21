// Make engine
public class Engine {
    private double maxFuel = 100;
    private double currentFuel = maxFuel;
    private String fuelType;

    public Engine(String fuelType, int maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
    }

    // If fuel > 0, the train goes. Else, print error.
    public boolean go() {
        if (currentFuel > 0) {
            currentFuel = currentFuel - 10;
            return true;
        } else {
            return false;
        }
    }

    // Prints the amount of fuel
    public void fuelAmt() {
        System.out.println(currentFuel);
    }

    // Resets fuel to max level
    public void Refuel() {
        currentFuel = maxFuel;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine("ELECTRIC", 100); // Pass an int for maxFuel

        while (myEngine.go()) { // Call go() method without any parameters
            System.out.println("Choo choo!");
            System.out.println("Fuel levels are at...");
            myEngine.fuelAmt();
        }

        System.out.println("Out of fuel.");
        System.out.println("Refueling..");
        myEngine.Refuel();
        System.out.println("Fuel levels are at...");
        myEngine.fuelAmt();
    }
}

