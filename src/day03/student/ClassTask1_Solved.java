package day03.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class ClassTask1_Solved {
    public static void main(String[] args) {
        /**
         * NOTE: Complete the task using navigate methods only
         * 1. Navigate to "https://asoftmurmur.com/"
         *      print out the title of the page
         * 2. Navigate to "https://agoodmovietowatch.com/"
         *      print out the url of the page
         * 3. Navigate back
         *      verify title contains a word "murmur"
         * 4. Refresh the page
         * 5. Navigate forward
         *      verify title ends with a word "Watch"
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. Navigate to https://asoftmurmur.com/
        driver.navigate().to("https://asoftmurmur.com/");

        //1.a print title of page
        System.out.println("This is the title of 1st URL: " + driver.getTitle());

        //2. Navigate to https://agoodmovietowatch.com/
        driver.navigate().to("https://agoodmovietowatch.com/");

        //2.a print URL of page
        System.out.println("This is URL of 2nd page: " + driver.getCurrentUrl());

        //3. Navigate back
        driver.navigate().back();

        //3. Verify title of page contains a word murmur
        System.out.println("Verify title contains word: " + driver.getTitle().toLowerCase().contains("murmur"));

        //4. Refresh the page
        driver.navigate().refresh();

        //5. Navigate forward
        driver.navigate().forward();

        //5.a verify title ends with a word "Watch"
        System.out.println("Verify word ends with a word: " + driver.getTitle().endsWith("Watch"));

        driver.close();
    }
}
