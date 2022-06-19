package lesson_08.Lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private final int TIGER_MAX_SPEED = 100;
    private int tigerSpeed;
    private String tigerName;

    public Tiger(String tigerName) {
        this.tigerName = tigerName;
        this.tigerSpeed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.tigerSpeed;
    }

    @Override
    public String getName() {
        return this.tigerName;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "tigerName='" + tigerName +
                ", tigerSpeed=" + tigerSpeed + '\'' +
                '}';
    }
}
