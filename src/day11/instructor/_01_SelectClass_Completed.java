package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_SelectClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //when to use Select class?
        /**
         * you should only use Select class when you see <select></select> tags on drop down menu in the inspect tool
         */

        Select select = new Select(driver.findElement(By.name("select1")));

        //select by text
        select.selectByVisibleText("Three");
        Thread.sleep(1000);

        //select by index
        select.selectByIndex(6);

        //select by value
        select.selectByValue("Nine");

        //how to get all selectable options?
        List<WebElement> allOptions = select.getOptions();
        allOptions.forEach(each -> System.out.println(each.getText()));

        //NOTE: ClassTask 1 - 10min


        Thread.sleep(3000);
        driver.close();

    }
}
