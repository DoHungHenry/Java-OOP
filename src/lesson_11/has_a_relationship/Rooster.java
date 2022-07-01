package lesson_11.has_a_relationship;

import java.security.SecureRandom;

public class Rooster extends Animal {

    private String name;
    private int falconSpeed;
    private boolean flyAble = false;

    private final int ROOSTER_MAX_SPEED = 20;

    public Rooster(String name) {
        this.name = name;
        this.falconSpeed = new SecureRandom().nextInt(ROOSTER_MAX_SPEED);
    }
}
