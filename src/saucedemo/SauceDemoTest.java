package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemoTest {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //Setup the Chrome Browser
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximise the browser
        driver.manage().window().maximize();



        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);


        //print the current url
        driver.get(baseUrl);
        Thread.sleep(5000);

        //print the page source
        driver.getPageSource();
        Thread.sleep(5000);

        //Enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("hello@yahoo.com");
        Thread.sleep(5000);

        //Enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("hello123");
        Thread.sleep(5000);

        //Click on login button
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(5000);

        //print the current url
        driver.getCurrentUrl();
        System.out.println("The current url : " +  driver.getCurrentUrl());

        //Navigate to baseUrl
        driver.navigate().back();

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.quit();

















    }


}
