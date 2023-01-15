package day07.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask4_Solved {
    /**
     *  1. Open url https://amazon.com
     *  2. In Footer section, print out descriptions of all footer buttons using "Desc" keyword of class attribute (use contains method)
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        List<WebElement> list = driver.findElements(By.cssSelector("span[class*='Desc']"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
