import java.util.List;

public class Novel extends Book {

    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int Stock, String genre) {
        super(title, auteur, ISBN, price, Stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String toString() {
        return "Novel{" + "genre='" + genre + '\'' + '}';
    }

}