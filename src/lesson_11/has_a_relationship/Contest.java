package lesson_11.has_a_relationship;

import static lesson_11.has_a_relationship.Animal.animals;

public class Contest {

    public static void main(String[] args) {

        Animal Duck1 = new Duck("Duck1");
        Animal Duck2 = new Duck("Duck2");
        Animal Rooster = new Rooster("Rooster");
        Animal Falcon1 = new Falcon("Falcon1");
        Animal Falcon2 = new Falcon("Falcon2");


        System.out.println(animals);

        AnimalController controller = new AnimalController();
        System.out.println("SwimContestWinner===");
        controller.ContestWinner(controller.swimAbleAnimals(animals));
        System.out.println("FlyContestWinner===");
        controller.ContestWinner(controller.flyAbleAnimals(animals));

    }
}
