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

//As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Creates a list that stores the passangers
    private List < String > onBoard = new ArrayList < > ();
    // Set the maximum capacity as 20
    public int maxCapacity = 20;

    // Creates 20 slots for passangers in the liist
    for (int i : maxCapacity) {
        onBoard.add(" ");
    }

    // Prints how many available spots there are
    public class getCapacity {
        // prints the maxCapacity
        public void printMaxCapacity(int maxCapacity) {
            System.out.println(maxCapacity); } 
    }
    public class seatsRemaining {
        
    }
}

