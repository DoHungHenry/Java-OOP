package lesson_09.lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public static List<Animal> animalList = new ArrayList<>();

    protected Animal(Builder builder){
        animalList.add(this);
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}
