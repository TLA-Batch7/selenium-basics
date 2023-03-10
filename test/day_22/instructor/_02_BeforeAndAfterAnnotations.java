package day_22.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_BeforeAndAfterAnnotations {

    //@BeforeMethod and @AfterMethod implementations

    //NOTE: Update following path to match your chromedriver location
    String path = "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver";

    @Test(testName = "Test Header", priority = 1)
    public void test02(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/home");

        String actualHeader = driver.findElement(By.id("title")).getText();
        String expectedHeader = "Automation with Selenium";

        Assert.assertEquals(actualHeader, expectedHeader);

        driver.close();
    }

    @Test(testName = "Test Input", description = "Testing if input data is displayed as expected")
    public void test03(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }

    @Test(testName = "Test Alert", description = "Testing alert time to display", invocationCount = 1,
            invocationTimeOut = 4000)
    public void test04(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();
    }

    @Test(testName = "Test Input timeOut", description = "Testing if input data is displayed as expected", timeOut = 8000)
    public void test05(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }


}
