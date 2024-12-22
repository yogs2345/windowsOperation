package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
		  JavascriptExecutor js = (JavascriptExecutor)driver;
				  driver.manage().window().maximize();
				  driver.manage().deleteAllCookies();
				  driver.get("https://testautomationpractice.blogspot.com/");
				//  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//  js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
				  // to type text in a textBox
				  js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Yogeshwari';");
				  
				  // To click on a search button
				  
				  WebElement Search = driver.findElement(By.xpath("//input[@type='submit']"));
				 js.executeScript("arguments[0].click();",Search);
				  
				//  Search.click();
	}

}
