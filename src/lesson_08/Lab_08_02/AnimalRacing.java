package lesson_08.Lab_08_02;

import static lesson_08.Lab_08_02.Animal.animals;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal horseA = new Horse("Horse A");
        Animal dogA = new Dog("Dog A");
        Animal tigerA = new Tiger("Tiger A");
        Animal horseB = new Horse("Horse B");
        Animal dogB = new Dog("Dog B");
        Animal tigerB = new Tiger("Tiger B");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        AnimalController animalController = new AnimalController();
        animalController.findFastestAnimal();
    }
}
