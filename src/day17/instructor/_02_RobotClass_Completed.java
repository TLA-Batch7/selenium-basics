package day17.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;


public class _02_RobotClass_Completed {
    //NOTE: ReadMe.md file
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/files");

        Actions actions = new Actions(driver);

        //Robot Class - uploading a file from computer
        //How to copy String path to your clipboard
        StringSelection path = new StringSelection("/Users/kuba/Desktop/Book1.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);


        actions.moveToElement(driver.findElement(By.id("exampleFormControlFile1"))).click().perform();

        //Mac OS -------
        //click shortcut to open search bar CMD+Shift+G
        Robot robot = new Robot();

        Thread.sleep(2000);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);


        //Pressing keys
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);

        //Release the keys
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        Thread.sleep(2000);

        //Click CMD + V
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);

        //Release CMD + V
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        Thread.sleep(2000);

        //Click and Release Enter Btn
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Click and Release Enter Btn 2nd time to close the window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(5000);
        driver.close();
    }


}
