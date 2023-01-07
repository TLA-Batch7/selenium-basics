package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NAVIGATION METHODS. Refer to 1st image in README.md
public class _01_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //NAVIGATION METHODS

        //1. Navigate to
        driver.navigate().to("https://google.com");

        //2. Navigate back
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
//        Thread.sleep(3000);

        //3. Navigate refresh
        driver.navigate().refresh();
//        Thread.sleep(3000);

        //4. navigate() vs get()
        /*
        get() - method will wait for the page to finish loading
        navigate() - method will not wait and will proceed running the next line
        of code immediately after opening the browser and entering the URL
         */

        driver.close();

        //NOTE: ClassTask1 after completing of this demo

    }
}

