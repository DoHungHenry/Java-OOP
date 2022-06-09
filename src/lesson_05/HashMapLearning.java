package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CS");
        emergencyList.put(114, "Cap cuu");
        emergencyList.put(115, "Cuu hoa");
        emergencyList.put(116, "116");
        emergencyList.put(117, "117");

        System.out.println(emergencyList.get(113));

        //handle ConcurrentModificationException
        for (int key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("116")) {
                emergencyList.remove(key);
            }
        }

        //Print map
        for (int i : emergencyList.keySet()) {
            System.out.println(emergencyList.get(i));
        }

        //Override 113 by other value
        //emergencyList.put(113, "CC");
        //System.out.println(emergencyList.get(113));

        //Replace the value of the key position when not know the current value of this key
        //emergencyList.replace(114, "Cap cuu abc");

        //Replace the value of the key position when not know the current value of this key,
        // if the old value incorrect, new value will not be added
        //emergencyList.replace(115, "x", "y");

        //Remove
        //emergencyList.remove(116);

        //emergencyList.remove(117, "117 edit"); // not run with value is not correct
    }
}
