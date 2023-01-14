package day07.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask1_Solved {
    /**
     * 	- Class Task:
     * 		○ 1. Navigate to "https://www.google.com/"
     * 		○ 2. Input "SDET positionS" in search bar
     * 		○ 3. Click on "Google search"
     * 		○ 4. Click on "100+ more jobs" option
     * 		○ 5. Print out names of companies that are hiring from the list
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        1. Navigate to "https://www.google.com/"
        driver.get("https://www.google.com/");

//        2. Input "SDET positionS" in search bar
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("SDET positionS");

//        3. Click on "Google search"
        driver.findElement(By.cssSelector("input[name='btnK']")).click();

//        4. Click on "100+ more jobs"
        driver.findElement(By.cssSelector("a.esVihe")).click();

//        5. Print out names of companies that are hiring from the list
        Thread.sleep(3000);

        List<WebElement> companies = driver.findElements(By.cssSelector("div.vNEEBe"));

        companies.forEach(name -> System.out.println(name.getText()));

//        System.out.println("---second way----");
//        for(WebElement name: companies){
//            System.out.println(name.getText());
//        }

        driver.close();

    }


}
