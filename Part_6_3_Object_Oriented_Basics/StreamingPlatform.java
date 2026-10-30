public class StreamingPlatform {
        public static void main(String[] args) {
            Movie dune = new Movie("Dune");
            dune.play();
            System.out.println("---");
            Movie oppenheimer = new Movie("Oppenheimer", 180);
            oppenheimer.play();
        }
    }