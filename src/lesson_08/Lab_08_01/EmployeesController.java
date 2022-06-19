package lesson_08.Lab_08_01;

import static lesson_08.Lab_08_01.Employee.employees;

public class EmployeesController {

    public static int employeesTotalSalary() {
        int employeesTotalSalary = 0;
        for (Employee employee : employees) {
            employeesTotalSalary = employeesTotalSalary + employee.getSalary();
        }
        return employeesTotalSalary;
    }
}
