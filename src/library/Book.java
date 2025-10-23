package library;

import java.util.Objects;

public class Book {

   private String  title;
   private String  authorName;
   private double price;


    public Book(double price, String authorName, String title) {
        this.price = price;
        this.authorName = authorName;
        this.title = title;
    }

    public Book(String bookTitle, String authorName, double price) {
    }

    public String getItle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }

    public void setTitle(String title){
        this. title = title;







    }
}
