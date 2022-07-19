package lesson_12.lab_12;

import java.security.SecureRandom;

public class Rooster extends Animal {

    private String name;
    private int runSpeed;

    private final int ROOSTER_MAX_RUN_SPEED = 15;

    public Rooster(String name){
        this.name = name;
        this.runSpeed = new SecureRandom().nextInt(ROOSTER_MAX_RUN_SPEED);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getFlySpeed() {
        return runSpeed;
    }


    @Override
    public boolean getFlyBehaviour() {
        return super.getFlyBehaviour();
    }

    @Override
    public boolean getSwimBehaviour() {
        return super.getSwimBehaviour();
    }

    @Override
    public String toString() {
        return "Rooster{" +
                "name='" + name + '\'' +
                ", runSpeed=" + runSpeed +
                ", flyBehaviour=" + flyBehaviour.fly() +
                ", swimBehaviour=" + swimBehaviour.swim() +
                '}';
    }
}
