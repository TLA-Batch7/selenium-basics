package day16.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class _02_ClassTask_Solved {
    /**
     *  Duration: 25min
     *  1. Navigate to url "https://jira.ivorreic.com/project/board"
     * 	2. Grab first Task under Backlog column and move to In Progress column
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jira.ivorreic.com/project/board");

        WebElement source = driver.findElement(By.xpath("//div[@class='sc-kPVwWT eYJELZ']"));
        WebElement target = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='inprogress']"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, target).perform();

        Thread.sleep(3000);
        driver.close();
    }
}
