package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_BasicLocators {
    //NOTE: Refer to README.md first
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");

        //locate by id


        //locate by name


        //locate by className


        //locate by tagName


        //locate by linkText


        //locate by partialLinkText


        //locating by attribute


        driver.close();

        //NOTE: ClassTask2 after competing of this demo
    }
}
