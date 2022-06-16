package lesson_08;

public class ConGauCon extends ConGau {

    //Static block
    static {
        name = "gau con";
    }
    public static void main(String[] args) {
        ConGau conGauCon = new ConGauCon();
        System.out.println(conGauCon.name);
    }
}
