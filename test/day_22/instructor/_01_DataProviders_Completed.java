package day_22.instructor;


import day_22.instructor._data_.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _01_DataProviders_Completed {
    /*
      1. Verify Display Options are displaying expected number of employees
         URL: https://employee-management-39848.herokuapp.com/
         username: user
         password: user123
     */

    @Test(dataProvider = "displayOptions", dataProviderClass = DataProviders.class)
    public void test01(String displayOption){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com/");

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("user123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.findElement(By.xpath("//button[text()='"+displayOption+"']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        if (displayOption.equalsIgnoreCase("All")){
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody/tr"), 50));
        }else {
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody/tr"), Integer.parseInt(displayOption)));
        }

        List<WebElement> trs = driver.findElements(By.xpath("//tbody/tr"));

        if (displayOption.equalsIgnoreCase("All")){
            Assert.assertTrue(trs.size() > 50);
        }else {
            Assert.assertEquals(trs.size(), Integer.parseInt(displayOption));
        }

        driver.close();
    }


    /*
      2. Verify admin can add new users as student, instructor and mentor
      URL: http://automation.techleadacademy.io/#/usermgt
     */
    @Test(testName = "Verify adding new user roles to staging table",
            dataProvider = "users", dataProviderClass = DataProviders.class)
    public void test02(String first, String last, String phone, String email, String role){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/usermgt");

        //fill out form
        driver.findElement(By.id("Firstname")).sendKeys(first);
        driver.findElement(By.id("Lastname")).sendKeys(last);
        driver.findElement(By.id("Phonenumber")).sendKeys(phone);
        driver.findElement(By.id("Email")).sendKeys(email);

        //selecting role
        Select select = new Select(driver.findElement(By.id("Select-role")));
        select.selectByVisibleText(role);

        //adding a user by clicking Submit button
        driver.findElement(By.id("submit-btn")).click();

        //verify if role is displayed as expected
        Assert.assertTrue(driver.findElement(By.xpath("//td[text()='" + role + "']")).isDisplayed());

        driver.close();
    }


    /*
      3. Storing dataProviders in separate package
     */



}
