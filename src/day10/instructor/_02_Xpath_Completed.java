package day10.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath_Completed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //XPATH AXIS
        //immediate children using 'child' keyword
        /**
         * //div[@class='value']/div
         * //div[@class='value']/child::div
         *
         * //div[@id='parent1']/div
         * //div[@id='parent1']/child::div
         */


        //descendant
        /**
         * //div[@id='parent1']//div
         * //div[@id='parent1']/descendant::div
         *
         * //div[@id='parent1']//div
         * //div[@id='parent1']/descendant::div
         */


        //following -> all following webElements regardless the hierarchy, by giving the starting point
        /**
         * sets a starting point on HTML document and locates all elements that come after the given point,
         * regardless the level of webElement.
         * //div[@id='parent1']/following::div
         *
         * //div[@id='parent1']/following::div
         */


        //preceding -> all preceding webElements regardless the hierarchy, by giving the starting point
        /**
         * sets a starting point on HTML document and locates all elements that come before the given point,
         * regardless the level of webElement.
         * //div[@id='parent1']/preceding::div
         *
         * //div[@id='parent1']/preceding::div
         */

        //preceding-sibling -> locates all siblings above the given element
        /**
         * //div[@id='parent1']/preceding-sibling::div
         * //div[text()='Sub-child 3']/preceding-sibling::div
         */


        //following-sibling -> locates all siblings below the given element
        /**
         * //div[@id='parent1']/following-sibling::div
         * //div[text()='Sub-child 3']/following-sibling::div
         */


        //parent
        /**
         * //div[@class='value']/parent::div
         * //div[text()='Sub-child 3']/parent::div
         */


        //ancestor
        /**
         * //div[@class='value']/ancestor::div
         * //div[text()='Sub-child 3']/ancestor::div
         *
         * //div[text()='Mercedes C-Class']/ancestor::div[@id='mercedes']
         */


        driver.close();

        //NOTE: ClassTask2

    }
}
