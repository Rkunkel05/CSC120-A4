import java.util.ArrayList;
import java.util.List;

public class Train {
    private Engine engine;
    private List<Car> cars;
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;

    // Constructor for Train
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
    }

    // Adds cars to the train (list of cars)
    public void addCar(Car car) {
        cars.add(car);
    }

    // Gets details about the engine
    public Engine getEngine() {
        return engine;
    }

    // Gets details about a specific car
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            return null; // Invalid 
        }
    }

    // Gets the max capacity across all cars
    public int getMaxCapacity() {
        int maxCapacity = passengerCapacity * nCars;
        return maxCapacity;
    }

    // Gets the amount of seats remaining across all cars
    public int seatsRemaining() {
        int remainingSeats = 0;
        // for (Car car : cars) {
        //     remainingSeats += car.seatsRemaining();
        return remainingSeats;
        }

    // Prints a manifest of all passengers on board 
    public void printManifest() {
        for (Car car : cars) {
            car.printManifest();
        }

    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100, 3, 20);
        Engine engine = myTrain.getEngine();
        // System.out.println("This train uses a " + engine.getFuelType() + " engine."); 
    }
}


