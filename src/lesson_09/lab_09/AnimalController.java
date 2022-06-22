package lesson_09.lab_09;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<Animal> fastestNoWingAnimals(List<Animal> animals) {
        List<Animal> fastestNoWingAnimals = new ArrayList<>();
        List<Integer> noWingAnimalSpeeds = new ArrayList<>();
        for (Animal animal : animals) {
            noWingAnimalSpeeds.add(animal.getSpeed());
            Integer highestSpeed = Collections.max(noWingAnimalSpeeds);
            if (animal.getSpeed() == highestSpeed) {
                fastestNoWingAnimals.add(animal);
            }
            for (int i = 0; i < noWingAnimalSpeeds.size(); i++) {
                if (noWingAnimalSpeeds.get(i) < highestSpeed){
                    fastestNoWingAnimals.remove(animal);
                }
            }
        }
        System.out.println(noWingAnimalSpeeds);
        return fastestNoWingAnimals;
    }

    public void printWinner(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("Winner is: " + animal.getName() + " with speed is: " + animal.getSpeed());
        }
    }
}
