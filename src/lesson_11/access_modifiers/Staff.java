package lesson_11.access_modifiers;

public class Staff {

    private void pri(){
        System.out.println("this is private method");
    }

    void def(){
        System.out.println("this is default method");
    }

    protected void pro(){
        System.out.println("this is protected method");
    }

    public void pub(){
        System.out.println("this is public method");
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.pri();
        staff.def();
        staff.pro();
        staff.pub();
    }
}
