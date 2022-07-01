package lesson_11.has_a_relationship;

import java.security.SecureRandom;

public class Falcon extends Animal implements IFlyAble {

    private String name;
    private int falconSpeed;
    private boolean flyAble = true;

    private final int FALCON_MAX_SPEED = 120;

    public Falcon(String name) {
        this.name = name;
        this.falconSpeed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }
}
