package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\OneDrive\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	
	//	WebElement element = 
				driver.findElement(By.name("firstname")).sendKeys("rahul ");
				driver.findElement(By.name("lastname")).sendKeys("raj ");
				driver.findElement(By.id("sex-1")).click();
				driver.findElement(By.id("exp-2")).click();
				driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("13/08/2021");
	//	element.sendKeys("rahul ");
		Thread.sleep(4000);
		
		driver.quit();
		
	}


}

