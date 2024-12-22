package MultiplePracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;     


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindowsOperation {
    WebDriver driver;
// Launch the browser and open the url
    public void BasicOperation(){
    //    driver=new WebDriver()
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,700)");
    }
    //  Locate the webElement new tab
    public void newTabOperation() {
        WebElement Tab1 = driver.findElement(By.xpath("//button[@id='tabButton']"));
        Tab1.click();
        List<String> WindowHandles=new ArrayList<String>(driver.getWindowHandles());
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
    }
    public void switchingToSingleWindowByRefferingTheSequenceOfThereOpening() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        List<String> WindowHandles = new ArrayList<String>(allWindows);
        driver.switchTo().window(WindowHandles.get(1)); // if we know sequence ofn window opening then we have to switch to
        // sequence no.-1 like if any window is openingnin 4th no. so we have write driver.switchTo().window(WindowHandles.get(3));
        driver.switchTo().window(mainWindow);//after performing operation if you require you may come to main window

    }
    // below code is important interview point of view
        public void switchingBetweenMultipleWindowByVerifyingThePageTitle(){
            String mainWindow=driver.getWindowHandle();
            Set<String> allWindows=driver.getWindowHandles();
            List<String> WindowHandles=new ArrayList<String>(allWindows);

            for(int i = 0;i<WindowHandles.size();i++) {
                System.out.println("Total windows opened"+" "+WindowHandles.size());
                if(driver.switchTo().window(WindowHandles.get(i)).getTitle().equals("targeWindowPageTitle")){//here we already switched to the target window
                    // and we are verifying the target window title
                //  write the code for performing the operation
                }

            }
            driver.switchTo().window(mainWindow);//after performing operation if you require you may come to main window
    }


    public static void main(String[] args) {
        OpenNewTabbedWindows();
        OpenNewSeperateWindows();
    }
    public static void OpenNewTabbedWindows(){

    }
    public static void OpenNewSeperateWindows(){

    }


}
