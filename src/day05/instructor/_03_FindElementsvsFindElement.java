package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindElementsvsFindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        //1. What is the difference between findElement() vs findElements()
        // Nav buttons on practice home page
        WebElement element = driver.findElement(By.className("navbar-brand"));
        System.out.println(element.getText());

        List<WebElement> list = driver.findElements(By.className("navbar-brand"));
        for(WebElement each: list){
            //System.out.println(each.getText());
        }
        System.out.println(list.size());


        //2. Print specific item
        System.out.println(list.get(6).getText());


        driver.close();

        //NOTE: ClassTask 2
    }
}
