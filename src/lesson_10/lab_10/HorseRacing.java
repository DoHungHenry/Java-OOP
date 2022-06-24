package lesson_10.lab_10;

import static lesson_10.lab_10.Horse.horses;

public class HorseRacing {

    public static void main(String[] args) {

        Horse horse1 = new BlackHorse().setName("horse1");
        Horse horse2 = new BrownHorse().setName("horse2");
        Horse horse3 = new WhiteHorse().setName("horse3");
        Horse horse4 = new BlackHorse().setName("horse4");
        Horse horse5 = new BrownHorse().setName("horse5");

        for (Horse hors : horses) {
            System.out.println(hors);
        }

        HorseController horseController = new HorseController();
        horseController.fastestHorse(horses);
    }
}
