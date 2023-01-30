package day16.student;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ClassTask_Solved {
    /**
     * Complete by 10:30AM
     *  1. Copy "Hello! I am the parent iFrame" text using Actions class
     * 	2. In Shared notes:
     * 		Title = your name
     *      Note = paste copied text using Actions class
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/iframes");

        driver.switchTo().frame("parent-iframe");
        Actions actions = new Actions(driver);

        driver.findElement(By.id("iframe-text")).click();

        actions
                .click(driver.findElement(By.id("iframe-text")))
                .doubleClick()
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .perform();


        driver.switchTo().defaultContent();
        driver.switchTo().frame("note");

        driver.findElement(By.className("note-title")).sendKeys("Kuba");

        actions
                .keyDown(driver.findElement(By.className("note-textarea")), Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .perform();

        Thread.sleep(3000);

        driver.close();
    }
}
