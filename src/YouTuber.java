class YouTuber extends Creator {
    int views;
    YouTuber(String name, int views) {
        super(name);
        this.views = views;
    }
    double calculateEarnings() {
        return views * 0.01;
    }
}