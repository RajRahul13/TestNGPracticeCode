package testNG.testNGProj;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
		@Test
		public void display() {
			Reporter.log("This is demo testNG Class");
		}
		
}
