package day15.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ClassTask_Solved {
    /**
     * 	1. Go to url: "https://etsy.com"
     * 	2. Print out tooltip "Cart".
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");

        WebElement cart = driver.findElement(By.xpath("//span[@role='tooltip']"));

        System.out.println("Text: |" + cart.getText() + "|");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Cart']"))).perform();
        
        Thread.sleep(2000);

        System.out.println("Text: |" + cart.getText() + "|");

        driver.close();
    }
}
