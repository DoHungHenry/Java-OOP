package lesson_10.lab_10;

import java.util.List;

public class HorseController {

    public void fastestHorse(List<Horse> horses){
        Horse horse = horses.get(0);
        for (Horse hor : horses) {
            if (horse.getSpeed() < hor.getSpeed()){
                horse = hor;
            }
        }
        System.out.println("Winner Horse is: " + horse.getName() + " , and its speed is: " + horse.getSpeed());
    }
}
