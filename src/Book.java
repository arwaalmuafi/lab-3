import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> reviews;

    Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setStock(int quantityInStock) {
        this.stock = quantityInStock;
    }

    public int getStock() {
        return stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
        System.out.println("Added review: " + review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0;
        }
        double totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        return totalRating / reviews.size();
    }

    public void purchase(User user) {
        if (stock > 0) {
            stock--;
            user.addToPurchased(this);
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocked " + getTitle() + " by " + quantity + " units. Total stock: " + stock);
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return "Book Title: " + getTitle() + ", Price: " + getPrice() + ", Stock: " + stock + ", Average Rating: " + getAverageRating() + ", Type: " + getMediaType();
    }
}
