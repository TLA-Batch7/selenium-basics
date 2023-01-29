package day16.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ClassTask_Solved {
    /**
     *  1. Copy "Hello! I am the parent iFrame" text using Actions class
     * 	2. In Shared notes:
     * 		Title = your name
     *      Note = paste copied text using Actions class
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.close();
    }
}
