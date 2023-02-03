package day18.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _02_Synchronization_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait goes here
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        //IMPLICITLY wait

        //EXPLICIT waits
        //1. wait for element to be present
//        driver.findElement(By.id("input-text")).sendKeys("Hello world!");
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Hello world!']")));
//        System.out.println(driver.findElement(By.xpath("//*[text()='Hello world!']")).isDisplayed());

        //2. wait for the alert to be displayed and then print out the text

        driver.findElement(By.xpath("//button[text()='Display alert']")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(3000);
        driver.close();
    }
}
