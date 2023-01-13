package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_CssLocators {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //------ chaining = using multiple attributes -------


        //------ sub-strings work with values of the attributes only ------
        //sub-string starts-with


        //Note: ClassTask2


        //------ sub-string ends-with ----------

        //Note: ClassTask3


        //------ sub-string contains -----------

        //Note: ClassTask4


        driver.close();

    }
}
