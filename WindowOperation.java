package MultiplePracticeProgram;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOperation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		String MainWindow=driver.getWindowHandle();
	//	Set<String> AllWindows=driver.getWindowHandles();
	//	for(int i=0; i<AllWindows.size(); i++) {
		//	System.out.println(AllWindows.size());
		//	System.out.println(AllWindows.get(i));
	//	}
		System.out.println(MainWindow);
		driver.close();

	}

}
