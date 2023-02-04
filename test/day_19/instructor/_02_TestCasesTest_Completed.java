package day_19.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _02_TestCasesTest_Completed {
    /**
     * Implement test cases from demo User Story
     */
    @Test (testName = "US001")
        public void testLogin1(){
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

        @Test (testName = "US002")
        public void testLogin2(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://interview-prep-test.herokuapp.com");

            String username = "";
            String password = "test123";

            //Input username/password
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);

            //click login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            //Verify Incorrect username/password text is

            WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

            Assert.assertTrue(loginText.isDisplayed());
            Assert.assertEquals(loginText.getText(), "Incorrect username/password");

            driver.close();
        }
        @Test (testName = "US003")
        public void testLogin3(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://interview-prep-test.herokuapp.com");

            String username = "test@yahoo.com";
            String password = "";

            //Input username/password
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);

            //click login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            //Verify Incorrect username/password text is
            WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

            Assert.assertTrue(loginText.isDisplayed());

            driver.close();
        }
        @Test (testName = "US004")
        public void testLogin4(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://interview-prep-test.herokuapp.com");

            String username = "qqq@yahoo.com";
            String password = "test123";

            //Input username/password
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);

            //click login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            //Verify Incorrect username/password text is
            WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

            Assert.assertTrue(loginText.isDisplayed());

            driver.close();
        }
        @Test (testName = "US005")
        public void testLogin5(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://interview-prep-test.herokuapp.com");

            String username = "";
            String password = "";

            //Input username/password
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);

            //click login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            //Verify Incorrect username/password text is
            WebElement loginText = driver.findElement(By.xpath("//div[text()='Incorrect username/password']"));

            Assert.assertTrue(loginText.isDisplayed());

            driver.close();
        }
    }

