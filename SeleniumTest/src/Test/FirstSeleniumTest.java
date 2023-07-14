package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\OneDrive\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(" https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}	
}
