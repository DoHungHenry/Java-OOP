package lesson_07;

import java.security.PublicKey;

public class RobotCat {

    private String name;
    private String age;

    public RobotCat() {
    }

    public RobotCat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
