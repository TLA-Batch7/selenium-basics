package day16.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/inputs");

        //Review and warm up practice

        //How to create a class
        Actions actions = new Actions(driver);

        //What methods is has



        //Class Task 1

        Thread.sleep(3000);
        driver.close();
    }
}
