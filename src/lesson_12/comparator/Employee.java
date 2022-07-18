package lesson_12.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    public static List<Employee> employees = new ArrayList<>();

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        employees.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
