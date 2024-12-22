package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultiFunctionalSystem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("First Page:"+" "+driver.getTitle());
		// verify the page title----------doubt need to discuss
		//WebElement Title=driver.findElement(By.xpath("//h1[@class='title']"));
		//System.out.println(Title);
		
		//String actualTitle=driver.getTitle();
	//	String expectedTitle=  "Automation Testing Practice";
		//Assert.assertTrue(expectedTitle,actualTitle);
	//	Assert.assertTrue(actualTitle,expectedTitle);
		
	//	assertTrue(driver.getTitle().contains("Title of Page"));
		
		// Locate the element Name and enter the value in name textBox
	/*	WebElement NameTxt=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Name')]"));
		NameTxt.sendKeys("Yogeshwari");
		System.out.println(NameTxt.getText());
		
		// Locate the Email and enter the value in Email textBox
		WebElement EmailTxt=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter EMail')]"));
		EmailTxt.sendKeys("yogs2345@gmail.com");
		
		// Enter the phone number
		WebElement PhoneTxt=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Phone')]"));
		PhoneTxt.sendKeys("9657821634"); */
		
		// Enter the address
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement AddressTxt=driver.findElement(By.xpath("//textarea[@id='textarea']"));
		js.executeScript("window.scrollTo(0,1400)");
		
	/*	AddressTxt.sendKeys("Bhanapeth ward,no.3,Raghuvir Chowck,Chandrapur");
		
		//  Select the gender
		WebElement Gender=driver.findElement(By.xpath("//input[@id='female']"));
		Gender.click();
		
		// Select the checkbox
		
		WebElement Checkbox=driver.findElement(By.xpath("//input[@id='monday']"));
		
		// check wheather the checkbox is enabled in the website
		if(Checkbox.isDisplayed())
		{
			System.out.println("checkbox is displayed");
		} else {
			System.out.println("checkbox is not displayed");
		}
		
		// checkbox is enabled in the website
		if(Checkbox.isEnabled())
		{
			System.out.println("Checkbox is Enabled");
		} else
		{
			System.out.println("Checkbox is Enabled");
			
		}
		// check if checkbox is already selected? if not selected already ,click on checkbox
		if(Checkbox.isSelected()) {
			System.out.println("Checkbox is already selected");
		}else {
			Checkbox.click();
		}
		Thread.sleep(2000);
		
		// select the menu from Country
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		
		// Check Whether dropdown is displayed in the Website
		  if(Dropdown.isDisplayed()) {
			  System.out.println("Dropdown is displayed");
		  } else {
			  System.out.println("Dropdown is not displayed");
		  }
		
		//  Check Whether dropdown is enabled in the WebSite
		  if(Dropdown.isEnabled()) {
			  System.out.println("Dropdown is enabled");
		  }else {
			  System.out.println("Dropdown is not enabled");
			  
		  }
		  // Select option  // the below three sections will not work simultaneously
		  Select S=new Select(Dropdown);
		//  S.selectByValue("usa");
		  S.selectByIndex(3);
	//	  S.selectByVisibleText("France");
		  
		  // Multiselect Dropdown
		  // Locate the element 'Colors' multiselection box
		WebElement Colors=driver.findElement(By.xpath("//select[@id='colors']"));
		
		//Check whether multiple selection is allowed
		Select M=new Select(Colors);
		if(M.isMultiple()) {
			System.out.println("Multiple selection is allowed");
			}
		else {
			System.out.println("Multiple selection is not allowed");
		}
		// select multiple option using select Method
		M.selectByIndex(1);
		M.selectByValue("red");
		M.selectByVisibleText("Green");
		
		// locate the element 'Sorted List' Multiselection Box
		WebElement SortedList=driver.findElement(By.xpath("//select[@id='animals']"));
		
		// check wheather the multiple selection is allowed.
		Select M1=new Select(SortedList);
		if(M1.isMultiple()) {
			System.out.println("Multiple selection is allowed");
		}
		else {
			System.out.println("Multiple selection is not allowed");
		}
		// select multiple option using select method.
		M1.selectByIndex(0);
		M1.selectByValue("deer");
		M1.selectByVisibleText("Dog");
		
		// verify the selected option
		String SelectedOption=M1.getFirstSelectedOption().getText();
		System.out.println(SelectedOption);
		
		// upload single File
		WebElement SingleFile=driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		
		SingleFile.sendKeys("C:\\Users\\DELL\\Downloads");
		
		// Locate the Element upload File
		WebElement UploadFile=driver.findElement(By.xpath("//button[contains(text(),'Upload Single File')]"));
		UploadFile.click();
		
		// upload multiple files
		WebElement MultipleFiles=driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
		MultipleFiles.sendKeys("C:\\Users\\DELL\\Downloads");
		MultipleFiles.sendKeys("C:\\Users\\DELL\\Videos\\Icecream Screen Recorder");
		MultipleFiles.sendKeys("C:\\Users\\DELL\\Downloads");
		
		// Locate the Element upload  Multiple File
		WebElement UploadMultipleFile=driver.findElement(By.xpath("//button[contains(text(),'Upload Multiple Files')]"));
		UploadMultipleFile.click();
	//	UploadMultipleFile.click();*/
		
		// horizontal price bar
	//	WebElement PriceRangeSlider=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
	//	Thread.sleep(2000);
	//	PriceRangeSlider.sendKeys(Keys.END);
		
		// Dynamic button
	//	WebElement DynamicButton=driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
	//	Thread.sleep(2000);
		
	//	DynamicButton.click();
     //	DynamicButton.click();
     
		// Simple Alert
	//	WebElement SimpleAlert=driver.findElement(By.xpath("//button[@id='alertBtn']"));
	//	SimpleAlert.click();
	//	Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss(); // this method is used when cancel button is there
		
		//Confirmation Alert
	//	WebElement ConfirmationAlert=driver.findElement(By.xpath("//button[@id='confirmBtn']"));
	//	ConfirmationAlert.click();
	//	Thread.sleep(3000);
	//	driver.switchTo().alert().dismiss();
	//	driver.switchTo().alert().accept();
		
    // Prompt Alert // doubt need to discuss
	/*	WebElement PromptAlert=driver.findElement(By.xpath("//button[@id='promptBtn']"));
		PromptAlert.click();
		Thread.sleep(3000);
Alert TextBox=driver.switchTo().alert();
System.out.println(TextBox.getText());
Thread.sleep(3000);
driver.switchTo().alert().sendKeys("Yogeshwari");
Thread.sleep(3000);
System.out.println(driver.switchTo().alert().getText());
Thread.sleep(3000);
driver.switchTo().alert().accept();

//TextBox.sendKeys("Yogeshwari");
//Thread.sleep(3000);
//System.out.println(TextBox.getText());
//TextBox.accept(); */
		

