abstract class Content {
    abstract String title();
    abstract int minutes();

    String summary() {
        return title() + ": " + minutes() + " min";
    }
}

class Movie extends Content {
    String title() { return "Inception"; }
    int minutes() { return 148; }
}

abstract class Series extends Content {
    abstract int episodes();
    int minutes() { return episodes() * 45; }
}

class MiniSeries extends Series {
    String title() { return "Chernobyl"; }
    int episodes() { return 5; }
}

public class AbstractCatalog {
    public static void main(String[] args) {
        Content movie = new Movie();
        System.out.println(movie.summary());
        Content show = new MiniSeries();
        System.out.println(show.summary());
    }
}
