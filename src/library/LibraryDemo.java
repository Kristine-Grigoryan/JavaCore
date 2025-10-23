package library;
import java.  util.Scanner;
public class LibraryDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final  String  PRINT_ALL_BOOKS="2";
    private  static final String  SEACH_BOOK_BY_TITLE= "3";
    private static final String PRINT_EXPENSIVE_BOOKS="4";
    private static final  String ENTER_INDEX_TO_DELETE="5";
    private static final String ENTER_BOOK_QUANTITY= "6";

    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
           printComands();
            String command = scanner.nextLine();
            switch (command) {
                case "EXIT":
                    isRun = false;
                    break;
                case "ADD_BOOK":
                    addBook();
                    break;
                case "PRINT-ALL_BOOKS":
                    bookStorage.print();
                    break;
                case "SEARCH_BOOK-BY-TITLE":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case "PRINT_EXPENSIVE_BOOK":
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case"ENTER_INDEXS_TO_DELETE":
                    System.out.println("enter indexs to delete");
                    break;
                case"ENTER_BOOK-QUANTITY":
                    System.out.println("ENTER BOOK QUANTITY");
                    default:
                    System.err.println("Wrong command! try again");



            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
//                 Book book = new Book(bookTitle, authorName, price);
        Book book = new Book(bookTitle, authorName, price);
        book.setTitle(bookTitle);
        book.setPrice(price);
        book.setAuthorName(authorName);
        bookStorage.add(book);
        System.out.println("Book added successfully");

    }


    private static void printComands() {
        System.out.println("Please input "+EXIT+" for EXIT");
        System.out.println("Please input "+ADD_BOOK+" for ADD BOOK");
        System.out.println("Please input  "+PRINT_ALL_BOOKS+" for PRINT ALL BOOKS");
        System.out.println("Please  input "+SEACH_BOOK_BY_TITLE+" for SEACH BOOK BY TITLE");
        System.out.println("Please input  "+PRINT_EXPENSIVE_BOOKS+ " for PRINT EXPENSIVE BOOK");
        System.out.println("Please input "+ENTER_INDEX_TO_DELETE+"for ENTER INDEX TO DELETE");
        System.out.println("please input "+ENTER_BOOK_QUANTITY+"ENTER BOOK QUANTITY");
    }

}





