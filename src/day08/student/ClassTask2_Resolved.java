package day08.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Resolved {
    /**
     * 1. Navigate to url "https://demo.opencart.com/".
     * 2. Use first-child, last-child and nth-child options.
     * 3. Print out following from navigation bar:
     *      a. Desktops
     *      b. MP3 Players
     *      c. Software
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/");

        System.out.println(driver.findElement(By.cssSelector("ul[class='nav navbar-nav'] > li:first-child")).getText());
        System.out.println(driver.findElement(By.cssSelector("ul[class='nav navbar-nav'] > li:last-child")).getText());
        System.out.println(driver.findElement(By.cssSelector("ul[class='nav navbar-nav'] > li:nth-child(5)")).getText());


        driver.close();
    }
}
