import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String email;
    private List<Media> purchasedMedia;
    private List<Media> shoppingCart;


    User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchasedMedia(List<Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Media> getPurchasedMedia() {
        return purchasedMedia;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        purchasedMedia.addAll(shoppingCart);
    }


    public void addToPurchased(Media media) {
        purchasedMedia.add(media);
    }
}



