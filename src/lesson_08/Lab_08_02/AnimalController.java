package lesson_08.Lab_08_02;

import java.util.List;

public class AnimalController {

    public void findFastestAnimal(List<Animal> animalList){
        Animal animal = animalList.get(0);
        for (Animal a : animalList) {
            if (animal.getSpeed() < a.getSpeed()){
                animal = a;
            }
        }
        System.out.println("Winner is: " + animal.getName() + " with speed is: " + animal.getSpeed());
    }
}
