package day14.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_iFrames_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/iframes");

        //access TLA website and print main text "Hello! I am the parent iFrame without switching
        //System.out.println(driver.findElement(By.id("iframe-text")).getText());

        //access parent iFrame and print text again with switching
//        driver.switchTo().frame("parent-iframe");
//        System.out.println(driver.findElement(By.id("iframe-text")).getText());

        //access child iFrame - budget calc
        //  input Transaction name and amount
//        driver.switchTo().frame("parent-iframe");
//        driver.switchTo().frame("budget-tracker");
//
//        driver.findElement(By.id("t-name")).sendKeys("Apple");
//        driver.findElement(By.id("t-amount")).sendKeys("5");

        //access child iFrame - wiki
        //  print listed languages

        driver.switchTo().frame("parent-iframe");
        driver.switchTo().frame("wiki");

        List<WebElement> ls = driver.findElements(By.xpath("//a/strong"));
        //ls.forEach(each -> System.out.println(each.getText()));

        //navigation from one iframe to another, child to parent, etc.
        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();


        Thread.sleep(3000);
        driver.close();

        //Class Task 1
    }
}
