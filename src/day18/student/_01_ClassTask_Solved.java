package day18.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {
    /**
     *  1. Open http://automation.techleadacademy.io/#/synchronization
     *  2. Input City name in Weather Dashboard section
     *  3. Click Red button
     *  4. Print out weather details for the city
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/synchronization");




        Thread.sleep(3000);
        driver.close();
    }
}
