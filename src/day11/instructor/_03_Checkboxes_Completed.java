package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Checkboxes_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");


        //section: "Check box"
        // Is where you can check more than one box. To uncheck you click the box again
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.id("defaultCheck3")).click();

        Thread.sleep(3000);

        //to uncheck
        driver.findElement(By.id("defaultCheck1")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("defaultCheck3")).click();
        Thread.sleep(3000);



        driver.close();

    }
}
