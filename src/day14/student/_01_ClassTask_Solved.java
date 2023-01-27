package day14.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {

    /**
     * 		a. Open practice website -> iframes section
     * 		b. In Budget Tracker website:
     * 			i. add one transaction
     * 				your name + some numbers
     * 			ii. capture Total Amount
     * 		c. In Shared Note website input captured data
     * 			a. Title - your name
     * 			b. Note section:
     * 				1. Transaction - Amount
     * 			c. Click save
     * 			d. Find newly entered note in left column and click on it
     *          e. Verify if Title on right section is your name and print out the text
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //a. Open practice website -> iframes section
        driver.get("http://automation.techleadacademy.io/#/iframes");

        driver.switchTo().frame("parent-iframe");
        driver.switchTo().frame("budget-tracker");

        /**
         * b. In Budget Tracker website:
         *      i. add one transaction
         *      your name + some numbers
         *      ii. capture Total Amount
         */
        driver.findElement(By.id("t-name")).sendKeys("Kuba");
        driver.findElement(By.id("t-amount")).sendKeys("55");

        driver.findElement(By.id("add-btn")).click();
        String total = driver.findElement(By.id("total")).getText();

        //switching to main window
        driver.switchTo().defaultContent();

        //switch to notes frame
        driver.switchTo().frame("note");

        //input values
        driver.findElement(By.className("note-title")).sendKeys("Kuba");
        driver.findElement(By.className("note-textarea")).sendKeys(total);

        //click Save button
        driver.findElement(By.xpath("//i[contains(@class, 'save-note')]")).click();

        Thread.sleep(2000);

        //click on saved item
        String buttonText = driver.findElement(By.xpath("//span[text()='Kuba']")).getText();
        driver.findElement(By.xpath("//span[text()='Kuba']")).click();

        String actualTitle = driver.findElement(By.xpath("//input[@class='note-title']")).getAttribute("value");

        //verify if button name and title is the same
        if (actualTitle.equals(buttonText)){
            System.out.println("PASS: Matched");
        }else {
            System.out.println("FAIL: Did not match");
        }

        //print out value
        System.out.println(driver.findElement(By.xpath("//textarea[@class='note-textarea']")).getAttribute("value"));


        //delete the note
        driver.findElement(By.xpath("//span[text()='Kuba']/following-sibling::i")).click();

        Thread.sleep(3000);

        driver.close();

    }
}
