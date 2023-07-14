package testNG.testNGProj;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HiddenDivisionPopUp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\testNGProj\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		//Open the given webpage
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(3000);
		driver.findElement(By.className("cd-popup-trigger")).click();
		Thread.sleep(3000);
		//Send text to the Name field on overlay
		driver.findElement(By.xpath("(//div[@class='cd-popup-container']//input)[1]")).sendKeys("Hidden Division Text");
		Thread.sleep(3000);
		driver.close();
	}
}