// open the new tab
		
	/*	WebElement NewTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		Thread.sleep(3000);
		NewTab.click();*/
		
		// second Method to open the new tab
	/*	driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());*/
		
		// open the new window
	//	WebElement Window=driver.findElement(By.xpath("//button[@id='PopUp']"));
	//	 Window.click();
	//	WebElement Window1=driver.findElement(By.xpath(""));
		 
		 // second method to open the new window
		// driver.switchTo().newWindow(WindowType.WINDOW); // doubt
		
		
		
		// MOUSE HOVER
		// Move the mouse over the button to open the dropdown menu.
		Actions actions=new Actions(driver);
		WebElement PointMeBtn=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		actions.moveToElement(PointMeBtn).build().perform();
	
		
		// Double Click
	//	WebElement Field1=driver.findElement(By.xpath("//input[@id='field1']"));
	//	WebElement Field2=driver.findElement(By.xpath("//input[@id='field2']"));
	//	actions.doubleClick(Field1).build().perform();
		
		// Double click on button, the text from Field1 will be copied into Field2.
		WebElement CopyText=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		actions.doubleClick(CopyText).build().perform();
		
		//  Drag and Drop the element
		WebElement Source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target=driver.findElement(By.xpath("//div[@id='droppable']"));
		actions.dragAndDrop(Source, Target).build().perform();
	
		
		
	}
	

		
	}


