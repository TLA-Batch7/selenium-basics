package day13.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Tables_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/tables");

        //Print out all emails


        //Print out all first names


        //Print out all first names with emails


        //Print out all first names with emails but as groups, retrieve data separately from each row.


        //Task: Print out value of First names based on if gender is Male (in Tables page)



        driver.close();


        //Class Task 1
    }
}
