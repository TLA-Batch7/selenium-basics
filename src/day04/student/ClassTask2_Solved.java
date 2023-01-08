package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Input number a and number b
         * 2. Click Get Total button
         * 3. Verify if sum of 2 numbers are as expected
         */

        //Code 2 goes here...

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open automation practice web page
        driver.get("http://automation.techleadacademy.io/#/home");
        // Navigate to "Inputs" section of automation website directly
        driver.findElement(By.linkText("Inputs")).click();

        //1. Input number a and number b

        driver.findElement(By.id("a")).sendKeys("10");
        driver.findElement(By.id("b")).sendKeys("8");

        //2. Click Get Total button
        driver.findElement(By.name("button2")).click();
        Thread.sleep(3000);

        //3. Verify if sum of 2 numbers are as expected
        String expectedNumber = "18";
        String actualNumber = driver.findElement(By.name("answer2")).getText();

        if(actualNumber.equals(expectedNumber)){
            System.out.println("PASS: It is the correct sum");
        } else {
            System.out.println("FAIL: It is not the expected number");
        }

        driver.close();


    }
}
