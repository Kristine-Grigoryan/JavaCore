package lesson8;

import java.util.Objects;

public class Book {

    public String title;

    public double price;
    public String authorName;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, authorName);
    }
    public Book(String title, double price, String authorName) {
        this.title = title;
        this.price = price;
        this.authorName = authorName;
 }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                '}';
    }
//        return price==book.price;
//    }
//
//        }

}