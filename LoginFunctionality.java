package MultiplePracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Define WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Wait until the username field is visible and then enter the username
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            usernameField.sendKeys("Admin");

            // Wait until the password field is visible and then enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordField.sendKeys("admin123");

            // Wait until the login button is clickable and then click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            loginButton.click();

            // Add a wait for the next page load or verification, such as URL or element on the new page
            wait.until(ExpectedConditions.urlContains("dashboard"));

            System.out.println("Login successful, dashboard loaded!");
        } catch (Exception e) {
            System.out.println("An element was not found or the wait condition was not met.");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
	


	



