package MultiplePracticeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {
	static WebDriver driver;
	public static void main(String[]arg)throws InterruptedException {
		//driver=new WebDriver();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Windows.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		OpenNewTabbedWindows();
		openNewSeperateWindows();
		openSeperateMultipleWindows();
		
	}
	public static void OpenNewTabbedWindows() {
	// Locate the OpenNewTabbedWindows element
		WebElement firstTab=driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String>allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		List<String>WindowHandles=new ArrayList<String>(allWindows);
		driver.switchTo().window(WindowHandles.get(1));
		driver.switchTo().window(mainWindow);
	//	driver.close();
	}
	public static void openNewSeperateWindows() {
		 // Locate the openNewSeperateWindows element
		WebElement secondTab=driver.findElement(By.xpath("//a[@href='#Seperate']"));
		secondTab.click();
		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	//	driver.close();
		
	}
	
     public static void openSeperateMultipleWindows() throws InterruptedException {
    	WebElement thirdTab=driver.findElement(By.xpath("(//a[@class='analystic'])[3]")) ;
    	thirdTab.click();
    	driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
    	String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String>allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		List<String>WindowHandles=new ArrayList<String>(allWindows);
		driver.switchTo().window(WindowHandles.get(2));
	//	driver.switchTo().window(mainWindow);
		WebElement EmailIdForSignUp=driver.findElement(By.xpath("//input[@id='email']"));
		EmailIdForSignUp.sendKeys("yogs2345@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id=\"enterimg\"]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
    	
    	
     }
}
		


