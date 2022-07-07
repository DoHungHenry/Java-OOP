package lesson_11.Comparable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {

    private String name;
    private int salary;

    public static List<Employee> employees = new ArrayList<>();

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        employees.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getSalary() - employee.getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
