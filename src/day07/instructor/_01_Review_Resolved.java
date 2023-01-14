package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review_Resolved {
    /**
     * basic selectors
     * css selectors:
     * id
     * class
     * tag + id
     * tag + class
     * tag + attribute
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/");

//        driver.findElement(By.cssSelector("#idValue")).click();
        System.out.println(driver.findElement(By.cssSelector("#title")).getText());

//        driver.findElement(By.cssSelector(".classValue")).click();
        System.out.println(driver.findElement(By.cssSelector(".header-text")).getText());

//        driver.findElement(By.cssSelector("tag[id='idValue']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[id='main-text']")).isDisplayed());

//        driver.findElement(By.cssSelector("tag[class='classValue']")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='text']")).isDisplayed());

//        driver.findElement(By.cssSelector("tag[name='attrValue']")).click();
        System.out.println(driver.findElement(By.cssSelector("a[href='https://phptravels.com/demo/']")).isDisplayed());

        System.out.println("--------");

        //We can omit tag name and use an asterisk if we don't care about what the tag name is
        System.out.println(driver.findElement(By.cssSelector("*[class='text']")).getText());

        driver.close();

    }
}
