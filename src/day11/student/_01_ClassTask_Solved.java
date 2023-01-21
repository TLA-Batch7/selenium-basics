package day11.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_ClassTask_Solved {
    /**
     * Section: "Select a single option 2" section
     *      1. Print out all options
     *      2. Select option "Yellow" only
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/selectclass");


    }
}
