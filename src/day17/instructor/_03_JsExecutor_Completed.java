package day17.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_JsExecutor_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/home");
        Thread.sleep(2000);

        //Scroll into view
        //scrollIntoView(driver.findElement(By.id("copyright")), driver);

        //highlight element
        highlightElement(driver.findElement(By.id("title")), driver);

        Thread.sleep(2000);

        driver.close();

    }

    public static void scrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void highlightElement(WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);
        js.executeScript("arguments[0].style.backgroundColor='yellow'", element);

        Thread.sleep(2000);

        js.executeScript("arguments[0].setAttribute('style','border: none');", element);
        js.executeScript("arguments[0].style.backgroundColor=null", element);
    }

}
