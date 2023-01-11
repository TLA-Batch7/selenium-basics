package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Review_Resolved {
    /**
     * 1. Open https://www.coolthings.com/
     * 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".
     * 3. Verify each page has expected headers:
     *  page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Open https://www.coolthings.com/
        driver.get("https://www.coolthings.com/");

        // 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".
        String expectedTitle = "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("PASS | Expected title: " + expectedTitle + " | Actual: " + actualTitle);
        }else {
            System.out.println("FAIL | Expected title: " + expectedTitle + " | Actual: " + actualTitle);
        }

        // 3. Verify each page has expected headers:
        //    page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
        //Option 1: Individual
//        driver.findElement(By.linkText("GADGETS")).click();
//        String header = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(header);
//        System.out.println(header.equals("GADGETS"));
//
//        driver.findElement(By.linkText("GIFTS")).click();
//        header = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(header);
//        System.out.println(header.equals("COOL GIFTS"));
//
//        driver.findElement(By.linkText("GEAR")).click();
//        header = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(header);
//        System.out.println(header.equals("GEAR"));

        //Option 2: Grouped
        String[] arr = {"GEAR", "GADGETS", "GIFTS", "INVENTIONS", "STYLE", "HOUSE"};

        for(String button: arr){
            driver.findElement(By.linkText(button)).click();
            String eachHeader = driver.findElement(By.tagName("h1")).getText();
            System.out.println(eachHeader);

            if (eachHeader.contains("INVENTIONS")){
                System.out.println(eachHeader.equals("COOL NEW AWESOME INVENTIONS"));
            }else if (eachHeader.contains("GIFTS")){
                System.out.println(eachHeader.equals("COOL GIFTS"));
            }else {
                System.out.println(eachHeader.equals(button));
            }
        }


        Thread.sleep(2000);
        driver.close();

        //NOTE: ClassTask 1

    }
}
