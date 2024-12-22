package MultiplePracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act=new Actions(driver);
	//	act.scrollToElement(driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')][1]"))).build().perform();
	  //  act.clickAndHold(driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"))).build().perform();
	 //   String locationOfFirstButton=driver.findElement(By.xpath("//span[@id='min-amount']")).getText();
    //.moveToElement(locationOfFirstButton).build().perform();
    //    Thread.sleep(3000);
        
  //      String locationOfFirstButton1="229";
   //     System.out.println();
        
   //     String locationOfFirstButton=driver.findElement(By.xpath("//span[@id='min-amount']")).getLocation();
		WebElement Slider= driver.findElement(By.xpath("//label[text()='Price range:']")); // vertical scroll
		act.moveToElement(Slider).build().perform();
	// Doubt need to discuss 	
		
	//	WebElement Source=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));// from left to right scroll
		
		//WebElement Target=driver.findElement(By.xpath("//input[@id='amount']"));
		WebElement Source=driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		WebElement Target=driver.findElement(By.xpath("//input[@id='amount']"));
		Thread.sleep(5000);
	//	act.clickAndHold(Source).moveToElement(Target).release().perform();
	//	Source.sendKeys(Keys.END);
	//	Target.sendKeys(Keys.LEFT);
	//	Target.sendKeys(Keys.RIGHT);
		Source.sendKeys(Keys.LEFT);
		Source.sendKeys(Keys.RIGHT);
		Source.sendKeys(Keys.END);
		//Target.sendKeys(Keys.END);
	}

}
