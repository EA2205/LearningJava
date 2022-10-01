package Course3Sprint4;

public class BookImpl {
    public static void main(String[] args) {
        Author a = new Author("chetan", "cello");
        Book b1 = new Book(123, "c++", a, 50.67f);
        Book b2 = new Book(456, "java", a, 40.63f);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("********************************");
        b1.displayAuthorDetailsinBookclass(a);

    }
}

