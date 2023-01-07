package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NOTE: Refer to README.md first
public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
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
