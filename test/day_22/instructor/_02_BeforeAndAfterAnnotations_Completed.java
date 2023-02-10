package day_22.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_BeforeAndAfterAnnotations_Completed {

    //@BeforeMethod and @AfterMethod implementations

    //NOTE: Update following path to match your chromedriver location
    String path = "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test(testName = "Test Header", priority = 1)
    public void test02(){
        driver.get("http://automation.techleadacademy.io/#/home");

        String actualHeader = driver.findElement(By.id("title")).getText();
        String expectedHeader = "Automation with Selenium";

        Assert.assertEquals(actualHeader, expectedHeader);
    }

    @Test(testName = "Test Input", description = "Testing if input data is displayed as expected")
    public void test03(){
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Test(testName = "Test Alert", description = "Testing alert time to display", invocationCount = 1,
            invocationTimeOut = 4000)
    public void test04(){
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test(testName = "Test Input timeOut", description = "Testing if input data is displayed as expected", timeOut = 8000)
    public void test05(){
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());
    }


}
