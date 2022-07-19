package lesson_12.lab_12;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public void fastestFlyAbleAnimal(List<Animal> animals){
        Animal animal = animals.get(0);
        for (Animal animal1 : animals) {
            if (animal.getFlySpeed() < animal1.getFlySpeed()){
                animal = animal1;
            }
        }
        System.out.println("Winner of Fly Contest is: " + animal.getName() + " , and its flying speed is: " + animal.getFlySpeed());
    }

    public List<Animal> flyAbleAnimals(List<Animal> animals){
        List<Animal> flyAbleAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getFlyBehaviour()){
                flyAbleAnimals.add(animal);
            }
        }
        return flyAbleAnimals;
    }

    public void fastestSwimAbleAnimal(List<Animal> animals){
        Animal animal = animals.get(0);
        for (Animal animal1 : animals) {
            if (animal.getSwimSpeed() < animal1.getSwimSpeed()){
                animal = animal1;
            }
        }
        System.out.println("Winner of Fly Contest is: " + animal.getName() + " , and its swimming speed is: " + animal.getSwimSpeed());
    }

    public List<Animal> swimAbleAnimals(List<Animal> animals){
        List<Animal> swimAbleAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getSwimBehaviour()){
                swimAbleAnimals.add(animal);
            }
        }
        return swimAbleAnimals;
    }
}
