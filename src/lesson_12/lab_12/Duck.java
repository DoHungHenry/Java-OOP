package lesson_12.lab_12;

import java.security.SecureRandom;

public class Duck extends Animal {

    private String name;
    private int flySpeed;
    private int swimSpeed;

    private final int DUCK_MAX_FLY_SPEED = 50;
    private final int DUCK_MAX_SWIM_SPEED = 30;

    public Duck(String name) {
        this.name = name;
        this.flySpeed = new SecureRandom().nextInt(DUCK_MAX_FLY_SPEED);
        this.swimSpeed = new SecureRandom().nextInt(DUCK_MAX_SWIM_SPEED);
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
    public boolean getFlyBehaviour() {
        return this.flyBehaviour.fly();
    }

    @Override
    public boolean getSwimBehaviour() {
        return this.swimBehaviour.swim();
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", flySpeed=" + flySpeed +
                ", swimSpeed=" + swimSpeed +
                ", flyBehaviour=" + flyBehaviour.fly() +
                ", swimBehaviour=" + swimBehaviour.swim() +
                '}';
    }
}
