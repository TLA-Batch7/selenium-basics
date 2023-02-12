package day_23.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class _01_Parameters_Completed {
    //NOTE: Update following path to match your chromedriver location
    String path = "";

    @Parameters({"username","password","chromePath"})
    @Test(testName = "Login test")
    public void test01(String user, String pass, String path){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com");

        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.tagName("button")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h5")).getText(), "WELCOME USER !");

        driver.close();
    }

    @Parameters({"username","password","chromePath"})
    @Test(testName = "User form test")
    public void test02(String user, String pass, String path){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com/");

        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.tagName("button")).click();

        //Test user form fields are displayed

        driver.close();
    }


    @Parameters({"username","password","chromePath"})
    @Test(testName = "Display view options test")
    public void test03(String user, String pass, String path){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com");

        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.tagName("button")).click();

        //Test user can select different options to view

        driver.close();
    }

    //Optional Parameters
    @Parameters("parameter2")
    @Test
    public void testMethod2(@Optional("I am Option value") String b) {
        System.out.println("Value passed ::" + b);
    }


    @Parameters({"username-1","username-2"})
    @Test
    void paramTest(@Optional("value") String user1, @Optional ("value 2") String user2){
        System.out.println(user1);
        System.out.println(user2);
    }

}
