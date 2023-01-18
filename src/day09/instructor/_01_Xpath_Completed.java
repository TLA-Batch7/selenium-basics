package day09.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        //tag + attribute
        /**
         * css -> div#idValue, div.classValue, div[href='https://google.com']
         * xpath -> //div[@href='https://google.com']
         *
         * Example: //h1[@name='h1-text']
         */

        System.out.println(driver.findElement(By.xpath("//h1[@name='h1-text']")).getText());

        //tag + attribute + attribute
        /**
         * css -> div#idValue.classValue, div[id=idValue][class=classValue]
         * xpath -> //div[@id='idValue'][@class='classValue']
         *
         * Example: //h1[@name='h1-text'][@class='header-text']
         */

        System.out.println(driver.findElement(
                By.xpath("//h1[@name='h1-text'][@class='header-text']")).getText());

        //asterisk *
        /**
         * xpath -> //*[@attribute='value']
         *
         * Example: //*[@class='text']
         */


        driver.close();

        //NOTE: ClassTask1

    }
}
