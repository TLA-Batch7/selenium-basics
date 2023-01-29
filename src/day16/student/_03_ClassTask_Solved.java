package day16.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ClassTask_Solved {
    /**
     *  Duration: 20min
     *  Execute following steps using Robot class
     *  1. Navigate to url "https://jira.ivorreic.com/project/board"
     * 	2. Grab first Task under Backlog column and move to In Progress column
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.close();
    }
}
