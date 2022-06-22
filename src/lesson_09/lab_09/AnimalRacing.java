package lesson_09.lab_09;

import java.util.List;

import static lesson_09.lab_09.Animal.Builder;
import static lesson_09.lab_09.Animal.animalList;

public class AnimalRacing {

    public static void main(String[] args) {
        final int HORSE_MAX_SPEED = 80;
        final int TIGER_MAX_SPEED = 75;
        final int DOG_MAX_SPEED = 70;
        final int EAGLE_MAX_SPEED = 100;
        final int FALCON_MAX_SPEED = 110;

        Builder builder = new Builder();
        Animal HorseA = builder.setName("Horse A").setSpeed(HORSE_MAX_SPEED).setFlyable(false).build();
        Animal HorseB = builder.setName("Horse B").setSpeed(HORSE_MAX_SPEED).setFlyable(false).build();
        Animal TigerA = builder.setName("Tiger A").setSpeed(TIGER_MAX_SPEED).setFlyable(false).build();
        Animal TigerB = builder.setName("Tiger B").setSpeed(TIGER_MAX_SPEED).setFlyable(false).build();
        Animal DogA = builder.setName("Dog A").setSpeed(DOG_MAX_SPEED).setFlyable(false).build();
        Animal DogB = builder.setName("Dog B").setSpeed(DOG_MAX_SPEED).setFlyable(false).build();
        Animal EagleA = builder.setName("Eagle A").setSpeed(EAGLE_MAX_SPEED).setFlyable(true).build();
        Animal EagleB = builder.setName("Eagle B").setSpeed(EAGLE_MAX_SPEED).setFlyable(true).build();
        Animal FalconA = builder.setName("Falcon A").setSpeed(FALCON_MAX_SPEED).setFlyable(true).build();
        Animal FalconB = builder.setName("Falcon B").setSpeed(FALCON_MAX_SPEED).setFlyable(true).build();

        for (Animal animal : animalList) {
            System.out.println("All animal are" + animal);
        }
        System.out.println();

        AnimalController animalController = new AnimalController();
        List<Animal> noWingAnimals = animalController.noWingAnimals(animalList);
        animalController.fastestNoWingAnimal(noWingAnimals);
    }
}
