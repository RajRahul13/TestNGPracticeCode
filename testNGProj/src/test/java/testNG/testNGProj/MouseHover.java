package testNG.testNGProj;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*Import the Actions and Action classes*/
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class MouseHover{
	public static void main(String[] args) throws InterruptedException {

		String baseUrl = " http://the-internet.herokuapp.com/hovers";
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		WebElement imageElement =driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
		
		/* Instantiate a new Actions object. */
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action mouseOverImage = builder.moveToElement(imageElement).build();
		/* Use the perform() method when executing the Action object */
		mouseOverImage.perform();
		Thread.sleep(2000);
		WebElement userName =driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h5"));

		String username= userName.getText();
		System.out.println("User Name " + username);
		//moving to another mouser hover nad clicking a href element 
		WebElement image3 = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
		Action mouseHoverImage2 = builder.moveToElement(image3).build();
		WebElement userName1 =driver.findElement(By.xpath("//a[@href='/users/3']"));
		mouseHoverImage2.perform();
		userName1.click();
		
		driver.close();
	}}