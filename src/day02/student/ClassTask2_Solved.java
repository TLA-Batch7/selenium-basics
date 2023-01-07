package day02.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    /**
     * 1. Create a method that takes a String parameter.
     * Method should return number of words String parameter has.
     * 2. Set up the driver in main method
     * 3. Open http://automation.techleadacademy.io
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 4. Open https://techleadacademy.io
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 5. Open https://amazon.com
     *      - get title of the page and store in a variable
     *      - print out how many words does the title consist of
     *      - close the driver
     * 6. Compare above titles and print out which one has the most letters
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io");
        String title1 = driver.getTitle();
        System.out.println(title1);
        System.out.println(returnNumberOfWords(title1));
        driver.close();

        driver = new ChromeDriver();
        driver.get("https://google.com");
        String title2 = driver.getTitle();
        System.out.println(title2);
        System.out.println(returnNumberOfWords(title2));
        driver.close();

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String title3 = driver.getTitle();
        System.out.println(title3);
        System.out.println(returnNumberOfWords(title3));
        driver.close();


        if (title1.length() > title2.length() && title1.length() > title3.length()) {
            System.out.println("This title has the most letters: " + title1);
        }
        if (title2.length() > title1.length() && title2.length() > title3.length()) {
            System.out.println("This title has the most letters: " + title2);
        } else {
            System.out.println("This title has the most letters: " + title3);
        }



    }

    public static int returnNumberOfWords(String str){
        String[] arr = str.split(" ");
        return arr.length;
    }
}
