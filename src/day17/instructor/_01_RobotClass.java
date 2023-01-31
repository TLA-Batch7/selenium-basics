package day17.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class _01_RobotClass {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/files");

        Actions actions = new Actions(driver);

        //Robot Class - Drag and drop

        //to move mouse


        //to click mouse button and hold


        //to move to destination location


        //release mouse button


        Thread.sleep(3000);
        driver.close();

        // ClassTask 1
    }


}
