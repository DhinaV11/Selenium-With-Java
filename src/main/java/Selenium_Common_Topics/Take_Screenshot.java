package Selenium_Common_Topics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Take_Screenshot {
    public static void main(String[] args) throws IOException {
        // Set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a site (example: Practice Test Automation login page)
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Save screenshot to file
        FileUtils.copyFile(src, new File("login_page.png"));

        // Close browser
        driver.quit();
    }
}
