class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }
    double calculateFuelEfficiency() {
        return hasSidecar ? 5.5 : 3.5;
    }
}
