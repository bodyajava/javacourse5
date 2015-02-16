package tests;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestPhantomJS {
	private WebDriver driver;
	
	@Test
	public void runLocalPhantomJSBrowser() throws MalformedURLException {			
		DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("phantomjs");
			
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/"), capabilities);
		
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}