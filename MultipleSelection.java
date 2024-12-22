package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch the browser
		WebDriver driver=new ChromeDriver();
		
		// maximise the browser
		driver.manage().window().maximize();
		
		// delete all cookie
		driver.manage().deleteAllCookies();
		
	/*	// open the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//  Locate the username Element and store the element in username variable.
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		
		
		// Locate the password Element and store the element in password variable.
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		
		// check wheather username and password element is displayed in the website.
		if(username.isDisplayed()&&password.isDisplayed()) {
			System.out.println("username and password are available");
			} else {
				System.out.println("username and password are not available");
			}
		
		// check wheather username and password element is enabled in the website.
		if(username.isEnabled()&&password.isEnabled()) {
			System.out.println("username and password are Enabled");
			} else {
				System.out.println("username and password are not Enabled");
				
			}
		
		//  clear the previous values in Username and Password elements
		username.clear();
		password.clear();
	
		//  //Wait for 3000 milli sec.
		      Thread.sleep(3000);
		
        //  9. Update/enter data in Username and Password Fields
		      username.sendKeys("Admin");
		      password.sendKeys("admin123");
		      System.out.println("Values updated in username and password");
		      
		// 10. Locate the Element and store element in 'signInButton' variable
		      WebElement signInButton  = driver.findElement(By.xpath("//button[text()=' Login ']"));
		      
		//  11.Check Whether button is displayed in the Website
		      if(signInButton.isDisplayed() ) {
		    	  System.out.println(" signInButton  is available");
		      }else {
		    	  System.out.println(" signInButton  is not  available");
		    	  }
		      
		//  12. Check Whether button is enabled in the WebSite
		        if(signInButton.isEnabled()) {
		        	 System.out.println(" signInButton  is Enabled");
		        } else {
		        	System.out.println(" signInButton  is  not Enabled");
		        }
		      
		//  13. Clik on Sign In Button
		        signInButton.click();
		        
        //  14. Wait for Pageload - Wait for 10 sec
		        Thread.sleep(3000); */
		        
		//   15. Navigate to Job page
		      driver.navigate().to("https://demo.automationtesting.in/Register.html");
		      
		   //  Locate the element 'Language' multiselection box
		      
		      JavascriptExecutor js=(JavascriptExecutor)driver;
		    WebElement Language=driver.findElement(By.xpath("//div[contains(@class,'ui-autocomplete-multiselect ui-state-default ui-widget')]"));
		   //   js.executeScript("argument[0],scrollIntoView(True)",Language);
		      js.executeScript("window.scrollBy(0,1000)");
	// ----------------------Select Dropdown only----------------------------------------------------//	      
		   // Check whether multiple selection is allowed.
		     Select M=new Select(Language); // here I am getting error 
		     //Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
		     //because in html tag select tag is not present instead div tag is present so select class will not work.
		      if(M.isMultiple()) {
		    	  System.out.println("Multiple Selection is allowed");
		      } else {
		    	  System.out.println("Multiple Selection is not  allowed"); 
		      }

		      // Select multiple options using select method
		          M.selectByIndex(0);
		          M.selectByValue("2");
		          M.deselectByVisibleText("Dutch"); 
		          
		          // capture all options from the dropdown
		          //  Language.getOptions();
		          //List<WebElement>Options=Language.getOptions();
		          // System.out.println("Number of options in a dropdown:"+Options.size());
		          
		          // printing the options
		          // for(int i=0;i<Options.size();i++)
		          //System.out.println(Options.get(i).getText())
		          
		          //  enhanced for loop
		          // for(WebElement op:options){
		      //    System.out.println(op.getText());
	
// }
	
		          
		 //------------
		          
		          driver.close();

	}

	

}
