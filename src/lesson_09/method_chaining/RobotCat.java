package lesson_09.method_chaining;

import java.util.ArrayList;
import java.util.List;

public class RobotCat {
    private String name = "Robot Cat";
    private int age = 1;

    public static List<RobotCat> robotCatList = new ArrayList<>();

    protected RobotCat (Builder builder){
        robotCatList.add(this);
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Inner class
    public static class Builder {
        private String name = "Robot Cat";
        private int age = 1;

        // Method chaining: default of setter: not return value
        // make each setter return Builder
        // then we can call the method chaining when init new object based on this
        // RobotCat class
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public RobotCat build(){
            return new RobotCat(this);
        }
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
