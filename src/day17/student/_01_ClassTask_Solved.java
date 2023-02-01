package day17.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class _01_ClassTask_Solved {
    /**
     *  Duration: 20min
     *  Execute following steps using Robot class
     *  1. Navigate to url "https://jira.ivorreic.com/project/board"
     * 	2. Grab first Task under Backlog column and move to In Progress column
     */

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jira.ivorreic.com/project/board");

        Thread.sleep(10000);

        Robot robot = new Robot();
        Thread.sleep(3000);


        robot.mouseMove(450, 400);

        //to activate the window
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(2000);


        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        robot.mouseMove(1170, 400);

        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Thread.sleep(3000);
        driver.close();
    }
}
