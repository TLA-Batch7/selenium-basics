package day14.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        Actions actions = new Actions(driver);

        //Hover over
        WebElement hoverOverBtn = driver.findElement(By.xpath("//button[contains(@class, 'btn-success')]"));
        actions.moveToElement(hoverOverBtn).perform();

        //Double click
        actions.doubleClick(driver.findElement(By.xpath("//button[contains(@class, 'btn-warning')]"))).perform();

        //Right click
        actions.contextClick().perform(); //=> opens context menu

        Thread.sleep(3000);

        actions.contextClick(driver.findElement(By.xpath("//button[contains(@class, 'btn-info')]"))).perform();


        //Class Task 2


        Thread.sleep(3000);
        driver.close();
    }
}
