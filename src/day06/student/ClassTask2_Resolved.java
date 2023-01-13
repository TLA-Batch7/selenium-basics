package day06.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask2_Resolved {
    /**
     * 1. Open url https://www.demoblaze.com/
     * 2. Print out names of all phones using css locator
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        Thread.sleep(2000);
        //   css locator -> a.hrefch
        //findElement() vs findElements()

        List<WebElement> list = driver.findElements(By.cssSelector("a.hrefch"));
        System.out.println(list.size());

        list.forEach(phone -> System.out.println(phone.getText()));

        driver.close();
    }
}
