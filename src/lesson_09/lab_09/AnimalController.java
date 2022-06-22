package lesson_09.lab_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public List<Animal> noWingAnimals(List<Animal> animalList) {
        List<Animal> noWingAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                noWingAnimals.add(animal);
            }
        }
        return noWingAnimals;
    }

    public void fastestNoWingAnimal(List<Animal> animals) {
        Animal animal = animals.get(0);
        for (Animal animal1 : animals) {
            if (animal.getSpeed() < animal1.getSpeed()) {
                animal = animal1;
            }
        }
        System.out.println("Winner is: " + animal.getName() + " with speed is: " + animal.getSpeed());
    }
}
