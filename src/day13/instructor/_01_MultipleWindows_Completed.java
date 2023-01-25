package day13.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _01_MultipleWindows_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //What is considered as multiple windows in selenium?

        //What is GUID (Global Unique Identifier) and how to locate it?
        driver.get("http://automation.techleadacademy.io");
        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        String mainWindowID = driver.getWindowHandle();
        //System.out.println("ID of homepage window: " + mainWindowID);

        //Example: Home page -> sauce demo link texts -> print titles of the pages

        driver.findElement(By.linkText("Saucedemo")).click();
        Thread.sleep(2000);

        Set<String> allIds = driver.getWindowHandles();

        //allIds.forEach(each -> System.out.println(each));

        for(String eachID: allIds){
            if (!eachID.equals(mainWindowID))
                driver.switchTo().window(eachID);
        }

        String sauceWindowId = driver.getWindowHandle();

        System.out.println(driver.getTitle());

        //How to return to the main page?
        driver.switchTo().window(mainWindowID);

        //Example 2: Test title of page when you open "Internet" link
        driver.findElement(By.linkText("Internet")).click();

        System.out.println("-------");

        allIds = driver.getWindowHandles();
        //allIds.forEach(each -> System.out.println(each));

        //switch to Internet window
//        for(String eachID: allIds){
//            if (!eachID.equals(mainWindowID) && !eachID.equals(sauceWindowId))
//                driver.switchTo().window(eachID);
//        }

        //switch to Internet window
        for(String eachID: allIds){
            driver.switchTo().window(eachID);
            if (driver.getTitle().equals("The Internet")){
                //find some elements to interact
                //or exit the loop
                break;
            }
        }

        System.out.println(driver.getTitle());


        //Difference between driver.close and driver.quit?
        /**
         * .close() -> closes only active window
         * .quit() -> closes all windows that was open by the same driver object
         */


        Thread.sleep(2000);
        //driver.close();
        driver.quit();

    }
}
