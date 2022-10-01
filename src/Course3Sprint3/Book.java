package Course3Sprint3;

public class Book {

    String bookTitle;
    int ISBNNo;
    int yearOfPublication;

    public Book(String bookTitle, int ISBNNo, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.ISBNNo = ISBNNo;
        this.yearOfPublication = yearOfPublication;
    }

    public void display()
    {
        System.out.println("book title: " +bookTitle);
        System.out.println("ISBN No: " +ISBNNo);
        System.out.println("year of publication" +yearOfPublication);
    }
}


