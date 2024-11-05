import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        User user = new User("arwa", "arwa@example.com");
        User user2 = new User("rose", "rose@example.com");
        User user3 = new User("lily", "lily@examole.com");
        store.addUser(user);
        store.addUser(user2);
        store.addUser(user3);

        //___________________________________________________________________________
        Book book1 = new Book("The Great Gatsby", "lily", "iii988", 10.0, 5);
        Book book2 = new Book("The red hat girl", "lily", "iii988", 10.0, 5);
        Book book3 = new Book("The pink house", "lily", "iii988", 10.0, 5);
        Movie movie1 = new Movie("The wild robot", "idk", "99ijn", 15.0, 148);
        Movie movie2 = new Movie("Toy story", "idk", "99ijn", 15.0, 148);
        Movie movie3 = new Movie("Toy story 2", "idk", "99ijn", 15.0, 148);
        Music music1 = new Music("Die for me", "Chase Atlantic", "88833ii", 12.99, "Chase Atlantic");
        Music music2 = new Music("Into it", "Chase Atlantic", "998uu", 15.99, "Chase Atlantic");
        Music music3 = new Music("Swim", "Chase Atlantic", "923ii", 12.99, "Chase Atlantic");

        AcademicBook academicBook1 = new AcademicBook("Physics 101", "Dr. A. Scientist", "654987", 29.99, 7, "Physics");

        //___________________________________________________________________________
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(academicBook1);

        //_______________________________________________________________________________

        user.addToCart(music1);
        user.addToCart(book1);
        user.checkout();
        //___________________________________________________________________________
        user2.addToCart(music1);
        user2.addToCart(music2);
        user2.checkout();
        //___________________________________________________________________________
        user3.addToCart(movie3);
        user3.addToCart(movie2);
        user3.addToCart(music3);
        user3.checkout();

        //___________________________________________________________________________
        System.out.println("Available Media in Store:");
        store.displayMedias();
        System.out.println("___________________________________________________________________________");
        System.out.println("first User's Purchased Items:");
        for (Media media : user.getPurchasedMedia()) {
            System.out.println(media);
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("second User's Purchased Items:");
        for (Media media1 : user2.getPurchasedMedia()) {
            System.out.println(media1);
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("third User's Purchased Items:");
        for (Media media2 : user3.getPurchasedMedia()) {
            System.out.println(media2);
        }
        System.out.println("___________________________________________________________________________");
        book1.addReview(new Review("Bob", 5, "Great book!"));
        book1.addReview(new Review("Charlie", 4, "Good content."));

        System.out.println("Average rating for The Great Gatsby " + book1.getAverageRating());

        System.out.println("___________________________________________________________________________");

        Book foundBook = store.searchBook("The Great Gatsby");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("___________________________________________________________________________");
        System.out.println("\n" + user.getUserName() + "'s shopping cart:");
        for (Media item : user.getShoppingCart()) {
            System.out.println(item);
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("\n" + user2.getUserName() + "'s shopping cart:");
        for (Media item : user2.getShoppingCart()) {
            System.out.println(item);
        }

        System.out.println("___________________________________________________________________________");
        System.out.println("\n" + user3.getUserName() + "'s shopping cart:");
        for (Media item : user3.getShoppingCart()) {
            System.out.println(item);
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("Is '" + book1.getTitle() + "' a bestseller? " + book1.isBestseller());

        System.out.println("___________________________________________________________________________");

        System.out.println("\nRestocking '" + book1.getTitle() + "':");
        book1.restock(5);

        System.out.println("___________________________________________________________________________");
        System.out.println("\nSimilar movie recommendations for '" + movie1.getTitle() + "':");
        movie1.recommendSimilarMovies(List.of(movie1, movie2));
        System.out.println("___________________________________________________________________________");
        System.out.println("\nGenerating playlist for artist '" + music1.getTitle() + "':");
        music1.generatePlaylist(List.of(music1, music2));


    }
}
