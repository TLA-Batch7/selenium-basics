package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/inputs");
        Actions actions = new Actions(driver);

        //selecting a text that was entered by a user (Ctrl + A command)
        WebElement inputField = driver.findElement(By.id("message"));
        inputField.sendKeys("Hello world");
        Thread.sleep(3000);

        //actions.doubleClick(inputField.click().perform();

        actions.keyDown(inputField, Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();

        //copy above selected text and paste in other place (Ctrl + C and Ctr + V commands)
        actions.keyDown(inputField, Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();

        WebElement inputFiel2 = driver.findElement(By.id("a"));

        actions.keyDown(inputFiel2, Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();


        /**
         * Reading tooltips:
         * Tooltips with attribute values
         *  - With "title" attribute (youtube.com)
         *  - With "data-tip" attribute on Action-class page
         */

        driver.findElement(By.linkText("Action-class")).click();
        WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']"));
        System.out.println(element.getAttribute("data-tip"));
        System.out.println(element.getText());

        //2. With hover over method





        //Class Task 1

        Thread.sleep(3000);
        driver.close();
    }
}
