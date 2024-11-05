public class AcademicBook extends Book {

    private String subject;


    public AcademicBook(String title, String auteur, String ISBN, double price, int Stock, String subject) {
        super(title, auteur, ISBN, price, Stock);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String toString() {
        return "AcademicBook{" + "subject='" + subject + '\'' + '}';
    }
}
