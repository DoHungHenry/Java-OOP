package lesson_11.polymorphism;

public class TestHuman {

    public static void main(String[] args) {

        Human baby = new Baby();
        baby = new Man();
        baby = new Woman();
    }
}
