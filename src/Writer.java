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