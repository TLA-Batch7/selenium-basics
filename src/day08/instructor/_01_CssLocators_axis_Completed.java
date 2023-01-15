package day08.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_CssLocators_axis_Completed {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child (anything under the parent. Child, grand-child etc. doesn't matter.)
     * 3. Nth-child
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");
        //1. direct-child


        //NOTE: ClassTask1


        //2. Sub-child (any child)


        //NOTE: No task

        //Nth-children


        //NOTE: ClassTask2


        driver.close();
    }
}
