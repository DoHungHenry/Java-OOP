package lesson_11.polymorphism;

public class TestDriver {

    public static void main(String[] args) {
        boolean isOnChrome = System.getenv("browser").equals("chrome");
        WebDriver webDriver;

        if (isOnChrome){
            webDriver = new ChromeDriver();
        } else {
            webDriver = new FirefoxDriver();
        }

        webDriver.initWebDriver();
    }
}
