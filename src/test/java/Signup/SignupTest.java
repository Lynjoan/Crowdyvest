package Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Wait;
import static java.util.concurrent.TimeUnit.SECONDS;

public class SignupTest {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https//www.crowdyvest.com/");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("firstname")).sendKeys("lynda");
        driver.findElement(By.id("lastname")).sendKeys("Godwin");
        driver.findElement(By.id("email")).sendKeys("lynzjoan@gmail.com");
        driver.findElement(By.id("phone number")).sendKeys("08035578017");
        driver.findElement(By.id("password")).sendKeys("Testcodecamp@2.0");
        driver.findElement(By.id("confirm password")).sendKeys("Testcodecamp@2.0");
        driver.findElement(By.id("continue")).click();
}
    public static void main(String args[]) throws InterruptedException {
        SignupTest test = new SignupTest();
                     test.setUp();
    }
}

