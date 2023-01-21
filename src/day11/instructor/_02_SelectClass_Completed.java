package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //select multiple options
        // This can happen if developer enables multi select option

        Select select = new Select(driver.findElement(By.id("cars")));
        select.selectByIndex(2);
        select.selectByVisibleText("Devops");
        select.selectByValue("Director");

        //check if selecting multiple options is enabled
        System.out.println(select.isMultiple());

        Thread.sleep(3000);

        //deselect by text
        select.deselectByVisibleText("Developer");

        //deselect by index
        select.deselectByIndex(7);

        //deselect by value
        select.deselectByValue("Director");


        //deselect all selected
        // ---> Select more options first
        select.selectByIndex(3);
        select.selectByVisibleText("Business Analyst");
        select.selectByValue("QA");

        Thread.sleep(3000);

        select.deselectAll();



        //NOTE: ClassTask2

        Thread.sleep(3000);
        driver.close();
    }
}
