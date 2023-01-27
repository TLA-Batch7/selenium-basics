package day14.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class _02_ClassTask_Solved {
    /**
     * 	1. Go to url: https://jira.ivorreic.com/project/board
     * 	2. Print out text "NOT IMPLEMENTED" of a button "Releases"
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jira.ivorreic.com/project/board");

        WebElement releasesBtn = driver.findElement(By.xpath("//div[text()='Releases']"));

        System.out.println(releasesBtn.getText());

        Actions actions = new Actions(driver);
        actions.moveToElement(releasesBtn).perform();

        System.out.println(driver.findElement(By.xpath("//div[@class='sc-lhVmIH cGkyhG']")).getText());

        driver.close();

    }
}
