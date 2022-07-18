package lesson_12.strategy_design_pattern;

public class Decoy extends Duck {

    public Decoy() {
        quackBehaviour = new Mute();
    }
}
