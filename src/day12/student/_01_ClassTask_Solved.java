package day12.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {
    /**
     *  URL: http://automation.techleadacademy.io/#/popup
     *  1. Click on "BMI Calculator" button
     *  2. Input height and weight
     *  3. Click on "Calculate" button
     *  4. Print out BMI Result
     *  5. Print out which category it belongs to
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");

        //1 Click on "BMI Calculator" button
        driver.findElement(By.id("bmi_btn")).click();

        //2 Input height and weight
        driver.findElement(By.name("feet")).sendKeys("5");
        driver.findElement(By.name("inch")).sendKeys("3");
        driver.findElement(By.name("weight")).sendKeys("120");

        //3 Click on "Calculate" button
        driver.findElement(By.xpath("//button[@id='calculate_btn']")).click();

        //4 Print out BMI Result
        double bmi = Double.parseDouble(driver.findElement(By.id("BMI_result")).getText());
        System.out.println("Your BMI result is: " + bmi);

        //5 Print out which category it belongs to
        if(bmi >= 30) {
            System.out.println("You are in the Obese Category");
        } else if (bmi < 18.5) {
            System.out.println("You are in the Underweight category");
        }else if (bmi >= 18.5 && bmi < 25){
            System.out.println("You are in the Normal weight category");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("You are in the Overweight category");
        }

        Thread.sleep(3000);

        driver.close();

    }
}
