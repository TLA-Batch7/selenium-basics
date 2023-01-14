package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_WarmUpDemo_Resolved {
    /**
     * day05.ClassTask2
     *  Inputs page
     * 1. Create an array of String with test data
     * 2. Capture all input elements using common locator
     * 3. Input test data above using loop
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/inputs");

//        1. Create an array of String with test data
        String[] data = {"John", "Smith", "j.smith@test.com", "222-222-2222", "Address", "NYC", "New York", "12345"};

//        2. Capture all input elements using common locator
        List<WebElement> inputs = driver.findElements(By.cssSelector(".form-control"));

//        3. Input test data above using loop

        //Solution 1: work backwards through loop
        for(int i = inputs.size()-1; i >= 3; i--){
            inputs.get(i).sendKeys(data[i-3]);
        }

//        Solution 2: work forwards through loop starting at index 3
//        for(int i = 3; i <= inputs.size(); i++){
//            inputs.get(i).sendKeys(data[i-3]);
//        }

        Thread.sleep(3000);

        driver.close();

        //Note: ClassTask1 after demo
    }


}
