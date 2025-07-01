package Selenium_Common_Topics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Action Type	Method	Site Element
Hover	moveToElement()	Menus
Right Click	contextClick()	Button
Double Click	doubleClick()	Button
Drag and Drop	dragAndDrop()	List items*/

public class Mouse_Actions {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);

        // Right Click (Context Click)
        WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
        actions.contextClick(rightClickButton).perform();
        System.out.println("Right-click performed");

        // Double Click
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickButton).perform();
        System.out.println("Double-click performed");

        // Handle Alert from double-click
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();

        driver.quit();
    }
}

/*package Selenium_Common_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the site
        driver.get("https://demo.opencart.com/");

        // Create Actions class object
        Actions actions = new Actions(driver);

        // Find the "Desktops" menu item
        WebElement desktopsMenu = driver.findElement(By.linkText("Desktops"));

        // Hover over "Desktops" menu
        actions.moveToElement(desktopsMenu).perform();

        // Click on "Mac (1)" under Desktops
        WebElement macOption = driver.findElement(By.linkText("Mac (1)"));
        macOption.click();

        // Optionally, wait or print a message
        System.out.println("Clicked on Mac (1) under Desktops");

        // Close browser
        driver.quit();
    }
}*/


/*package Selenium_Common_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.id("menu"));
        actions.moveToElement(menu).click().perform();

    }
}*/