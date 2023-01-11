package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review_Solved {
    /**
     * 1. Open https://www.udemy.com/
     * 2. Verify "Log in" button is displayed and clickable.
     * 3. Verify title of the page is "Online Courses - Learn Anything, On Your Schedule | Udemy".
     * 4. Verify url of the home page starts with "https" to make sure it's secured.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1.
        driver.get("https://www.udemy.com/");

        //2.
        System.out.println(driver.findElement(By.linkText("Log in")).isEnabled());
        System.out.println(driver.findElement(By.linkText("Log in")).isDisplayed());

        WebElement element = driver.findElement(By.linkText("Log in"));
        System.out.println(element.isDisplayed());
        System.out.println(element.isEnabled());

        //3.
        String expected = "Online Courses - Learn Anything, On Your Schedule | Udemy";
        String actual = driver.getTitle();

        if (expected.equals(actual)){
            System.out.println("PASS | title: " + actual);
        }else{
            System.out.println("FAIL | title: " + actual);
        }

        //4.
        String url = driver.getCurrentUrl();

        if (url.startsWith("https")){
            System.out.println("PASS | url: " + url);
        }else{
            System.out.println("FAIL | url: " + url);
        }

        driver.close();

    }
}
