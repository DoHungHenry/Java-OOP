package lesson_11.access_modifiers_external;

import lesson_11.access_modifiers.Staff;

public class SubStaff extends Staff {

    public static void main(String[] args) {

        SubStaff staff = new SubStaff();
        // staff.pri(); // can't access
        // staff.def(); // can't access

        staff.pro(); // this ok when staff is SubStaff, but if it's Staff, this can't be accessed: Staff staff = new SubStaff();

        // protected method can be accessed from
        staff.pub();
    }
}
