package testNG.testNGProj;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class HandleMultipleTabs {
		public static void main(String args[]) throws InterruptedException {

			//Declaring variables
			String baseUrl;

			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
			//default nastance of chromedriver
			WebDriver driver=new ChromeDriver();
			

			//Implicit wait for five seconds
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// Assign the URL to be invoked to a String variable
			baseUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
			
			//Create a new instance of ChromeDriver and redirect to the Base URL
			driver.get(baseUrl);
			//Get current window handle
			String parentWinHandle = driver.getWindowHandle();
			System.out.println("Parent window handle: " + parentWinHandle);
			//Locate 'Click to open a new browser window!' button using id
			WebElement newWindowBtn = driver.findElement(By.id("win1"));
			//Click the button to open a new window
			newWindowBtn.click();
			//Get the window handles of all the windows that are open
			Set<String> winHandles = driver.getWindowHandles();
			System.out.println(winHandles.size());
			//Loop through all handles
			for(String handle: winHandles){
				if(!handle.equals(parentWinHandle)){
					driver.switchTo().window(handle);
					Thread.sleep(1000);
					System.out.println("Title of the new window: " +driver.getTitle());
					System.out.println("Closing the new window...");
					driver.close();
				}}
			//Switching the control back to parent window
			driver.switchTo().window(parentWinHandle);
			//Print the URL to the console
			System.out.println("Parent window URL: " +driver.getCurrentUrl());
			driver.close();
		} }
