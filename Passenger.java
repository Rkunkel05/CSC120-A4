public class Passenger {
    
    private String name;

    // Constructor for Passenger
    public Passenger(String name) {
        this.name = name;
        private Car car;
    }

    // Checks if there is room in addPassenger class (true = room, false = no room)
    public void boardCar() {
        if (Car.addPassenger() == true) {
            onBoard.add(name);
        }

        else {
            System.out.println("There is no room!");
        }
    }

    // Checks if the car has more than 0 ppl and if the name is in the list. 
    public void getOffCar() {
        if (Car.removePassenger() == true) {
            onBoard.remove(name);
        }

        else {
            System.out.println("Passenger not found or there is no one on board!");
        }
    }

}