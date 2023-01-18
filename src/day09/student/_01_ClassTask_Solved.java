package day09.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_ClassTask_Solved {
    public static void main(String[] args) {
        /**
         * 1. navigate to http://automation.techleadacademy.io/#/
         * 2. print out all nav bar buttons
         * 3. print out Select-class button text only
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/");

        List<WebElement> ls = driver.findElements(By.xpath("//a[@class='navbar-brand ml-3']"));
        for(WebElement each: ls){
            //System.out.println(each.getText());
        }

        System.out.println(driver.findElement(By.xpath("//a[@href='#/selectclass']")).getText());
        System.out.println(ls.get(4).getText());


        driver.close();
    }
}
