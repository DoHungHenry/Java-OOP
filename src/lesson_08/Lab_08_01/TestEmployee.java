package lesson_08.Lab_08_01;

public class TestEmployee {

    public static void main(String[] args) {

        Employee Mary = new FullTimeEmployee();
        Employee Harry = new FullTimeEmployee();
        Employee Martinez = new FullTimeEmployee();
        Employee Olivia = new ContractEmployee();
        Employee Mia = new ContractEmployee();

        System.out.println(Mary);
        System.out.println(Harry);
        System.out.println(Martinez);
        System.out.println(Olivia);
        System.out.println(Mia);

        EmployeesController employeesController = new EmployeesController();
        System.out.println(employeesController.employeesTotalSalary());
    }
}
