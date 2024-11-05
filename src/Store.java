import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Store {
    private List<Media> mediaCatalog;
    private List<User> users;

    public Store() {
        this.mediaCatalog = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        users.forEach(System.out::println);
    }

    public void addMedia(Media media) {
        mediaCatalog.add(media);
    }

    public void displayMedias() {
        mediaCatalog.forEach(System.out::println);
    }

    public Book searchBook(String title) {
        for (Media media : mediaCatalog) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
    }
}