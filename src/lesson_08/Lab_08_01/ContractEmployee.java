package lesson_08.Lab_08_01;

public class ContractEmployee extends Employee {
    private final int CONTRACT_EMPLOYEE_SALARY = 40000;
    private int salary;

    public ContractEmployee() {
        this.salary = CONTRACT_EMPLOYEE_SALARY;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "CONTRACT_EMPLOYEE_SALARY=" + CONTRACT_EMPLOYEE_SALARY +
                ", salary=" + salary +
                '}';
    }
}
