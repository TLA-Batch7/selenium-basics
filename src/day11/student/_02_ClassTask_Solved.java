package day11.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ClassTask_Solved {
    /**
     * Section: "Nested drop-down menu"
     *      1. Click "Home" button
     *          Verify text "You have clicked -- Home -- button" is displayed
     *      2. Click "WordPress Development" -> "Plugins"
     *          Verify text "You have clicked -- Plugins -- button" is displayed
     *      3. Click "Front End Design" -> "Javascript" -> "Ajax"
     * 			Verify you see text "You have clicked -- Ajax -- button"
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");


        driver.close();

    }
}
