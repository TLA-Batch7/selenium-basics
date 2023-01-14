package day07.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask2_Solved {
    /**
     *  1. Open url http://automation.techleadacademy.io/#/selectors
     *  2. Print out all sub-child elements that has class value starting with a keyword "sub"
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/selectors");

        List<WebElement> subList = driver.findElements(By.cssSelector("div[class^='sub']"));
        subList.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
