package lesson_12.lab_12;

import java.security.SecureRandom;

public class Falcon extends Animal {

    private String name;
    private int flySpeed;
    private final int FALCON_MAX_FLY_SPEED = 100;

    public Falcon(String name){
        this.name = name;
        this.flySpeed = new SecureRandom().nextInt(FALCON_MAX_FLY_SPEED);
        flyBehaviour = new FlyAble();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getFlySpeed() {
        return flySpeed;
    }

    @Override
    public boolean getFlyBehaviour() {
        return this.flyBehaviour.fly();
    }


    @Override
    public String toString() {
        return "Falcon{" +
                "name='" + name + '\'' +
                ", speed=" + flySpeed +
                ", flyBehaviour=" + flyBehaviour.fly() +
                '}';
    }
}
