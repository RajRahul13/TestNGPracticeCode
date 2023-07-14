package testNG.testNGProj;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrames {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
				//Create a new instance of ChromeDriver and redirect to the Base URL
				WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(3000);
		//Locate Frame1 (Top most Frame) and store it in topframe
		WebElement topframe = driver.findElement(By.name("frame-top"));
		//Switch to Frame1
		driver.switchTo().frame(topframe);
		//Locate the Middle Frame
		//WebElement middleframe =driver.findElement(By.xpath("/html/frameset/frame[2] "));
		WebElement middleframe =driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
		//Switch to the Middle Frame
		driver.switchTo().frame(middleframe);
		//Locate the text of the Middle frame
		WebElement body = driver.findElement(By.xpath("//*[@id='content']"));
		//Print the text of the frame
		System.out.println(body.getText());
		
		
		driver.close();
	}}