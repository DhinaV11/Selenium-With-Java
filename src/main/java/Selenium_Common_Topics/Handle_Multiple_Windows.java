package Selenium_Common_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Handle_Multiple_Windows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                System.out.println("Title: " + driver.getTitle());
            }
        }
        driver.switchTo().window(parent);

    }
}
