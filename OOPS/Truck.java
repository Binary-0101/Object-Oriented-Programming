// Truck.java
 class Truck extends Vehicle implements Rentable {
    private boolean rented;

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
        this.rented = false;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }

    @Override
    public void rent() {
        rented = true;
        System.out.println("Truck rented successfully.");
    }

    @Override
    public void returnVehicle() {
        rented = false;
        System.out.println("Truck returned successfully.");
    }

    public boolean isRented() {
        return rented;
    }
}