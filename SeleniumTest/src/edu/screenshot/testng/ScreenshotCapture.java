package edu.screenshot.testng;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotCapture {
  @Test
  public void captureScreenshot() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\OneDrive\\Desktop\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://phptravels.com/");
	  
	  //converting driver into take screenshot interface typecasting
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  
	  //path where screenshot is going to be saved
	  File fs= ts.getScreenshotAs(OutputType.FILE);
	  
	  //destination where file will be stored
	  FileUtils.copyFile(fs,new File("./screenshot1/screenshot1.png"));
	  
	  
  }
}
