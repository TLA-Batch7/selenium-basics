package day13.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //What is considered as multiple windows in selenium?

        //What is GUID (Global Unique Identifier) and how to locate it?
        driver.get("http://automation.techleadacademy.io/#/home");


        //Example: Home page -> sauce demo link texts -> print titles of the pages


        //How to return to the main page?


        //Example 2: Test title of page when you open "Internet" link


        //Difference between driver.close and driver.quit?



    }
}
