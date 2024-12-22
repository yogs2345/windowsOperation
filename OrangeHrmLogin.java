package MultiplePracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement Username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Username')]")));
	        Actions actions=new Actions(driver);
	      
	     //   WebElement Username=driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
	        actions.moveToElement(Username).click() .sendKeys("Admin").build().perform();
	        Thread.sleep(3000);
	        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Password')]")));
	        
	     //   WebElement Password=  driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
	        actions.moveToElement(Password).click() .sendKeys("admin123").build().perform();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	        Thread.sleep(3000);
	        driver.close();

	}

}
