package lesson_10.lab_10;

import java.util.ArrayList;
import java.util.List;

public abstract class Horse {

    protected String name;
    protected int speed;

    public static List<Horse> horses = new ArrayList<>();

    public Horse() {
        horses.add(this);
    }

    public Horse setName(String name) {
        this.name = name;
        return this;
    }

    public abstract int setSpeed();

    public abstract String getName();
    public abstract int getSpeed();
}
