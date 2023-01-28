package day15.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ActionsClass_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/inputs");

        //selecting a text that was entered by a user (Ctrl + A command)


        //copy above selected text and paste in other place (Ctrl + C and Ctr + V commands)



        /**
         * Reading tooltips:
         * Tooltips with attribute values
         *  - With "title" attribute (youtube.com)
         *  - With "data-tip" attribute on Action-class page
         */


        //2. With hover over method (Actions page)


        //Print without hovering over first


        //Print with hover over using Actions class



        //Class Task 3

        Thread.sleep(3000);
        driver.close();
    }
}
