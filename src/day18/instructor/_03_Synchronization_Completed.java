package day18.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class _03_Synchronization_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        //fluent wait
        fluentWait(By.id("value"), driver).click();
    }

    public static WebElement fluentWait(By locator, WebDriver driver){
        FluentWait fluentWait = new FluentWait(driver);

        fluentWait.withTimeout(Duration.ofSeconds(20));
        fluentWait.pollingEvery(Duration.ofMillis(2000));
        fluentWait.ignoring(NoSuchElementException.class);
        fluentWait.withMessage("Reached max time limit and failed");

        WebElement element = (WebElement) fluentWait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(locator);
            }
        });

        return element;
    }



}
