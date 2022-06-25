package lesson_10.lab_10;

import java.util.ArrayList;
import java.util.List;

public abstract class Horse {

    protected String name;
    public static List<Horse> horses = new ArrayList<>();

    public Horse() {
        horses.add(this);
    }

    public Horse(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract int getSpeed();
}
