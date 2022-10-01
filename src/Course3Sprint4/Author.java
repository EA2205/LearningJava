package Course3Sprint4;

public class Author {
    // Implement data hiding by declaring member variables private
    private String authorName;
    private String authorPenName;

    public Author(String authorName, String authorPenName) {
        this.authorName=authorName;
        this.authorPenName=authorPenName;
    }
    //Declare getter and setter methods

    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorPenName() {
        return authorPenName;
    }
    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPenName='" + authorPenName + '\'' +
                '}';
    }
}
