package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com");
		
		// scroll down up to the static web table
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Table=driver.findElement(By.xpath("//h2[contains(text(),'Static Web Table')]"));
		js.executeScript("arguments[0].scrollIntoView()",Table );
				

	}

}
