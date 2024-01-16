public class Car extends Vehicle implements Rentable {
    private boolean rented;

    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
        this.rented = false;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void rent() {
        rented = true;
        System.out.println("Car rented successfully.");
    }

    @Override
    public void returnVehicle() {
        rented = false;
        System.out.println("Car returned successfully.");
    }

    public boolean isRented() {
        return rented;
    }
}