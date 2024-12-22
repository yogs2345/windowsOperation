package MultiplePracticeProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class WithoutSelectClassDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	WebElement LanguageBox=	driver.findElement(By.xpath("//div[@id='msdd']"));
	Actions action=new Actions(driver);
//	action.scrollFromOrigin(LanguageBox, 0, 0);
action.	scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(LanguageBox),0,200).build().perform();
		
LanguageBox.click();
		
List<WebElement> ListOfLanguages=driver.findElements(By.xpath("//li[@class='ng-scope']"));
for(WebElement Element:ListOfLanguages) {
	System.out.println(Element.getText());
	if(Element.getText().equals("Arabic")) {
		Element.click();
	}
	if(Element.getText().equals("Bulgarian")) {
		Element.click();
	}
	
}
 List<WebElement>ListOfSelectedLanguages=driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-close']/parent::div"));
 List<WebElement>ListOfcrossSymbol=driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-close']"));
	 int i;
	 for(i=0;i<ListOfSelectedLanguages.size();i++) {
		 if(ListOfSelectedLanguages.get(i).getText().contains("Bulgarian")) {
			 ListOfcrossSymbol.get(i) .click();
			 
		 }
	 }
	}

}

