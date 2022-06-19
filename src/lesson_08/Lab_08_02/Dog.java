package lesson_08.Lab_08_02;

import java.security.SecureRandom;

public class Dog extends Animal {

    private final int DOG_MAX_SPEED = 60;
    private int dogSpeed;

    public Dog() {
        this.dogSpeed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.dogSpeed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogSpeed=" + dogSpeed +
                '}';
    }
}
