abstract class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // average fuel consumption in liters per 100 km
    abstract double calculateFuelEfficiency();
}
