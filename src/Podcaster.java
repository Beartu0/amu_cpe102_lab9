class Podcaster extends Creator {
    double hoursStreamed;
    Podcaster(String name, double hoursStreamed) {
        super(name);
        this.hoursStreamed = hoursStreamed;
    }
    double calculateEarnings() {
        return hoursStreamed * 15;
    }
}