package lesson_12.strategy_design_pattern;

public class Duck {

    protected QuackBehaviour quackBehaviour;

    protected void performQuack(){
        quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}
