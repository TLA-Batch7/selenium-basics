package day11.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_ClassTask_Solved {
    /**
     * Section: "Select a single option 2" section
     *      1. Print out all options
     *      2. Select option "Yellow" only
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

//        1. Print out all options
        Select select = new Select(driver.findElement(By.name("select2")));
        List<WebElement> allOptions = select.getOptions();
        allOptions.forEach(each-> System.out.println(each.getText()));

//        2. Select option "Yellow" only
        select.selectByValue("Yellow");
//        select.selectByIndex(8);
//        select.selectByVisibleText("Yellow");


        //Verify that "Yellow" is displayed
        System.out.println(driver.findElement(By.id("select2-selected-value")).isDisplayed());

        Thread.sleep(2000);

        driver.close();


    }
}
