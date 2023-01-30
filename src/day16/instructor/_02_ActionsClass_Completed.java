package day16.instructor;

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

        //Drag and Drop option with Actions class
        WebElement elementSource = driver.findElement(By.id("todo1"));
        WebElement targetLocation = driver.findElement(By.id("div1"));

        //actions.dragAndDrop(elementSource, targetLocation).perform();

        //actions.dragAndDropBy(elementSource, 20, 0).perform();
        actions.clickAndHold(elementSource).moveToElement(targetLocation).release(elementSource).perform();

        //Class Task 2

        Thread.sleep(3000);
        driver.close();
    }
}
