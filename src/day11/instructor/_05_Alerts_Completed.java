package day11.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Alerts_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //NOTE: Follow README file first

        driver.get("http://automation.techleadacademy.io/#/alert");

        //Click add apple and handle alert

        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        //Click second add button and handle alert by using send keys then accept
        driver.findElement(By.xpath("//button[@class='btn btn-outline-success']")).click();

        Alert alert2 = driver.switchTo().alert();
        alert.sendKeys("33");

        System.out.println(alert2.getText());
        alert2.accept();

        Thread.sleep(3000);

        //Click eat button and handle alert by canceling
        driver.findElement(By.xpath("//button[@class='btn btn-danger m-2']")).click();

        Alert alert3 = driver.switchTo().alert();
        alert3.dismiss();


        //NOTE: ClassTask3

        Thread.sleep(3000);
        driver.close();

    }
}
