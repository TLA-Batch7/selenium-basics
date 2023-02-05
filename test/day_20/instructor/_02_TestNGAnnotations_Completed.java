package day_20.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_TestNGAnnotations_Completed {
    /**
     //1. "none" - Verify title of the google.com page is "Google

     //2. "testName" - Verify header "Automation with Selenium" is displayed on homepage

     //3. "description" - Verify "Enter message" section on Inputs page displaying expected txt

     //4. "enable/disable" - Verify Curriculum page header "Curriculum"

     //ClassTask 1
     */

    //1. None
    @Test
    public void testGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        driver.close();
    }

    //2. testName
    @Test (testName = "Test Header")
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

    //3. description
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
    //4. enabled/disabled - you use this if it's not completed yet or fails
    @Test(testName = "Curriculum Page Test", description = "Testing main header the page", enabled = false)
    public void test04(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/curriculum");

        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Curriculum'")).isDisplayed());
        driver.close();
    }


}
