package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class _01_Homework_Resolved {
    /**
     *  URL: http://automation.techleadacademy.io/#/multiplewindow
     *  1. Print out texts of each button on the page (Launch TLA, Launch Google, Launch Facebook)
     *  2. Click on "Launch Facebook"
     *  3. Print out text "Connect with friend and the world..."
     *  4. Close facebook window
     *  5. Return to the main window
     *  7. Click on "Launch Google" button
     *  8. Print out title of the page
     *  9. Click on "Launch TLA"
     *  10. Print out text of navigation buttons
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/multiplewindow");

        //1. Print out texts of each button on the page (Launch TLA, Launch Google, Launch Facebook)
        List<WebElement> btns = driver.findElements(By.xpath("//a[starts-with(@class, 'btn')]"));
        btns.forEach(each -> System.out.println(each.getText()));

        //2. Click on "Launch Facebook"
        driver.findElement(By.xpath("//a[starts-with(@class, 'btn') and text()='Launch Facebook']")).click();

        //3. Print out text "Connect with friend and the world..."
        String mainWindowId = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            if (!each.equals(allWindows))
                driver.switchTo().window(each);
        }

        System.out.println(driver.findElement(By.tagName("h2")).getText());

        //4. Close facebook window
        driver.close();

        //Return to the main window
        driver.switchTo().window(mainWindowId);

        //Click on "Launch Google" button
        driver.findElement(By.xpath("//a[starts-with(@class, 'btn') and text()='Launch Google']")).click();

        //Print out title of the page
        allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            if (!each.equals(allWindows))
                driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

        driver.switchTo().window(mainWindowId);

        //Click on "Launch TLA"
        driver.findElement(By.xpath("//a[starts-with(@class, 'btn') and text()='Launch TLA']")).click();

        //Print out text of navigation buttons
        allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            driver.switchTo().window(each);
            if (driver.getTitle().contains("Tech Lead"))
                break;
        }

        driver.manage().window().maximize();

        List<WebElement> navBtns = driver.findElements(By.xpath("//div[@id='lp-pom-box-346']/div[@class='lp-element lp-pom-text nlh']/p"));
        navBtns.forEach(each -> System.out.println(each.getText()));


        Thread.sleep(3000);
        driver.quit();
    }
}
