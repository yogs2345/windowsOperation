package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://money.rediff.com/losers/bse/daily/groupa");
    JavascriptExecutor js= (JavascriptExecutor) driver;
    WebElement link=driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/companies/kajaria-ceramics/11540007\"]"));
    js.executeScript("document.getElementById(\"demo\").innerHTML = \"Hello Dolly.\"");
  // js.executeScript("arguments[0].scrollIntoView()",link );
  //  js.executeScript("window.scrollBy(0,2000)");
 String name="Yogeshwari";
   int a=2;
   Integer b=2;
   Float c=3.2;
   float C=3.2f;
	}

}
