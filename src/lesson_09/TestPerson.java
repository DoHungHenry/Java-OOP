package lesson_09;

import static lesson_09.Person.personList;

public class TestPerson {

    public static void main(String[] args) {
        Person teo = new Person("Teo", 19);

        for (Person person : personList) {
            System.out.println(person);
        }
    }

}
