package lesson_10.lab_10;

import java.security.SecureRandom;

public class BlackHorse extends Horse {

    private final int BLACK_HORSE_MAX_SPEED = 100;
    private int blackHorseSpeed;
    private String name;

    public BlackHorse(String name) {
        this.name = name;
        this.blackHorseSpeed  = new SecureRandom().nextInt(BLACK_HORSE_MAX_SPEED);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.blackHorseSpeed;
    }

    @Override
    public String toString() {
        return "BlackHorse{" +
                "blackHorseSpeed=" + blackHorseSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
