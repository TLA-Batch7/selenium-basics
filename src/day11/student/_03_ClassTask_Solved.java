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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //1.Click first alert and print out
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(2000);
        alert1.accept();


        //2 Click on second alert, click ok, then verify 'Popup box output' statement
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        System.out.println(driver.findElement(By.id("output")).getText()
                .equals("You pressed OK in confirmation popup"));

        //3. Click third alert, type your name and verify in 'Popup box output' section
        driver.findElement(By.id("promptBox")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Melanie");
        alert3.accept();
        System.out.println(driver.findElement(By.id("output")).getText().contains("Melanie"));

        Thread.sleep(3000);
        driver.close();
    }
}
