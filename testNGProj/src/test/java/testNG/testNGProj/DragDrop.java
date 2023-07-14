package testNG.testNGProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class DragDrop {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();

		//Launch the Website
		driver.navigate().to("http://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
	

		//WebElement on which drag and drop operation needs to be performed

		WebElement from = driver.findElement(By.id("column-a"));
		Thread.sleep(2000);
		//WebElement to which the above object is dropped
		WebElement to = driver.findElement(By.id("column-b"));
		Thread.sleep(2000);
		//Create an object of Actions class to build composite actions
		Actions act = new Actions(driver);
		//Perform drag and drop action
		Action dragAndDrop=act.clickAndHold(from).moveToElement(to).release(to).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		driver.quit();
	}
}