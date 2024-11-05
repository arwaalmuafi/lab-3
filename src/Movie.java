import java.util.List;

public class Movie extends Media {

    private int duration;

    Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;

    }

    public void watch(User user) {
        user.addToPurchased(this);
    }

    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie title : " + getTitle() + ", auteur: " + getAuteur() + ", price: " + getPrice() + ", Duration: " + duration + " minutes";
    }

    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        System.out.println("Movies by the same director (" + this.getAuteur() + "):");
        for (Movie movie : movieCatalog) {
            if (!movie.equals(this) && movie.getAuteur().equals(this.getAuteur())) {
                System.out.println("- " + movie.getTitle());
            }
        }
    }

}




