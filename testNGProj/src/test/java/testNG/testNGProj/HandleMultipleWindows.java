package testNG.testNGProj;
//this pgm does not have multiple windows use another url;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleMultipleWindows{
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\rahul\\\\\\\\eclipse-workspace\\\\\\\\testNGProj\\\\\\\\Driver\\\\\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		//Maximizes the browser window
		driver.manage().window().maximize();
		
		//To open the Naukri Website with multiple windows
		driver.get("http://www.naukri.com/");
		
		//It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		System.out.println(driver.switchTo().window(mainWindow).getTitle());
		
		//It returns number of windows opened by the WebDriver
		Set<String> set =driver.getWindowHandles();
		System.out.println(set.size());
		
		//Use Iterator
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();

			//Compare whether the main window is not equal to the child window.
			//If not equal, it will close.
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		//Switch to the Main Window
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		driver.quit();
	}
}