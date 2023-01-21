package day10.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;

public class _02_ClassTask_Solved {
    /**
     * Note: Use only xpath locators
     * 1. Open https://interview-prep-test.herokuapp.com/
     * 2. Login using following credentials:
     * username: test@yahoo.com
     * password: user123
     * 3. Add a statement under Dont's section
     * 4. Verify your new statement was added
     * 5. Delete newly added statement
     * 6. Verify it was deleted
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}