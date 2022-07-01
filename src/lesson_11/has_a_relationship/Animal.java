package lesson_11.has_a_relationship;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private int speed;

    public static List<Animal> animals = new ArrayList<>();

    public Animal() {
        animals.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
