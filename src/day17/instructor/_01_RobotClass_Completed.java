package day17.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;


public class _01_RobotClass_Completed {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        //Robot Class - Drag and drop
        Robot robot = new Robot();
        Thread.sleep(3000);

        //to move mouse
        robot.mouseMove(500, 745);
        Thread.sleep(3000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);
        //to click mouse button and hold
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //to move to destination location
        robot.mouseMove(900, 745);
        Thread.sleep(2000);

        //release mouse button
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);
        driver.close();

        // ClassTask 1
    }


}
