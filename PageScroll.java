package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.idealized.Javascript;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.get("https://www.amazon.com.au/");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// scroll down up to the  somewhere middle of the page
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js.executeAsyncScript("window.scrollTo(0,2000)");
		js.executeScript("window.scrollTo(0,1400)");
	//	js.executeScript("window.scrollTo(0,-1000)");
		

		// scroll up the specific product
	//	WebElement product=driver.findElement(By.xpath("//img[contains(@alt,'Clothing & accessories')]"));
	//	js.executeScript("argument[0].scrollIntoView()",product);
		
	// scroll up to the end of the page
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		// scroll the horizontal slider
		WebElement Hslider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider')]"));
		
		js.executeScript("document.getElementByXpath('Hslider').scrollLeft+=250", " ");
	//	Hslider.sendKeys(Keys.END);// it will scroll horizontally at the end of the page
		//Hslider.sendKeys(Keys.valueOf("250"));
	//	js.executeScript("window.scrollIntoView()",Hslider );
		
		
	}

}
