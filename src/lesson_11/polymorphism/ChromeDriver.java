package lesson_11.polymorphism;

public class ChromeDriver extends WebDriver {
    @Override
    protected void initWebDriver() {
        System.out.println("this is chrome");
    }
}
