class Truck extends Vehicle {
    double loadCapacity; // tons
    Truck(String brand, String model, double loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }
    double calculateFuelEfficiency() {
        return 8 + 0.5 * loadCapacity;
    }
}
