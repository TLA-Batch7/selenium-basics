package day_21.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_ClassTask_Solved {
    /*
      NOTE: Use dataProvider

      US2101: Verify following Display Options buttons are displayed:
       10, 25, 50, All
       url: https://employee-management-39848.herokuapp.com/
     */

    @DataProvider(name = "displayOptions")
    public Object[] data01(){
        return new Object[]{"10", "25", "50", "All"};
    }

    @Test(dataProvider = "displayOptions")
    public void test01(String displayOption){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://employee-management-39848.herokuapp.com/");

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("user123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='"+displayOption+"']")).isEnabled());

        driver.close();
    }
}
