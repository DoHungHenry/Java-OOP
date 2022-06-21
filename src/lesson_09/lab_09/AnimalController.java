package lesson_09.lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnimalController {
    public List<Animal> noWingAnimal(List<Animal> animalList){
        List<Animal> noWingAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()){
                noWingAnimal.add(animal);
            }
        }
        return noWingAnimal;
    }

    public void fastestAnimal(List<Animal> animalList1){
        Animal fastestNoWingAnimal = animalList1.stream().max(Comparator.comparingInt(Animal::getSpeed)).get();
        System.out.println("Winner is: " + fastestNoWingAnimal.getName() + " with speed is: " + fastestNoWingAnimal.getSpeed());
    }
}
