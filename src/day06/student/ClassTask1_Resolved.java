package day06.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Resolved {
    /**
     * 1. Open url https://computer-database.gatling.io/computers
     * 2. Input "Macbook Pro" in Search box
     * 3. Print out "Macbook Pro" name from the search result using linkText
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://computer-database.gatling.io/computers");

        driver.findElement(By.cssSelector("input#searchbox")).sendKeys("Macbook Pro");
        driver.findElement(By.cssSelector("#searchsubmit")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.linkText("MacBook Pro")).getText());

        driver.close();
    }

}
