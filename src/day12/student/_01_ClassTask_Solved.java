package day12.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {
    /**
     *  URL: http://automation.techleadacademy.io/#/popup
     *  1. Click on "BMI Calculator" button
     *  2. Input height and weight
     *  3. Click on "Calculate" button
     *  4. Print out BMI Result
     *  5. Print out which category it belongs to
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");

        //1


        //2


        //3


        //4, 5

    }
}
