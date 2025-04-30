class Car extends Vehicle {
    double engineSize; // liters
    Car(String brand, String model, double engineSize) {
        super(brand, model);
        this.engineSize = engineSize;
    }
    double calculateFuelEfficiency() {
        return 5 + engineSize;
    }
}