package day11.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ClassTask_Solved {
    /**
     * Section: "Nested drop-down menu"
     *      1. Click "Home" button
     *          Verify text "You have clicked -- Home -- button" is displayed
     *      2. Click "WordPress Development" -> "Plugins"
     *          Verify text "You have clicked -- Plugins -- button" is displayed
     *      3. Click "Front End Design" -> "Javascript" -> "Ajax"
     * 			Verify you see text "You have clicked -- Ajax -- button"
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        // 1. Click "Home" button
        //  Verify text "You have clicked -- Home -- button" is displayed

        driver.findElement(By.xpath("//li/a[text()='Home']")).click();

        String actualText1 = driver.findElement(By.tagName("h4")).getText();
        System.out.println("You have clicked -- Home -- button".equals(actualText1));

//        2. Click "WordPress Development" -> "Plugins"
        driver.findElement(By.xpath("//li/a[text()='WordPress Development']")).click();
        driver.findElement(By.xpath("//li/a[text()='Plugins']")).click();
//          Verify text "You have clicked -- Plugins -- button" is displayed
        String actualText2 = driver.findElement(By.tagName("h4")).getText();
        System.out.println("You have clicked -- Plugins -- button".equals(actualText2));

//        3. Click "Front End Design" -> "Javascript" -> "Ajax"
        driver.findElement(By.xpath("//a[text()='Front End Design']")).click();
        driver.findElement(By.xpath("//li/a[text()='JavaScript']")).click();
        driver.findElement(By.xpath("//li/a[text()='Ajax']")).click();
//        Verify you see text "You have clicked -- Ajax -- button"
        String actualText3 = driver.findElement(By.tagName("h4")).getText();
        System.out.println("You have clicked -- Ajax -- button".equals(actualText3));

        driver.close();

    }
}
