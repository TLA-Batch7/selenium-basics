package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Xpath_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //parent -> child


        //parent -> all children


        //indexes [n]


        //keywords: last(), last()-n


        //and, or keywords in xpath


        driver.close();
    }
}
