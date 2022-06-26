package lesson_11.access_modifiers_external;

import lesson_11.access_modifiers.Staff;

public class Manager {
    public static void main(String[] args) {
        Staff staff = new Staff();
        // can't access
        // staff.pri();
        // staff.def();
        // staff.pro():
        staff.pub();
    }
}
