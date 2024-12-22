package MultiplePracticeProgram;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class WindowOperation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
 driver.get("https://demoqa.com/browser-windows");
 JavascriptExecutor js=(JavascriptExecutor)driver;
 Thread.sleep(5000);
 js.executeScript("window.scrollTo(0,700)");
 WebElement NewTabBtn=driver.findElement(By.xpath("//button[@id='tabButton']"));
 WebElement NewWindowBtn=driver.findElement(By.xpath("//button[@id='windowButton']"));
 WebElement NewWindowMsgBtn=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
 
 // click on new tab
 NewTabBtn.click();
 Thread.sleep(5000);
 
 // check how many browser window are opened now and check them               
 List<String>WindowHandles=new ArrayList<String>(driver.getWindowHandles());      
 for(int i = 0;i<WindowHandles.size();i++) {
	 System.out.println("Total windows opened"+" "+WindowHandles.size());
	// System.out.println(WindowHandles.get(i));
	// System.out.println(WindowHandles.get(2));
	// System.out.println(NewTabBtn.getText());
	 
 }
 // switch to new browser window
 driver.switchTo().window(WindowHandles.get(1));
 WebElement NewWindow=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
 System.out.println(NewWindow.getText());
 
 // Switch to the main window
 driver.switchTo().window(WindowHandles.get(0));
 
 // Click on elements menu in the main window
 WebElement ElementMenu=driver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
 ElementMenu.click();
 
 // Click on New Window button
 NewWindowBtn.click();
 
 // // Check how many browser windows opened now and print them.
 List<String>windowHandles2=new ArrayList<String>(driver.getWindowHandles());
 for(int i=0;i<windowHandles2.size();i++) {
	 System.out.println(windowHandles2.size());
	 System.out.println(windowHandles2.get(i));
 }
 // Switch to the new browser window
 driver.switchTo().window(windowHandles2.get(1));
 WebElement NewWindowText=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
 System.out.println(NewWindowText.getText());
		 
// close the new browser window
 driver.close();
 // Switch to the main window
 driver.switchTo().window(windowHandles2.get(0));
 ElementMenu.click();

 
 
 
	}

}
