package tests;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class TestPhantomJS {
	private WebDriver driver;
	
	@Test
	public void runLocalPhantomJSBrowser() {			
		driver = new PhantomJSDriver();
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}