// CreatorSystem.java – Part 2 standalone

abstract class Creator {
    String name;
    Creator(String name) { this.name = name; }
    abstract double calculateEarnings();
}

class YouTuber extends Creator {
    int views;
    YouTuber(String name, int views) {
        super(name);
        this.views = views;
    }
    double calculateEarnings() {
        return views * 0.01; // ₺ per view
    }
}

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

class Writer extends Creator {
    int articlesPublished;
    Writer(String name, int articlesPublished) {
        super(name);
        this.articlesPublished = articlesPublished;
    }
    double calculateEarnings() {
        return articlesPublished * 20;
    }
}

public class CreatorSystem {

    // Prints highest earner in the array
    static void printHighestEarning(Creator[] c) {
        if (c.length == 0) return;
        int max = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i].calculateEarnings() > c[max].calculateEarnings()) {
                max = i;
            }
        }
        System.out.println("Highest Earner: " + c[max].name + " -> " + c[max].calculateEarnings());
    }

    public static void main(String[] args) {
        Creator[] creators = {
            new YouTuber("Alice", 150_000),
            new Podcaster("Bob", 38.5),
            new Writer("Charlie", 12),
            new YouTuber("Diana", 500_000)
        };

        System.out.println("Creators and Earnings:");
        for (int i = 0; i < creators.length; i++) {
            Creator c = creators[i];
            System.out.println(c.name + " -> " + c.calculateEarnings());
        }

        printHighestEarning(creators);
    }
}
