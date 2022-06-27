package lesson_11.polymorphism;

public class FirefoxDriver extends WebDriver {
    @Override
    protected void initWebDriver() {
        System.out.println("this is firefox");
    }
}
