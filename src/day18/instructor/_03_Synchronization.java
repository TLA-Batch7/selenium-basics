package day18.instructor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Synchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        //fluent wait
    }



}
