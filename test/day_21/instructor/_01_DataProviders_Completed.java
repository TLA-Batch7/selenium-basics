package day_21.instructor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class _01_DataProviders_Completed {

    /*
    ReadMe.md <<==
    Example: Open google.com and verify following buttons are enabled:
    Advertising, Business, How Search works, Privacy, Terms, Settings
     */

    //create test data with Data Provider
    @DataProvider(name = "footerLinks")
    public Object[] data01(){
        Object[] data = new Object[6];
        data[0] = "Advertising";
        data[1] = "Business";
        data[2] = " How Search works ";
        data[3] = "Privacy";
        data[4] = "Terms";
        data[5] = "Settings";

        return data;
    }

    //Test case with using data provider created above
    @Test(dataProvider = "footerLinks")
    public void test00(String footerLink){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='" + footerLink + "']")).isEnabled());
        driver.close();
    }





    @Test
    public void test01(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.linkText("Advertising")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Advertising']")).isEnabled());
        driver.close();
    }

    @Test
    public void test02(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.linkText("Business")).isEnabled());
        driver.close();
    }

    @Test
    public void test03(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.linkText("How Search works")).isEnabled());
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='How Search works']")).isEnabled());

        driver.close();
    }

    @Test
    public void test04(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.linkText("Terms")).isEnabled());
        driver.close();
    }

    @Test
    public void test05(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        //Assert.assertTrue(driver.findElement(By.linkText("Settings")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Settings']")).isEnabled());

        driver.close();
    }

    @Test
    public void test06(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        Assert.assertTrue(driver.findElement(By.linkText("Privacy")).isEnabled());
        driver.close();
    }

    //Step 1: without data Providers


    //Step 2: with data Providers

    //ClassTask 1


}
