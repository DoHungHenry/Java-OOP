package lesson_11.has_a_relationship;

import java.security.SecureRandom;

public class Rooster extends Animal implements ISwimAble {

    private String name;
    private int roosterSpeed;

    private final int ROOSTER_MAX_SPEED = 20;

    public Rooster(String name) {
        this.name = name;
        this.roosterSpeed = new SecureRandom().nextInt(ROOSTER_MAX_SPEED);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.roosterSpeed;
    }

    @Override
    public boolean isFlyAble() {
        return super.isFlyAble();
    }

    @Override
    public boolean isSwimAble() {
        return super.isSwimAble();
    }

    @Override
    public String toString() {
        return "Rooster{" +
                "name='" + name + '\'' +
                ", roosterSpeed=" + roosterSpeed +
                '}';
    }
}
