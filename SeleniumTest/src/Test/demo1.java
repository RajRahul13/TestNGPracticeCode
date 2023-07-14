package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\OneDrive\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver1.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.close();
		driver1.close();
	}

}
