package Selenium_Common_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Handling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Select dropdown = new Select(driver.findElement(By.id("country")));
        dropdown.selectByVisibleText("India");
    }
}
