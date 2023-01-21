package day12.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_PopUps_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");

        //What is browser pop-ups? Pop-ups vs alerts?

        //Example: Pop-Up page -> Message button



        //Class Task 1
    }



}
