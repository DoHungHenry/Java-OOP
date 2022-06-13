package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        Person teo = new Person("Teo", 30);

        List<Person> personList = new ArrayList<>();

        // (1) Refer to the same storage position
        personList.add(teo);
        personList.add(teo);

        // result: [Person{name='Teo', age=30}, Person{name='Teo', age=30}]
        System.out.println(personList);

        // (1) => result: [Person{name='ti', age=30}, Person{name='ti', age=30}]
        personList.get(1).setName("ti");
        System.out.println(personList);
    }
}
