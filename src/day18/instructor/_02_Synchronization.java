package day18.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _02_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait goes here
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        //IMPLICITLY wait


        //EXPLICIT waits
        //1. wait for element to be present


        //2. wait for the alert to be displayed and then print out the text


        Thread.sleep(3000);
        driver.close();
    }
}
