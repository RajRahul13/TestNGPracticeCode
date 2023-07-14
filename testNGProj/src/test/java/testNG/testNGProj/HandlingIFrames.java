package testNG.testNGProj;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingIFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				//Create a new instance of ChromeDriver and redirect to the Base URL
				WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);

		//Search for IFrames

		List web_iframe = driver.findElements(By.tagName("iframe"));
		int iFrameCount = web_iframe.size();
		//Print the total number of IFrames on a given web page
		System.out.println("No. of IFrames: " + iFrameCount);
		driver.quit();
	}
}