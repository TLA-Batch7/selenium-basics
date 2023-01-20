package day10.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ClassTask_Solved {
    /**
     * Note: Use only xpath locators
     *  1. Open https://interview-prep-test.herokuapp.com/
     *  2. Login using following credentials:
     *      username: test@yahoo.com
     *      password: user123
     *  3. Add a statement under Dont's section
     *  4. Verify your new statement was added
     *  5. Delete newly added statement
     *  6. Verify it was deleted
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.close();
    }
}
