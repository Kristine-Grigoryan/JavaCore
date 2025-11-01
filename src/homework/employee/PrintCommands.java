package homework.employee;

public interface PrintCommands {

    String EXIT = " 0 ";
    String ADD_EMPLOYEE = " 1";
    String PRINT_ALL_EMPOLYEE = " 2 ";
    String SEARCH_EMPOLYEE_BY_EMPOLYEE_ID = " 3";
    String SEARCH_EMPOLYEE_BY_COMPANY_NAME = " 4";


    static void printcommands() {
        System.out.println("Please input" + EXIT + "for EXIT");
        System.out.println("Please input" + ADD_EMPLOYEE + "for ADD EMPLOYEE");
        System.out.println("Please input" + PRINT_ALL_EMPOLYEE + "for PRINT ALL EMPOLYEE");
        System.out.println("Please input" + SEARCH_EMPOLYEE_BY_EMPOLYEE_ID + "for SEARCH EMPOLYEE BY EMPOLYEE ID");
        System.out.println("Please input" + SEARCH_EMPOLYEE_BY_COMPANY_NAME + "for SEARCH EMPOLYEE BY COMPANY NAME");
    }
}



