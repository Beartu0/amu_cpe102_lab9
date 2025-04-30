public class App {
    // Selection Sort 
    public static void sortByFuelEfficiency(Vehicle[] v) { 
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j].calculateFuelEfficiency() < v[min].calculateFuelEfficiency()) {
                    min = j;
                }
            }
            Vehicle temp = v[i];
            v[i] = v[min];
            v[min] = temp;
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 1.6),
            new Motorcycle("Honda", "CBR", false),
            new Truck("Volvo", "FH16", 18),
            new Car("BMW", "M3", 3.0)
        };

        sortByFuelEfficiency(vehicles);

        System.out.println("sorted");
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle v = vehicles[i];
            System.out.println(v.brand + " " + v.model + v.calculateFuelEfficiency());
        }
    }
}
