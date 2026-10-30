public class Movie extends Content {
    private int minutes;
    
    public Movie(String t, int min) {
        super(t);
        minutes = min;
        System.out.println("Movie(String, int): runtime set to " + minutes + " minutes");
    }

    public Movie(String t) {
        this(t, 120);
        System.out.println("Movie(String): default runtime applied");
    }

    public void play() {
        System.out.println("Now playing: " + title + " (" + minutes + " min)");
    }
}