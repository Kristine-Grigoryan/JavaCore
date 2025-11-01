package homework.employee;



import java.util.Scanner;

import static homework.employee.PrintCommands.printcommands;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();


    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            printcommands();
            String command = scanner.nextLine();
            switch (command) {
                case "EXIT":
                    isRun = false;
                    break;
                case "ADD_EMPLOYEE":
                    addEmployee();
                    break;
                case "PRINT_ALL_EMPLOYEE":
                    System.out.println("Please found all employees");
                    break;
                case "SEARCH_EMPLOYEE_BY_EMPLOYEE_ID":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.search(keyword);
                    break;
                case "SEARCH_EMPOLYEE_BY_COMPANY_NAME":
                    System.out.println("Please found company name");
                    break;
                default:
            }


        }

    }


 




private static void addEmployee() {
        System.out.println("Please input empolyee's name");
        String name = scanner.nextLine();
        System.out.println("Please inut empolyee's surname");
        String surname= scanner.nextLine();
        System.out.println("Please input empolyee's  empolyeeID");
        String empolyeeID= scanner.nextLine();
        System.out.println(("Please input empolyee companny"));
        String companny = scanner.nextLine();
        System.out.println("Please input empolyee position");
        String position = scanner.nextLine();
        System.out.println("Please input empolyee salary");
        int salary = Integer.parseInt(scanner.nextLine());

       Employee employee =new Employee(name,surname,empolyeeID,companny,position,salary);
       employeeStorage.add(employee);
        System.out.println("Employee added succesfuuly!");


    }




}

