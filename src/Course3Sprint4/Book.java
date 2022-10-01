package Course3Sprint4;

public class Book {
    // Implement data hiding by declaring member variables private
    private int ISBNNo;
    private String bookName;
    private Author author;
    private float price;

    // Declare getter and setter methods

    // Method to display the details of a book
    public Book(int ISBNNo, String bookName, Author author,float price) {

        this.ISBNNo = ISBNNo;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.author =author;
    }

    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int iSBNNo) {
        ISBNNo = iSBNNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBNNo=" + ISBNNo +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
    void displayAuthorDetailsinBookclass(Author obj)
    {
        System.out.println(obj.getAuthorName());
        System.out.println(obj.getAuthorPenName());
    }
}

