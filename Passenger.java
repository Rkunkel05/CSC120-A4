import java.util.ArrayList;

public class Passenger {
    
    public String name;
    private Car car;

    // Constructor for Passenger
    public Passenger(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    // Checks if there is room in addPassenger class (true = room, false = no room)
    public void boardCar() {
        if (car.addPassenger(name) == true) {
            System.out.println(name + " has boarded the train");
        }

        else {
            System.out.println("There is no room!");
        }
    }

    // Checks if the car has more than 0 passengers and if the name is in the list. 
    public void getOffCar() {
        if (car.removePassenger(name) == true) {
            System.out.println(name + " has left the train!");
        }

        else {
            System.out.println("Passenger not found or there is no one on board!");
        }
    }
}
