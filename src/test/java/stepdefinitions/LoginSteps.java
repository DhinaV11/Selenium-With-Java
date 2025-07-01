package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on the Practice Test login page")
    public void user_is_on_the_practice_test_login_page() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("user should be navigated to the logged-in page")
    public void user_should_be_navigated_to_the_logged_in_page() {
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("Login failed or redirected to wrong page", expectedUrl, actualUrl);

        boolean logoutVisible = driver.findElement(By.linkText("Log out")).isDisplayed();
        assertTrue("Logout button is not visible", logoutVisible);

        driver.quit();
    }
    @When("user enters invalid username and valid password")
    public void user_enters_invalid_username_and_valid_password() {
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("user enters valid username and invalid password")
    public void user_enters_valid_username_and_invalid_password() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
    }

    @When("user does not enter username and password")
    public void user_does_not_enter_username_and_password() {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
    }

    @Then("user should see an error message {string}")
    public void user_should_see_an_error_message(String expectedMessage) {
        String actualMessage = driver.findElement(By.id("error")).getText();
        assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }

}
