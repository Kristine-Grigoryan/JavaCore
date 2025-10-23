package library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookByMaxPrice() {

        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deletByIndexs(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid book!");
            return;
        }
                for (int i = index+1; i < size; i++) {
                    books[i] = books[i - 1];
                }
                size--;

            }
        }






