package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class _01_Homework_Resolved {
    /**
     *  URL: http://automation.techleadacademy.io/#/multiplewindow
     *  1. Print out texts of each button on the page (Launch TLA, Launch Google, Launch Facebook)
     *  2. Click on "Launch Facebook"
     *  3. Print out text "Connect with friend and the world..."
     *  4. Close facebook window
     *  5. Return to the main window
     *  7. Click on "Launch Google" button
     *  8. Print out title of the page
     *  9. Click on "Launch TLA"
     *  10. Print out text of navigation buttons
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/multiplewindow");



        Thread.sleep(3000);
        driver.quit();
    }
}
