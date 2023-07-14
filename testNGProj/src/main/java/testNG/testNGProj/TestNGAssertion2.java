package testNG.testNGProj;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestNGAssertion2 {
	public WebDriverWait w = null;
	@Test
	public void TestAssert(){
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\rahul\\eclipse-workspace\\testNGProj\\Driver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Boolean result = title.equals("The Internet");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(result);
		//Assert.assertFalse(result);
		driver.close();
	}
}
