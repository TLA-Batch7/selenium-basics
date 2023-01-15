package day08.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Resolved {
    /**
     * 1. Navigate to url "https://demo.opencart.com/".
     * 2. Use first-child, last-child and nth-child options.
     * 3. Print out following from navigation bar:
     *      a. Desktops
     *      b. MP3 Players
     *      c. Software
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");


        driver.close();
    }
}
