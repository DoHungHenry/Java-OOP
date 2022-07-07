package lesson_11.has_a_relationship;

import java.security.SecureRandom;

public class Duck extends Animal implements IFlyAble, ISwimAble {

    private String name;
    private int duckSpeed;
    private final int DUCK_MAX_SPEED = 30;

    public Duck(String name) {
        this.name = name;
        this.duckSpeed = new SecureRandom().nextInt(DUCK_MAX_SPEED);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.duckSpeed;
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }

    @Override
    public boolean isSwimAble() {
        return true;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", duckSpeed=" + duckSpeed +
                '}';
    }
}
