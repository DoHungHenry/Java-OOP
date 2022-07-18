package lesson_12.comparator;


import java.util.Collections;

import static lesson_12.comparator.Employee.employees;

public class TestEmployee {

    public static void main(String[] args) {

        Employee A = new Employee("CBi", 12);
        Employee B = new Employee("Ben", 7);
        Employee C = new Employee("ABeo", 9);

        System.out.println("Before----");
        System.out.println(employees);

        System.out.println("After sort by Age----");
        Collections.sort(employees, new EmployeeAgeComparator());
        System.out.println(employees);

        System.out.println("After sort by Name----");
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println(employees);
    }
}
