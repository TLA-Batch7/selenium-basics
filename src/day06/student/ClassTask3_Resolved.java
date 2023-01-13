package day06.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Resolved {
    /**
     * 1. Open https://demo.applitools.com/
     * 2. Input username and password using "placeholder" attributes to locate elements
     * 3. Click on Sign in button
     * 4. Verify name "Jack Gomez" is displayed
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        driver.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("username");
        driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("pass");

        driver.findElement(By.cssSelector("#log-in")).click();

        System.out.println(driver.findElement(By.cssSelector("div.logged-user-name")).isDisplayed());

        driver.close();
    }
}
