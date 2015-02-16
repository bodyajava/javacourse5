package tests;

import static org.junit.Assert.assertTrue;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCloudSauceLabs {
	private WebDriver driver;
	
	//@Test
	public void runCloudBrowser() throws MalformedURLException {
		
		DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("version", "33");
        caps.setCapability("platform", "Windows 7");
        
		driver = new RemoteWebDriver(
				new URL("http://bodya48:42508be8-e1b7-45c4-a2aa-eb8cb8f88cd5@ondemand.saucelabs.com:80/wd/hub"),
				caps);
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

	//@Test
	public void runCloudDevice() throws MalformedURLException {
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("platform", "OS X 10.10");
		caps.setCapability("version", "8.1");
		caps.setCapability("deviceName","iPhone Simulator");
		caps.setCapability("device-orientation", "portrait");
        
		driver = new RemoteWebDriver(
				new URL("http://bodya48:42508be8-e1b7-45c4-a2aa-eb8cb8f88cd5@ondemand.saucelabs.com:80/wd/hub"),
				caps);
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}
	
	@Test
	public void runCloudMac() throws MalformedURLException {
		
		DesiredCapabilities caps = DesiredCapabilities.safari();
		caps.setCapability("platform", "OS X 10.10");
		caps.setCapability("version", "8.0");
        
		driver = new RemoteWebDriver(
				new URL("http://bodya48:42508be8-e1b7-45c4-a2aa-eb8cb8f88cd5@ondemand.saucelabs.com:80/wd/hub"),
				caps);
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}
	
}