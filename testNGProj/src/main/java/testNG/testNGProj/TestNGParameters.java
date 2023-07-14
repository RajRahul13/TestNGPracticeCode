package testNG.testNGProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNGParameters {
	WebDriver driver;
	// The 2nd least priority value. So this will be executed 2nd.
	@Test(priority = 1)
	public void TestMethod1() throws InterruptedException {
		startChrome();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Thread.sleep(5000);
		System.out.print("Current page title is : " + title);
		driver.close();
	}
	// Largest priority value so this will be executed last
	@Test(priority = 3)
	public void TestMethod2() throws InterruptedException {
		startChrome();
		driver.get("http://the-internet.herokuapp.com/forgot_password");
		Thread.sleep(5000);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.name("email"));
		Thread.sleep(5000);
		email.sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		cleaupProc();
	}
	//This has the lowest priority value. So this will be executed first.
	@Test(priority = 0)
	public void TestMethod3() throws InterruptedException {
		startChrome();
		driver.get("http://the-internet.herokuapp.com/");
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement forgetPasswordLink = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
		Thread.sleep(5000);
				forgetPasswordLink.click();
		Thread.sleep(5000);
				driver.close();
	}
	public void startChrome() {
		String exePath = "C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}
	public void cleaupProc() {
		System.out.print("\nBrowser close");
		driver.quit();
	}
}
