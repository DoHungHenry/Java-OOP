package lesson_07;

import java.security.PublicKey;

public class RobotCat {

    private String name;

    //Default constructor if there isn't constructor in java class is defined
    public RobotCat(){

    }

    public RobotCat(String name){
        this.name = name; //class field sẽ bằng với param name truyền vào.
        System.out.println("Hello, my name is ".concat(this.name));
    }
}
