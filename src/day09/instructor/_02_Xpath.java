package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //working with texts


        //sub-strings of text - starts-with


        //sub-string of attribute - starts-with


        //sub-strings of text - contains


        //sub-string of attribute - contains


        driver.close();

        //NOTE: ClassTask2
    }
}
