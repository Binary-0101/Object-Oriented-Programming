// RentalSystem.java
import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Rentable> availableVehicles;

    public RentalSystem() {
        this.availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Rentable vehicle) {
        availableVehicles.add(vehicle);
    }

    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Rentable vehicle : availableVehicles) {
            if (!((Vehicle) vehicle).isRented()) {
                System.out.println(((Vehicle) vehicle).getMake() + " " + ((Vehicle) vehicle).getModel());
            }
        }
    }

    public void rentVehicle(Rentable vehicle) {
        if (!((Vehicle) vehicle).isRented()) {
            vehicle.rent();
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    public void returnVehicle(Rentable vehicle) {
        if (((Vehicle) vehicle).isRented()) {
            vehicle.returnVehicle();
        } else {
            System.out.println("Vehicle is not currently rented.");
        }
    }

    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car car = new Car("Toyota", "Camry", 2022, "Gas");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, "Gas");
        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel");

        rentalSystem.addVehicle(car);
        rentalSystem.addVehicle(motorcycle);
        rentalSystem.addVehicle(truck);

        rentalSystem.displayAvailableVehicles();

        rentalSystem.rentVehicle(car);
        rentalSystem.rentVehicle(truck);

        rentalSystem.displayAvailableVehicles();

        rentalSystem.returnVehicle(car);
        rentalSystem.returnVehicle(truck);

        rentalSystem.displayAvailableVehicles();
    }
}
