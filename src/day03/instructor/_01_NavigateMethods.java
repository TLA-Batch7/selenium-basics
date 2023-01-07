package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//NAVIGATION METHODS. Refer to 1st image in README.md
public class _01_NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //NAVIGATION METHODS

        //1. Navigate to

        //2. Navigate back

        //3. Navigate refresh

        //4. navigate() vs get()


        driver.close();

        //NOTE: ClassTask1 after completing of this demo

    }
}

