package Selenium_Common_Topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); // or alert.dismiss()

    }
}
