package day10.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_Xpath_Completed {
    //NOTE: solve ClassTask2 from previous day

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/selectors");

        //parent -> immediate child
        /**
         * css:
         * #parent1 tag.value
         * tag[class=value] > div
         *
         * xpath:
         * //tag[@attr='value]/tag
         * //div[@id='parent1']/div
         */

        List<WebElement> directChildren = driver.findElements(By.cssSelector("div#parent1 > div"));
        directChildren.forEach(each -> System.out.println(each.getText()));


        //parent -> all children
        /** xpath:
         * //tag[@attr='value]//tag
         * //div[@id='parent1']//div
         */

        List<WebElement> directChildren2 = driver.findElements(By.cssSelector("div#parent1 div"));
        directChildren.forEach(each -> System.out.println(each.getText()));

        //indexes [n]
        /**
         * //tag[@attr='value']/tag[n]
         * //nav/a[7]
         * //div[@class='home-page']/a[6]
         */


        //keywords: last(), last()-n
        //div[@class='home-page']/a[last()]
        //div[@class='home-page']/a[last()-3]
        //TASK: Locate last direct child of parent1 only using last() keyword (Result: Child 2 only)
        //div[@id='parent1']/div[last()]


        //and, or keywords in xpath
        /**
         * //tag[@attr1='value1' or @attr2='value']
         * //div[contains(text(), 'Macan') or contains(text(), 'Class')]
         * //div[contains(text(), 'Child') or contains(text(), 'child')]
         *
         * //tag[@attr1='value1' and @attr2='value']
         * //*[@attr1='value1' and @attr2='value']
         *
         * //div[contains(text(), 'Mercedes') and contains(text(), 'Class')]
         */



        driver.close();

        //NOTE: ClassTask1
    }
}
