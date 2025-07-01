package Selenium_Common_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.switchTo().frame("frameName");
        driver.findElement(By.id("insideFrame")).click();
        driver.switchTo().defaultContent();
    }
}
