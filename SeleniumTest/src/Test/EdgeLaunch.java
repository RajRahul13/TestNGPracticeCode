package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\rahul\\OneDrive\\Desktop\\WebDrivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 driver.navigate().to("http://www.google.com/");  
		
		Thread.sleep(2000);
		driver.quit();


	}

}
