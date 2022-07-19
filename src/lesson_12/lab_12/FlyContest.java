package lesson_12.lab_12;

import java.util.List;

import static lesson_12.lab_12.Animal.animals;

public class FlyContest {

    public static void main(String[] args) {

        Animal falcon1 = new Falcon("Falcon 1");
        Animal falcon2 = new Falcon("Falcon 2");
        Animal duck1 = new Duck("Duck 1");
        Animal duck2 = new Duck("Duck 2");
        Animal rooster1 = new Rooster("Rooster 1");
        Animal rooster2 = new Rooster("Rooster 2");

        System.out.println("==Before==");
        System.out.println(animals);

        AnimalController animalController = new AnimalController();
        List<Animal> list = animalController.flyAbleAnimals(animals);

        System.out.println("==After==");
        System.out.println(list);

        animalController.fastestFlyAbleAnimal(list);
    }
}
