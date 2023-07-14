package testNG.testNGProj;
//download tool tip and place it on any locn use that locn in get(
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToolTip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rahul\\\\eclipse-workspace\\\\testNGProj\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\rahul\\Downloads\\9txmmrd6dx\\Additional Files\\tooltip.html");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.id("tooltip"));
		String expectedToolTip="Test";
		String actualTooltip = element.getAttribute("title");

		//Assert the tooltip's value is as expected
		System.out.println("Actual Title of Tool Tip is : "+actualTooltip);

		if(actualTooltip.equals(expectedToolTip)) {
			System.out.println("Test Case Passed");
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Test Failed");
		}

		driver.close();
	}
}