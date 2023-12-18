public class FictionBook extends Book {
    private String category;

    // Constructor
    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    // Getter and Setter methods
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}