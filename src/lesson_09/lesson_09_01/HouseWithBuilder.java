package lesson_09.lesson_09_01;

import java.util.ArrayList;
import java.util.List;

public class HouseWithBuilder {

    private String color = "White";
    private int mainDoor = 1;
    private int window = 2;
    private String topRoofColor = "Gray";
    public static List<HouseWithBuilder> houseList = new ArrayList<>();

    //Disable the default contractor, protected: this protected not allow outside call this method, just children of it
    protected HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.mainDoor = builder.mainDoor;
        this.window = builder.window;
        this.topRoofColor = builder.topRoofColor;
        houseList.add(this);
    }

    // Read-only
    public String getColor() {
        return color;
    }

    public int getMainDoor() {
        return mainDoor;
    }

    public int getWindow() {
        return window;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    // Inner Class
    public static class Builder {
        private String color = "White";
        private int mainDoor = 1;
        private int window = 2;
        private String topRoofColor = "Gray";

        //Write-only

        public void setColor(String color) {
            this.color = color;
        }

        public void setMainDoor(int mainDoor) {
            this.mainDoor = mainDoor;
        }

        public void setWindow(int window) {
            this.window = window;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public HouseWithBuilder build(){
            //this = Builder
            // return Builder, then pass this Builder to protected constructor on above
            return new HouseWithBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", window=" + window +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }
}
