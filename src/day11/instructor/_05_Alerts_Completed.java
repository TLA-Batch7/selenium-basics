package day11.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Alerts_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //NOTE: Follow README file first

        //Example: Add apple, Eat apple etc.



        //NOTE: ClassTask3

        Thread.sleep(3000);
        driver.close();

    }
}
