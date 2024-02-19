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
    public void addPassenger(String passenger) {
        if (onBoard.size() < maxCapacity) { 
            onBoard.add(passenger);
        } 
        else {
            System.out.println("There is no room!");
        }
    }

    // Checks if there is more than 0 passengers and if the select passenger is on board. Removes them or prints an error
    public boolean removePassenger(String passenger) {
        if (onBoard.size() > 0 || onBoard.contains(passenger)) {
            onBoard.remove(passenger);
            return true;
        } else {
            System.out.println("Passenger not found or there is no one on board!");
            return false;
        }
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

    // Returns the maximum amount of seats
    public void getCapacity() {
        System.out.println("This car seats up to: " + (maxCapacity));
    }

    // Returns how many seats are left
    public void seatsRemaining() {
        int remainingSeats = maxCapacity - onBoard.size();
        System.out.println("Seats remaining: " + remainingSeats);
    }


    public static void main(String[] args) {
        Car myCar = new Car(new ArrayList<>(), 20);
        myCar.getCapacity(); // Call the method using parentheses
        myCar.seatsRemaining(); // Call the method using parentheses
        System.out.println("Adding passengers...");
        myCar.addPassenger("Sasha");
        System.out.println("The current manifest is:");
        myCar.printManifest();
        myCar.seatsRemaining(); // Call the method using parentheses
        System.out.println("Passenger leaving car...");
        myCar.removePassenger("Sasha");
        myCar.seatsRemaining(); // Call the method using parentheses
        System.out.println("The current manifest is:");
        myCar.printManifest();
    }
}