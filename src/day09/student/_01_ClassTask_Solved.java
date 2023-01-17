package day09.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_ClassTask_Solved {
    public static void main(String[] args) {
        /**
         * 1. navigate to http://automation.techleadacademy.io/#/
         * 2. print out all nav bar buttons
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/");



        driver.close();
    }
}
