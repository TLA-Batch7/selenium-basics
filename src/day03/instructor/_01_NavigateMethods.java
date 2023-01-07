package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _01_NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver"); // <<--- update to correct path
        WebDriver driver = new ChromeDriver();

        //NAVIGATION METHODS. Refer to 1st image in README.md
        //1. Navigate to

        //2. Navigate back

        //3. Navigate refresh

        //2. navigate() vs get()


        driver.close();

        //NOTE: ClassTask1 after completing of this demo

    }
}
