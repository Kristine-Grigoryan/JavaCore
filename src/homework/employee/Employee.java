package homework.employee;

import java.util.Objects;

public class Employee {



    private String name;
    private String surname;
    private String empleeID;
    private int salary;
    private String companny;
    private String position;
    private String PositionLevel;
    public int length;;

    public Employee(String name, String surname, String empolyeeID, String companny, String position, int salary, String positionLevel) {
        PositionLevel = positionLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPositionLevel() {
        return PositionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        PositionLevel = positionLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmpleeID() {
        return empleeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", empleeID='" + empleeID + '\'' +
                ", salary=" + salary +
                ", companny='" + companny + '\'' +
                ", position='" + position + '\'' +
                ", PositionLevel='" + PositionLevel + '\'' +
                ", length=" + length +
                '}';
    }

    public void setEmpleeID(String empleeID) {
        this.empleeID = empleeID;
    }

    public String getCompanny() {
        return companny;
    }

    public void setCompanny(String companny) {
        this.companny = companny;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(empleeID, employee.empleeID) && Objects.equals(companny, employee.companny) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, empleeID, salary, companny, position);
    }

    public Employee(String name, String surname, String empolyeeID, String companny, String position, int salary) {
    }

    public Employee(String name, String surname, String empleeID, int salary, String companny, String position) {
        this.name = name;
        this.surname = surname;
        this.empleeID = empleeID;
        this.salary = salary;
        this.companny = companny;
        this.position = position;
        this.PositionLevel=PositionLevel;












    }
}
