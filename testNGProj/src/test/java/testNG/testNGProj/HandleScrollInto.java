package testNG.testNGProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleScrollInto{
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Element = driver.findElement(By.linkText("Frames"));
		//Scroll the web page till the web element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(3000);
		driver.close();
	}
}
