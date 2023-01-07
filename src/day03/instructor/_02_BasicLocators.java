package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

//NOTE: Refer to README.md first
public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        //locate by id
        String text = driver.findElement(By.id("title")).getText();
        System.out.println("Print title of home page: " + text);

        //locate by name
        System.out.println("Print paragraph under title:" + driver.findElement(By.name("paragraph")).getText());

        //locate by className
        System.out.println("Print footer of page: " + driver.findElement(By.className("row")).getText());

        //locate by tagName
        System.out.println("Print title using tagName: " + driver.findElement(By.tagName("h1")).getText());
        System.out.println(driver.findElement(By.tagName("a")).getText());

        //locate by linkText
        System.out.println("Print using linkTet:" + driver.findElement(By.linkText("Internet")).isDisplayed());

        //locate by partialLinkText
        //NOTE: It is case sensitive
        System.out.println("Print using partialLinkText:" + driver.findElement(By.partialLinkText("T")).getText());

        //locating by attribute
        //Example 1:
        System.out.println(driver.findElement(By.id("selenium-img")).getAttribute("src"));

        //Example 2:
        System.out.println(driver.findElement(By.linkText("PHP Travels")).getAttribute("href"));

        driver.close();

        //NOTE: ClassTask2 after competing of this demo

    }
}
