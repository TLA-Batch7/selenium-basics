package day08.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_CssLocators_axis_Completed {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child (anything under the parent. Child, grand-child etc. doesn't matter.)
     * 3. Nth-child
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/selectors");
        //1. direct-child
        /**
         * tag[attr=value] > tag
         * tag[attr=value] > tag[attr=value]
         *
         * it's possible to add more hierarchy like below, but not recommended as it gets hard to read
         * button[class='classValue'] > div[img='classValue'] > button[class='classValue']
         */

        System.out.println(driver.findElement(By.cssSelector("div#parent1 > div")).getText());

        System.out.println("-------------");

        //Locating both direct children of parent1 only
        //NOTE: This locator will print sub-children texts as well just because they are under Child ,
        // but located element is only Child 1 and 2, not sub-children
        List <WebElement> parent1Children = driver.findElements(By.cssSelector("div#parent1 > div"));
        parent1Children.forEach(each -> System.out.println(each.getText()));

        System.out.println(parent1Children.size());

        //NOTE: ClassTask1

        System.out.println("-------locating sub-children-----");

        //2. Sub-child (any child)
        /**
         * parent and child locators are separated by a "space"
         * tag[attr='value'] tag
         * tag[attr='value'] tag[attr='value']
         */

        List<WebElement> parent1Children2 = driver.findElements(By.cssSelector("div#parent1 div"));
        parent1Children2.forEach(each -> System.out.println(each.getText()));

        System.out.println(parent1Children2.size());

        //NOTE: No task
        System.out.println("------Nth-Children-----");
        //Nth-children
        /**
         * to access first child --> tag[attr='value]:first-child
         */
        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:first-child")).getText());

        /**
         * to access last child - tag[attr='value']:last-child
         */

        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:last-child")).getText());

        /**
         * to access any child --> tag[attr='value']:nth-child(3)
         * NOTE: count starts from 1, not from 0 like index
         */

        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:nth-child(3)")).getText());

        //NOTE: ClassTask2


        driver.close();
    }
}
