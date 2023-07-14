package testNG.testNGProj;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleScrollBy {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Scroll on a web page using JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(3000);
		
		driver.close();
	}
}