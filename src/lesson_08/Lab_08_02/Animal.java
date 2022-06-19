package lesson_08.Lab_08_02;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    int speed;
    String name;

    public static List<Animal> animals = new ArrayList<>();

    public Animal() {
        animals.add(this);
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
