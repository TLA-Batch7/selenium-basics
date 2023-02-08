package day_21.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_ClassTask_Solved {
    /*
      US1003: Verify all text links on homepage are opening on new window.
     */


    @DataProvider(name = "links")
    public Object[][] data01(){
        Object[][] data = new Object[2][2];

        data[0][0] = "PHP Travels";
        data[0][1] = "https://phptravels.com/demo/";

        data[1][0] = "Mercury tours";
        data[1][1] = "http://ww7.demoaut.com/";

        return data;
    }

    @Test(dataProvider = "links")
    public void test01(String link, String expectedURL){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/home");

        driver.findElement(By.linkText(link)).click();

        //verify if link opened on new page

        //code to switch to newly opened page
        //NOTE: incomplete code

        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

    }

    @DataProvider(name = "links2")
    public Object[] data02(){
        Object[] data = new Object[2];

        data[0] = "PHP Travels";
        data[1] = "Mercury tours";

        return data;
    }

    @Test(dataProvider = "links2")
    public void test02(String link){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/home");

        driver.findElement(By.linkText(link)).click();

        //verify if link opened on new page
        Assert.assertTrue(driver.getWindowHandles().size() > 1);

        driver.quit();
    }

}
