package lesson_08.Lab_08_02;

import static lesson_08.Lab_08_02.Animal.animals;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal horseA = new Horse();
        Animal dogA = new Dog();
        Animal tigerA = new Tiger();
        Animal horseB = new Horse();
        Animal dogB = new Dog();
        Animal tigerB = new Tiger();

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        AnimalController animalController = new AnimalController();
        animalController.findFastestAnimal();
    }
}
