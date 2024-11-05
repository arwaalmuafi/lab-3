import java.util.ArrayList;
import java.util.List;

public class Music extends Media {

    private String artist;

    Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(this.getAuteur()) && music != this) {
                playlist.add(music);
            }
        }
        return playlist;
    }

    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else return "Music";
    }

    public void listen(User user) {
        user.addToPurchased(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
