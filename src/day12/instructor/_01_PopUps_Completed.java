package day12.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_PopUps_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/popup");

        //What is browser pop-ups? Pop-ups vs alerts?
        // Alert is a type of popup, but cannot be handled with inspect tool.
        // You must handle the alert using alert class
        // Normal Popups can be handled like usual with other webElements using the inspect tool

        //Example: Pop-Up page -> Message button
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("fake@email.com");
        driver.findElement(By.id("message-text")).sendKeys("This is my message!");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Send']")).click();

        driver.close();


        //Class Task 1
    }



}
