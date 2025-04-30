public class driver{
    public static void printHighestEarning(Creator[] c) {
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
            System.out.println(c.name  + c.calculateEarnings());
        }

        printHighestEarning(creators);
    }
}
}