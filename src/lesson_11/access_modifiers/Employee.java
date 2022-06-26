package lesson_11.access_modifiers;

public class Employee {

    public static void main(String[] args) {

        Staff staff = new Staff();
        // pri() can't access
        // staff.pri();
        staff.def();
        staff.pro();
        staff.pub();
    }
}
