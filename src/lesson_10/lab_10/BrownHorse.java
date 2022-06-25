package lesson_10.lab_10;

import java.security.SecureRandom;

public class BrownHorse extends Horse {

    private final int BROWN_HORSE_MAX_SPEED = 100;
    private int brownHorseSpeed;
    private String name;

    public BrownHorse(String name) {
        this.name = name;
        this.brownHorseSpeed = new SecureRandom().nextInt(BROWN_HORSE_MAX_SPEED);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.brownHorseSpeed;
    }

    @Override
    public String toString() {
        return "BrownHorse{" +
                "brownHorseSpeed=" + brownHorseSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
