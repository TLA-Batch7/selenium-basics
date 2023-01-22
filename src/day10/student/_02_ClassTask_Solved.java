package day10.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.NoSuchElementException;

public class _02_ClassTask_Solved {
    /**
     * Note: Use only xpath locators
     * 1. Open https://interview-prep-test.herokuapp.com/
     * 2. Login using following credentials:
     * username: test@yahoo.com
     * password: user123
     * 3. Add a statement under Dont's section
     * 4. Verify your new statement was added
     * 5. Delete newly added statement
     * 6. Verify it was deleted
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        1. Open https://interview-prep-test.herokuapp.com/
        driver.get("https://interview-prep-test.herokuapp.com/");

//        2. Login
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

//        3. Add a statement under Dont's section
        driver.findElement(By.xpath("//div[@class='col-md-3 dont']/button")).click();
        driver.findElement(By.xpath("//textarea[@id='inputArea2']")).sendKeys("Try your Best -M");

//        3.1 click on the enter button
        driver.findElement(By.xpath("//button[@class='btn btn-outline-white btn-sm btn-success']")).click();

        Thread.sleep(3000);

//        4. Verify your new statement was added
//        We use try catch to avoid program to stop if element is not there.
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='anyClass']/div"));
        for(int i = list.size()-1; i > 0; i--){
        }
        System.out.println(list.get(list.size()-1).getText());

        try{
            driver.findElement(By.xpath("//div[text()='Try your Best -M']")).isDisplayed();
            System.out.println("New statement was added");
        }catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Adding new statement FAILED");
        }

//        5. Delete newly added statement
//         We use try catch to avoid program to stop if element is not there.
            try{
                WebElement newStatement = driver.findElement(By.xpath(
                        "//div[text()='Try your Best -M']/following-sibling::div//button[contains(@class, 'btn-outline-danger')]"
                ));
                newStatement.click();
            }catch (NoSuchElementException e){
                e.printStackTrace();
            }
            Thread.sleep(3000);

//        6. Verify it was deleted
        List<WebElement> deletedElement = driver.findElements(By.xpath("//div[text()='Try your Best -M']"));

        if(deletedElement.size() == 0){
            System.out.println("PASS: Newly added statement was successfully deleted");
        }else{
            System.out.println("FAIL: Newly added statement still exists, was not deleted");
        }

        Thread.sleep(3000);
        driver.close();
    }
}