package lesson_08.Lab_08_01;

public class FullTimeEmployee extends Employee {
    private final int FULL_TIME_EMPLOYEE_SALARY = 50000;
    private int salary;

    public FullTimeEmployee() {
        this.salary = FULL_TIME_EMPLOYEE_SALARY;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "FULL_TIME_EMPLOYEE_SALARY=" + FULL_TIME_EMPLOYEE_SALARY +
                ", salary=" + salary +
                '}';
    }
}
