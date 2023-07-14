package testNG.testNGProj;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlejavascriptAlerts {
	@Test
	public void HandleAlertsMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
		//Create a new instance of ChromeDriver and redirect to the
		//Base URL
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium" );
		//Maximizes the Browser Window
		driver.manage().window().maximize() ;
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;// it is an interface , so we can't instantiate it using new JavascriptExecutor()
		js.executeScript("window.scrollTo(0,1000)");//page scrolling
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(1000,0)");
		
		Thread.sleep(5000);

		//Handling Simple Alerts
		//Click on the "Generate Alert" button
		driver.findElement(By.xpath("//button[contains(text(),\"Generate Alert Box\")]")).click();
		Thread.sleep(3000);

		//Use Alert class to switch to the alert box
		Alert alert = driver.switchTo().alert();

		//Use accept() method to accept the Alert
		alert.accept();
		Thread.sleep(3000);

		//Handling Confirmation Alerts
		//Click on "Generate Confirm Box" button
		driver.findElement(By.xpath("//button[contains(text(),\"Generate Confirm Box\")]")).click();
		Thread.sleep(3000);

		Alert confirmBox = driver.switchTo().alert();

		//Use dismiss() command to dismiss the confirmation alert
		//Similarly, accept() method could be used to accept the
		//confirmation alert
		confirmBox.dismiss();
		Thread.sleep(3000);
		//close the web browser
		driver.close();
	}
}

