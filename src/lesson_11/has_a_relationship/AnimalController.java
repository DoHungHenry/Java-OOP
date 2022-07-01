package lesson_11.has_a_relationship;

public class AnimalController {

    public void winnerFly (IFlyAble iFlyAble){
        System.out.println(iFlyAble.isFlyAble());
    }
    public void winnerSwim (ISwimAble iSwimAble){
        System.out.println(iSwimAble.isSwimAble());
    }
}
