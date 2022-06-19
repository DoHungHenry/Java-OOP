package lesson_08.Lab_08_02;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    int speed;

    public static List<Animal> animals = new ArrayList<>();

    public Animal() {
        animals.add(this);
    }

    public int getSpeed() {
        return speed;
    }
}
