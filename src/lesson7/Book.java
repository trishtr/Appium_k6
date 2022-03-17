package lesson7;

public class Book {

    String ISBN;
    String title;
    String authorName;
    String year;

    public Book(String ISBN, String title, String authorName, String year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "lab7_1{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
