 public class StreamingCatalog {
        public static void main(String[] args) {

            Series dark = new Series();
            dark.title = "Dark";      // Content
            dark.seasons = 3;         // Series
            dark.play();              // Content
            System.out.println(dark.title + " has " + dark.seasons + " seasons");
            System.out.println(dark.toString()); // Object

            Movie inception = new Movie();
            inception.title = "Inception";
            inception.durationMinutes = 148;
            inception.play();

            Documentary ourPlanet = new Documentary();
            ourPlanet.title = "Our Planet";  // Content
            ourPlanet.durationMinutes = 50;  // Movie
            ourPlanet.topic = "Nature";      // Documentary
            ourPlanet.play();                // Content
            System.out.println(ourPlanet.title + " is about " 
            + ourPlanet.topic + " and lasts " + ourPlanet.durationMinutes + " minutes");
            System.out.println(ourPlanet.toString()); // Object
        }
    }