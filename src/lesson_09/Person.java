package lesson_09;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    public static List<Person> personList = new ArrayList<>();

    public Person(String name, int age) {
        personList.add(this);
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age can't be negative or 0");
        }
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
