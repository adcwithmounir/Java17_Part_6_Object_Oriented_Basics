class Content {
        static void log(String message) { System.out.println(message); }
        static { log("1. Content class loaded"); }
        { log("3. Content fields ready"); }
        Content() { log("4. Content built"); }
    }

class Movie extends Content {
    private final String title;    
    static { log("2. Movie class loaded"); }
    { log("5. Movie fields ready"); }
    Movie(String t) { title = t; log("6. Movie built: " + t); }
    }

public class StreamingCatalog {
        public static void main(String[] args) {
            System.out.println("Opening the catalog");
            Movie dune = new Movie("Dune");
            System.out.println("--- second movie ---");
            Movie arrival = new Movie("Arrival");
        }
    }