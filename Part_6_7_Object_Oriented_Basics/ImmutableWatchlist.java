import java.util.*;

final class Watchlist {
    private final String owner;
    private final List<String> titles;

    Watchlist(String owner, List<String> titles) {
        this.owner = owner;
        this.titles = new ArrayList<>(titles);
    }

    int count() { return titles.size(); }
    String title(int index) { return titles.get(index); }
    String owner() { return owner; }
}

public class ImmutableWatchlist {
    public static void main(String[] args) {
        List<String> picks = new ArrayList<>();
        picks.add("Dune");
        picks.add("Arrival");
        Watchlist sam = new Watchlist("Sam", picks);
        System.out.println(sam.owner() + ": " + sam.count() + " titles, first = " + sam.title(0));
        picks.clear();
        picks.add("Barbie");
        System.out.println(sam.owner() + ": " + sam.count() + " titles, first = " + sam.title(0));
    }
}
