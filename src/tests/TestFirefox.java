package tests;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFirefox {
	private WebDriver driver;
	
	@Test
	public void runLocalFireFoxBrowser() {			
		driver = new FirefoxDriver();
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}
