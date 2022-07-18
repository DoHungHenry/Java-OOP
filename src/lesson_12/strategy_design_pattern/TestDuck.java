package lesson_12.strategy_design_pattern;

public class TestDuck {

    void performQuack(Duck duck){
        duck.performQuack();
    }

    public static void main(String[] args) {
        new TestDuck().performQuack(new BabyDuck());

        // change quack behaviour in runtime
        Decoy decoy = new Decoy();
        decoy.setQuackBehaviour(new Squeak());
        new TestDuck().performQuack(decoy);
        new TestDuck().performQuack(new MallardDuck());

    }
}
