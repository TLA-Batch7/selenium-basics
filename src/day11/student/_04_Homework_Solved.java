package day11.student;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Homework_Solved {
    /**
     * Alerts
     * Password Generator section:
     * Go through steps to choose type of password to generate and print out:
     * 1. Last alert window
     * 2. The result from the generated password window
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/alert");

        //1. Click on generate button
        driver.findElement(By.id("generate-password")).click();

        //2. Handle first alert
        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("8");
        alert1.accept();
        Thread.sleep(2000);

        //3. Handle 2nd alert
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);

        //4. Handle 3rd alert
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();
        Thread.sleep(2000);

        //5. Handle 4th alert
        Alert alert4 = driver.switchTo().alert();
        alert4.accept();
        Thread.sleep(2000);

        //6. Handle 5th alert
        Alert alert5 = driver.switchTo().alert();
        alert5.dismiss();
        Thread.sleep(2000);

        //7. Handle last alert
        Alert alert6 = driver.switchTo().alert();
        System.out.println(alert6.getText());
        alert3.accept();

        Thread.sleep(3000);

        //8. Print The result from the generated password window
        String password = driver.findElement(By.id("log")).getText();
        System.out.println("Your generated password is: " + password);

        driver.close();


    }
}
