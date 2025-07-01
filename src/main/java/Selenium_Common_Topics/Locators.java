package Selenium_Common_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.linkText("Forgot Password")).click();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@test.com");


        // Optional: close browser
        driver.quit();
    }
}
