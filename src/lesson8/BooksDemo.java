package lesson8;

public class BooksDemo {

    public static void main(String[] args) {
        Book book = new Book("girg 1",77.8,"Poxos");
        Book book1 = new Book("girg2",55,"Petros");
        Book book2 = new Book("girg1",77.8, "Poxos");


      System.out.println(book);
      System.out.println(book1);
      System.out.println(book2);
      System.out.println  ( book. equals(book2));
    }
}
