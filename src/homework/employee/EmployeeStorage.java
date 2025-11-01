package homework.employee;

public class EmployeeStorage {


    private Employee[] employees = new Employee[10];
    private int size = 0;


    public void add(Employee employee) {
        if (size == employee.length) {
            extend();
        }
        employees[size++] = employee;

    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size ; i++) {
           if(employees[i].getEmpleeID().toLowerCase().contains(keyword.toLowerCase())){
               System.out.println(employees[i]);




           }

        }
    }

    }

