package day11.student;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ClassTask_Solved {
    /**
     * Alerts (instructions in README file)
     * https://www.hyrtutorials.com/p/alertsdemo.html
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //1.


        //2


        //3


        driver.close();
    }
}
