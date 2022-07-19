package lesson_12.lab_12;

import java.security.SecureRandom;
import java.util.List;

public class Albatross extends Animal {

    private String name;
    private int flySpeed;
    private int swimSpeed;

    private final int ALBATROSS_MAX_FLY_SPEED = 100;
    private final int ALBATROSS_MAX_SWIM_SPEED = 100;

    public Albatross(String name) {
        this.name = name;
        this.flySpeed = new SecureRandom().nextInt(ALBATROSS_MAX_FLY_SPEED);
        this.swimSpeed = new SecureRandom().nextInt(ALBATROSS_MAX_SWIM_SPEED);
        flyBehaviour = new FlyAble();
        swimBehaviour = new SwimAble();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getFlySpeed() {
        return flySpeed;
    }

    @Override
    public int getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public boolean getSwimBehaviour() {
        return this.swimBehaviour.swim();
    }

    @Override
    public boolean getFlyBehaviour() {
        return this.flyBehaviour.fly();
    }

    @Override
    public String toString() {
        return "Albatross{" +
                "name='" + name + '\'' +
                ", flySpeed=" + flySpeed +
                ", swimSpeed=" + swimSpeed +
                ", flyBehaviour=" + flyBehaviour.fly() +
                ", swimBehaviour=" + swimBehaviour.swim() +
                '}';
    }
}
