package lesson_08.Lab_08_02;

import java.util.Comparator;

import static lesson_08.Lab_08_02.Animal.animals;

public class AnimalController {
    public void findFastestAnimal(){
        Animal fastestAnimal = animals.stream().max(Comparator.comparingInt(Animal::getSpeed)).get();
        System.out.println("Winner is: " + fastestAnimal.getName() + " with speed is: " + fastestAnimal.getSpeed());
    }
}
