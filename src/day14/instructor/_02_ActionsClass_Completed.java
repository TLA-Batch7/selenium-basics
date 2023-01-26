package day14.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        Actions actions = new Actions(driver);

        //Hover over


        //Double click


        //Right click


        //Class Task 1


        Thread.sleep(3000);
        driver.close();
    }
}
