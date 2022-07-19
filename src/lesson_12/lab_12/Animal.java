package lesson_12.lab_12;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private int flySpeed;
    private int swimSpeed;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;

    public static List<Animal> animals = new ArrayList<>();

    public Animal() {
        animals.add(this);
        flyBehaviour = new UnFlyAble();
        swimBehaviour = new UnSwimAble();
    }

    public String getName() {
        return name;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public boolean getFlyBehaviour() {
        return flyBehaviour.fly();
    }

    public boolean getSwimBehaviour() {
        return swimBehaviour.swim();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + flySpeed +
                ", flyBehaviour=" + flyBehaviour.fly() +
                ", flyBehaviour=" + swimBehaviour.swim() +
                '}';
    }
}
