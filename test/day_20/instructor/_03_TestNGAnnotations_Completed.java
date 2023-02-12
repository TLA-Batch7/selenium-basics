package day_20.instructor;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _03_TestNGAnnotations_Completed {
    /**
        //5. "priority"

        //6. "invocationCount" - Verify alert is getting displayed within 10 seconds on Synchronization page
              using WebDriverWait

        //7. "invocationTimeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
              substitute WebDriverWait (applies to all counts together as a whole)

        //8. "timeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
              substitute WebDriverWait (applies to specific test case, no count needed)

        //9. "dataProvider" - Verify all 18 navigation buttons are working as expected by taking to correct pages

        //ClassTask 2

    */

    //5.Priority - By default Tests are ordered alphabetically. You can used Priority attribute to sort execution order.
    // It can take positive, negative, and 0.
    // Smaller the number the higher the priority becomes.
    @Test (priority = -1)
    public void testGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        driver.close();
    }

    @Test (testName = "Test Header", priority = 1)
    public void test02(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/home");

        String actualHeader = driver.findElement(By.id("title")).getText();
        String expectedHeader = "Automation with Selenium";

        Assert.assertEquals(actualHeader,expectedHeader);
        driver.close();
    }


    @Test(testName = "Test Input", description = "Testing if input data is displayed as expected")
    public void test03(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData ="Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }
    //-------------------------------------------------------------------------------------------

    @Test(testName ="Test Alert",description = "Testing alert time is displayed", invocationCount = 2, invocationTimeOut = 40000)
    public void test04(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();
    }

    //----------------------------------------------------------
    //timeout- it sets a limit execution time of only 1 test case
    //If it reaches timeOut time it will throw ThreadTimeoutException

    @Test(testName = "Test Input", description = "Testing if input data is displayed as expected",timeOut = 8000)
    public void test05(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData ="Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }


}
