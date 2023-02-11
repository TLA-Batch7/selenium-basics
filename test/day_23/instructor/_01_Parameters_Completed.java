package day_23.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_Parameters_Completed {
    //NOTE: Update following path to match your chromedriver location
    String path = "";

    @Test(testName = "Login test")
    public void test01(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com");

        driver.findElement(By.name("username")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user123");

        driver.findElement(By.tagName("button")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h5")).getText(), "WELCOME USER !");

        driver.close();
    }

    @Test(testName = "User form test")
    public void test02(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com/asdfasd");

        driver.findElement(By.name("username")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user123");

        driver.findElement(By.tagName("button")).click();

        //Test user form fields are displayed

        driver.close();
    }


    @Test(testName = "Display view options test")
    public void test03(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com");

        driver.findElement(By.name("username")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user123");

        driver.findElement(By.tagName("button")).click();

        //Test user can select different options to view

        driver.close();
    }

    //Optional Parameters


}
