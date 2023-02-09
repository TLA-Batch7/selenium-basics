package day_22.instructor.testPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass2 {
    //NOTE: Update following path to match your chromedriver location
    String path = "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver";

    @Test (testName = "US003")
    public void testLogin3(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://interview-prep-test.herokuapp.com");

        String username = "test@yahoo.com";
        String password = "";

        //Input username/password
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        //click login button
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify Incorrect username/password text is
        WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

        Assert.assertTrue(loginText.isDisplayed());

        driver.close();
    }
    @Test (testName = "US004")
    public void testLogin4(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://interview-prep-test.herokuapp.com");

        String username = "qqq@yahoo.com";
        String password = "test123";

        //Input username/password
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        //click login button
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify Incorrect username/password text is
        WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

        Assert.assertTrue(loginText.isDisplayed());

        driver.close();
    }

}
