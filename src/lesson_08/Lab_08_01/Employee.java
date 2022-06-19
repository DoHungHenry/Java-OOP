package lesson_08.Lab_08_01;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int salary;
    public static List<Employee> employees = new ArrayList<>();

    public Employee() {
        employees.add(this);
    }

    public int getSalary() {
        return salary;
    }
}
