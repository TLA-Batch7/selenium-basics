package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_CssLocators_Resolved {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/");

        //------ chaining = using multiple attributes -------
        /**
         * tag + attr1 + attr2
         * tag[attr1='value'][attr2='value']
         * Example: div[class='blue'][href='https.//blueweb.com']
         *
         * Example by using driver.findElement() => driver.findElement(By.cssSelector("a[class='value'][name='value']));
         */

        System.out.println(driver.findElement(By.cssSelector("h1[class='header-text'][name='h1-text']")).getText());
        System.out.println(driver.findElement(By.cssSelector("a[class='navbar-brand ml-3'][href='#/curriculum']")).getText());

        //------ sub-strings work with values of the attributes only ------
        //sub-string starts-with
        System.out.println("-----startWith----");
        /**
         * tag[attr^='startingValue']
         * Example: a[title=^='You are looking']
         */

        System.out.println(driver.findElement(By.cssSelector("a[href^='https://']")).getText());

        //Note: ClassTask2


        //------ sub-string ends-with ----------
        /**
         * tag[attr$='endingValue']
         * Example: a[title$='good day']
         */
        System.out.println("----endWith----");
        List<WebElement> listEndsWith = driver.findElements(By.cssSelector("a[href$='.com/']"));
        listEndsWith.forEach(each -> System.out.println(each.getText()));

        //Note: ClassTask3


        //------ sub-string contains -----------
        /**
         * tag[attr*='value']
         * Example: a[title*='forecast']
         */

        System.out.println("----contains----");
        List<WebElement> listContains = driver.findElements(By.cssSelector("a[href*='.com/']"));
        listContains.forEach(each -> System.out.println(each.getText()));

        System.out.println("----contains the word practice----");
        List<WebElement> listContains2 = driver.findElements(By.cssSelector("a[href*='practice']"));
        listContains2.forEach(each -> System.out.println(each.getText()));

        //Note: ClassTask4


        driver.close();

    }
}
