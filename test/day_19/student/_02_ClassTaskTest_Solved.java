package day_19.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _02_ClassTaskTest_Solved {
    /**
     * Implement test cases
     */
    @Test(testName = "US1002 Login page")
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://interview-prep-test.herokuapp.com");

        String username = "test@yahoo.com";
        String password = "test123";

        //Input username/password
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        //click login button
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify Sign out button is displayed
        Assert.assertTrue(driver.findElement(By.xpath("//u[text()='Sign out']")).isDisplayed());

        driver.close();
    }
    @Test (testName = "US1003 Verify dashboard")
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Login
        driver.get("https://interview-prep-test.herokuapp.com");
        String username = "test@yahoo.com";
        String password = "test123";
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify dashboard buttons are displayed
        List<WebElement> dashboard = driver.findElements(By.xpath("//a[@class='m-2']//button"));
        for(WebElement each : dashboard){
            Assert.assertTrue(each.isDisplayed());
        }

        driver.close();
    }
    @Test (testName = "US1004 Verify header", description = "Header is Interview Prep")
    public void test3 (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Login
        driver.get("https://interview-prep-test.herokuapp.com");
        String username = "test@yahoo.com";
        String password = "test123";
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify header
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Interview Prep");

        driver.close();
    }
    @Test(testName = "US1005 Add comment")
    public void test4(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Login
        driver.get("https://interview-prep-test.herokuapp.com");
        String username = "test@yahoo.com";
        String password = "test123";
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify add comment in do section
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='btn btn-success badge-pill newbtn mb-3']")).isEnabled());
    }
    @Test (testName = "US1006 Edit and Delete comment")
    public void test5(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Login
        driver.get("https://interview-prep-test.herokuapp.com");
        String username = "test@yahoo.com";
        String password = "test123";
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //Verify edit and delete button in do section
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='btn btn-outline-danger ml-1'][last()]")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='btn btn-sm-outline-warning'][last()]")).isEnabled());
    }
}
