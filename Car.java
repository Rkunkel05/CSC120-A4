import java.util.ArrayList;
import java.util.List;

public class Car {
    // Creates a list that stores the passengers
    private List<String> onBoard;
    // Sets the maximum capacity as 20
    public int maxCapacity = 20;

    // Constructor
    public Car(List<String> onBoard, int maxCapacity) {
        this.onBoard = onBoard;
        this.maxCapacity = maxCapacity;
    }

    // Adds a passenger to the list onBoard, otherwise prints error
    public boolean addPassenger(String passenger) {
        if (onBoard.size() < maxCapacity) { 
            onBoard.add(passenger);
                return true;
            }
        
        else {
            return false;
        }
    }
    
    // Checks if there is more than 0 passengers and if the select passenger is on board. Removes them or prints an error
    public boolean removePassenger(String passengerName) {
        for (String passenger : onBoard) {
            if (passenger.equals(passengerName)) {
                onBoard.remove(passenger);
                return true;
            }
            }
        return false;
        } 

    // Prints a list of all passengers on board or prints an error
    public void printManifest() {
        if (onBoard.size() > 0) {
            for (String passenger : onBoard) {
                System.out.println(passenger);
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
    }

    // Prints the maximum amount of seats in the car
    public void getCapacity() {
        System.out.println("This car seats up to: " + (maxCapacity));
    }

    // Prints how many seats are left in the car
    public void seatsRemaining() {
        int remainingSeats = maxCapacity - onBoard.size();
        System.out.println("Seats remaining: " + remainingSeats);
    }

    public static void main(String[] args) {
        // Creates 1st car
        Car myCar1 = new Car(new ArrayList<>(), 20);
        myCar1.getCapacity(); 
        myCar1.seatsRemaining();

        // Adds passengers
        System.out.println("Adding passengers...");
        myCar1.addPassenger("Sasha");
        myCar1.addPassenger("Paul");
        System.out.println("The current manifest is:");
        myCar1.printManifest();
        myCar1.seatsRemaining(); 

        // Removes a passenger
        System.out.println("Removing passenger...");
        myCar1.removePassenger("Sasha");
        myCar1.seatsRemaining();
        System.out.println("The current manifest is:");
        myCar1.printManifest();
        myCar1.seatsRemaining();
    }
}