package testNG.testNGProj;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class KeyboardActions {
	public static void main(String[] args) throws Exception {

		//Initialize the WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		//Go to the URL
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='content']/ul/li[31]/a")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Get the text box on the new page
		WebElement keyPressTextBox = driver.findElement(By.id("target"));
		Thread.sleep(2000);
		//Handle Multiple Actions
		Actions act = new Actions(driver);
		Action seriesOfActions =
				act.moveToElement(keyPressTextBox).click().keyDown(keyPressTextBox,Keys.SHIFT).sendKeys(keyPressTextBox,"edureka").keyUp(keyPressTextBox,Keys.SHIFT).doubleClick(keyPressTextBox).contextClick().build();
		Thread.sleep(2000);
		seriesOfActions.perform();
		Thread.sleep(2000);
		//Close the browser
		driver.close();
	}
}