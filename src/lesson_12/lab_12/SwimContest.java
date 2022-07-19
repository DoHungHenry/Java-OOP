package lesson_12.lab_12;

import java.util.List;

import static lesson_12.lab_12.Animal.animals;

public class SwimContest {

    public static void main(String[] args) {

        Animal falcon1 = new Falcon("Falcon 1");
        Animal duck1 = new Duck("Duck 1");
        Animal rooster1 = new Rooster("Rooster 1");
        Animal albatross1 = new Albatross("Albatross 1");

        System.out.println("==Before==");
        System.out.println(animals);

        AnimalController animalController = new AnimalController();
        List<Animal> list = animalController.swimAbleAnimals(animals);

        System.out.println("==After==");
        System.out.println(list);

        animalController.fastestSwimAbleAnimal(list);
    }
}
