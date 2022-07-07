package lesson_11.has_a_relationship;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public void ContestWinner(List<Animal> animals){
        Animal animal = animals.get(0);
        for (Animal animal1 : animals) {
            if (animal.getSpeed() < animal1.getSpeed()){
                animal = animal1;
            }
        }
        System.out.println("Winner of Contest is: " + animal.getName() + " with speed is: " + animal.getSpeed());
    }

    public List<Animal> swimAbleAnimals(List<Animal> animals){
        List<Animal> list = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.isSwimAble()){
                list.add(animal);
            }
        }
        return list;
    }


    public List<Animal> flyAbleAnimals(List<Animal> animals){
        List<Animal> list = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.isFlyAble()){
                list.add(animal);
            }
        }
        return list;
    }
}
