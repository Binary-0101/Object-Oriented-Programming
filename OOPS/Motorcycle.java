
// Motorcycle.java
public class Motorcycle extends Vehicle implements Rentable {
    private boolean rented;

    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
        this.rented = false;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void rent() {
        rented = true;
        System.out.println("Motorcycle rented successfully.");
    }

    @Override
    public void returnVehicle() {
        rented = false;
        System.out.println("Motorcycle returned successfully.");
    }

    public boolean isRented() {
        return rented;
    }
}