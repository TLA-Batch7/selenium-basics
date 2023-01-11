package day05.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    /**
     * 1. Open "https://www.howstuffworks.com/"
     * 2. Click on navigation button
     * 3. Verify h1 header has same text as navigation button
     * 4. Apply logic on step 3 to all pages from navigation bar
     */

    public static void main(String[] args) throws InterruptedException {
        //"Health", "Science", "Home & Garden", "Auto", "Tech", "Garden", "Money", "Lifestyle", "Entertainment",
        //"Adventure", "Animals", "Quizzes", "Coupons"

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.howstuffworks.com/");

        String[] arr = {"Health", "Science", "Home & Garden", "Auto", "Tech", "Culture", "Money", "Lifestyle", "Entertainment",
                "Adventure", "Animals", "Quizzes", "Coupons"};

        for(String s: arr){
            driver.findElement(By.linkText(s)).click();
            Thread.sleep(1000);
            System.out.println(s + " | " + s.toUpperCase().equals(driver.findElement(By.tagName("h1")).getText()));
        }

        driver.close();
    }
}
