package lesson_08.Lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal {

    private final int HORSE_MAX_SPEED = 75;
    private int horseSpeed;
    private String horseName;

    public Horse(String horseName) {
        this.horseName = horseName;
        this.horseSpeed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.horseSpeed;
    }

    @Override
    public String getName() {
        return this.horseName;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName +
                ", horseSpeed=" + horseSpeed + '\'' +
                '}';
    }
}
