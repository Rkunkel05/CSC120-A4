// Next, we'll set to work on the `Car` class. The `Car` class will need:

 // - an `ArrayList` where it will store the `Passenger`s currently onboard, and an `int` for the `Car`'s maximum capacity (since `ArrayList`s will expand as we add objects, we'll need to manually limit their size)
//  - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
// - accessor-like methods `public int getCapacity()` 
// and `public int seatsRemaining()` that return the maximum capacity and remaining seats, 
// respectively- `addPassenger(Passenger p)` and `removePassenger(Passenger p)` 
// methods to add or remove a `Passenger` from the `Car` and return `True` if the operation was 
// successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available 
// if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to 
// remove them! If you encounter a problem, you should `return False`._)

// - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).

// As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Creates a list that stores the passangers
    private List < String > onBoard = new ArrayList < > ();
    // Set the maximum capacity as 20
    public int maxCapacity = 20;
    public int Capacity = maxCapacity;

    // Makes car?
    public Car(List < String > onBoard, int maxCapacity) {
        this.onBoard = onBoard;
        this.maxCapacity = maxCapacity;
        // Creates a certain amount of open spaces in the car
        int i = 0;
        while (i < maxCapacity) {
            onBoard.add(" "); 
            i += 1; }
    }

    // Adds a passenger to the list onBoard
    public boolean addPassenger(Passenger p) {
        if (onBoard < 20) { 
            onBoard.add(Passenger p);
            Capacity -= 1;
            return true;
        }
        else {
            System.out.println("There is no room!");
            return false;
        }
    }

    public boolean removePassenger(Passenger p) {
        if (onBoard > 0) {
            onboard.remove(Passenger p);
            Capacity += 1;
            return true;
        }
        else {
            System.out.println("There is no one on board!");
            return false;
        }
    }

    public void printManifest() {
        public String passenger;
        if onBoard > 0 {
            for (passenger : onBoard); {
                System.out.println(passenger);
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }

    }

    // Returns the maximum capacity 
    public int getCapacity() {
        System.out.println(Capacity);
        return Capacity;
    }

    // Returns how many seats are left
    public int seatsRemaining() {
        System.out.println(seatsRemaining);
        return seatsRemaining;
    }


    public static void main(String[] args) {
        Car myCar = new Car(<>, 20);
        System.out.println("This car can hold", maxCapacity, "people");
        System.out.println("Adding passengers...");
        myCar.addPassenger("Sasha");
        System.out.println("The current manifest is:");
        myCar.printManifest();
        System.out.println("Passenger leaving train...");
        myCar.removePassenger("Sasha");
        System.out.println("The current manifest is:");
        myCar.printManifest();
    }
}