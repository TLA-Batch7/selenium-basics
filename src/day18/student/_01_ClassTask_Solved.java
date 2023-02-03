package day18.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_ClassTask_Solved {
    /**
     *  1. Open http://automation.techleadacademy.io/#/synchronization
     *  2. Input City name in Weather Dashboard section
     *  3. Click Red button
     *  4. Print out weather details for the city
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.findElement(By.name("search")).sendKeys("Seattle");
        driver.findElement(By.xpath("//form[@id='search-form']/button[@class='btn btn-primary']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        //following won't work because element is always present but hidden
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='weather-dashboard']")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='weather-dashboard']"))));

        System.out.println(driver.findElement(By.xpath("//div[@id='weather-dashboard']")).getText());

        Thread.sleep(3000);
        driver.close();
    }
}
