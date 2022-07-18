package lesson_11.comparable;

import java.util.Collections;

import static lesson_11.comparable.Employee.employees;

public class SortEmployeeBySalary {

    public static void main(String[] args) {

        Employee A = new Employee("A", 13);
        Employee B = new Employee("B", 11);
        Employee C = new Employee("C", 12);

        System.out.println(employees);

        Collections.sort(employees);
        System.out.println(employees);
    }
}
