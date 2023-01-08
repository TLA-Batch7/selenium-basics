package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. Open automation practice web page
         * 2. Navigate to "Inputs" section of automation website directly
         * 3. Enter Message "Hello world"
         * 4. Click "Show message"
         * 5. Verify message displayed is same as expected
         */

        //Code goes here...
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. Open automation practice web page
        driver.get("http://automation.techleadacademy.io/#/home");
        // 2. Navigate to "Inputs" section of automation website directly
        driver.findElement(By.linkText("Inputs")).click();

        // 3. Enter Message "Hello world"
        String expectedWord = "Hello world";

        driver.findElement(By.id("message")).sendKeys(expectedWord);
        // 4. Click "Show message"
        driver.findElement(By.name("button1")).click();

        // 5. Verify message displayed is same as expected
        String actualWord = driver.findElement(By.name("message1")).getText();

        if (actualWord.equals(expectedWord)) {
            System.out.println("PASS: word is shown as expected");
        } else {
            System.out.println("FAIL: word is not shown as expected");
        }


        driver.close();
    }
}
