import java.util.ArrayList;
import java.util.List;

public class Car {
    // Creates a list that stores the passangers
    private List<String> onBoard;
    // Set the maximum capacity as 20
    public int maxCapacity = 20;
    public int Capacity = maxCapacity;
    int size = onBoard.size();

    // Makes car?
    public Car(List<String> onBoard, int maxCapacity) {
        this.onBoard = onBoard;
        this.maxCapacity = maxCapacity;
        this.size = onBoard.size();
        }

    // Adds a passenger to the list onBoard
    public boolean addPassenger(String Passenger) {
        if (size < maxCapacity) { 
            onBoard.add(Passenger);
            Capacity -= 1;
            return true;
        }
        else {
            System.out.println("There is no room!");
            return false;
        }
    }

    public boolean removePassenger(String Passenger) {
        if (size > 0) {
            onBoard.remove(Passenger);
            Capacity += 1;
            return true;
        }
        else {
            System.out.println("There is no one on board!");
            return false;
        }
    }

    public void printManifest() {
        if (size > 0) {
            for (String passenger : onBoard) {
                System.out.println(passenger);
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
    }

    // Returns the maximum capacity 
    public void getCapacity() {
        System.out.println("Maximum capacity: " + Capacity);
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