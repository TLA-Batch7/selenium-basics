package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_RadioBtn_Completed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //section: "Radio Button"
        //Only 1 radio button can be selected at once.
        //You can not unselect the button, you can only choose another selection
        driver.findElement(By.id("exampleRadios2")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='exampleRadios1']")).click();

        Thread.sleep(3000);

        driver.close();



    }
}
