package testNG.testNGProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class App {
	// Create the object of chrome driver
	
	WebDriver driver;
	@Test
	public void App1 () throws InterruptedException {
		String title = driver.getTitle();
		System.out.print("Current page title is : " + title);
		WebElement forgetPasswordLink = driver.findElement(By.xpath("//a[@href='/forgot_password']"));
				forgetPasswordLink.click();
				WebElement email = driver.findElement(By.name("email"));
				email.sendKeys("abc@gmail.com");
				WebElement retrievePassword = driver.findElement(By.cssSelector("i.icon-2x"));
				retrievePassword.click();
	}

	// BeforeMethod is a TestNG annotation. When assigned this annotation to any method It will be executed before executing any test method.
	@BeforeMethod
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
	// AfterMethod is a TestNG annotation. When assigned this annotation to an method It will be executed after executing any test method.
	@AfterMethod
	public void cleaupProc() {
		System.out.print("\nBrowser close");
		driver.quit();
	}
}