public class Review {

    private String userName;
    private double rating;
    private String comment;

    Review(String userName, double rating, String comment){
        this.userName=userName;
        this.comment=comment;
        this.rating=rating;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Review by " + userName + ": Rating = " + rating + ", Comments = '" + comment + "'";
    }
}
