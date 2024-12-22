package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapMultiselectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Colors=driver.findElement(By.xpath("//div[contains(@class,'ui-autocomplete-multiselect')]"));
	//	js.executeScript("window.ScrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,1000)");
	//  js.executeScript("argument[0],scrollIntoView(True)",Languages);
		

	}

}
