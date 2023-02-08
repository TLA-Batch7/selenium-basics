package day_21.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProviders_Completed {

    /*
    Data Providers with 2 parameters
    Example 2: Verify all 18 navigation buttons are working as expected by taking to correct pages
     */

    @DataProvider(name = "navButtons")
    public Object[][] data01(){
        Object[][] data = new Object[4][2];

        data[0][0] = "Home";
        data[0][1] = "http://automation.techleadacademy.io/#/home";

        data[1][0] = "Curriculum";
        data[1][1] = "http://automation.techleadacademy.io/#/curriculum";

        data[2][0] = "Inputs";
        data[2][1] = "http://automation.techleadacademy.io/#/inputs";

        data[3][0] = "Selectors";
        data[3][1] = "http://automation.techleadacademy.io/#/selectors";

        return data;
    }

    @Test(dataProvider = "navButtons")
    public void test01(String buttonName, String expectedURL){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/home");
        driver.findElement(By.linkText(buttonName)).click();

        Assert.assertEquals(driver.getCurrentUrl(),  expectedURL);
    }


    //ClassTask 2


}
