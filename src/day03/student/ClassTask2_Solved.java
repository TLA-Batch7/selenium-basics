package day03.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) {
        /**
         * 1. Open google web page
         * 2. Print out text of the button "Google Search"
         * 3. Print out text of the "Images" link on top right corner of the page
         */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. open google web page
        driver.get("https://google.com");

        //2. Print out text of the button "Google Search"
        System.out.println("Google search btn: " + driver.findElement(By.name("btnK")).getText());
        System.out.println(driver.findElement(By.name("btnK")).getAttribute("aria-label"));

        //3. Print out text of the "Images" link on top right corner of the page
        System.out.println("link text of images btn: " + driver.findElement(By.linkText("Images")).getText());

        driver.close();
    }
}
