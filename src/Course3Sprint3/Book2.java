package Course3Sprint3;

public class Book2 {

    String bookTitle;
    int ISBNNo;
    int yearOfPublication;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void display()
    {
        System.out.println("book title: " +bookTitle);
        System.out.println("ISBN No: " +ISBNNo);
        System.out.println("year of publication: " + yearOfPublication);
    }
}
