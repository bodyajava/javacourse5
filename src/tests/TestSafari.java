package tests;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestSafari {
	private WebDriver driver;
	
	@Test
	public void runLocalSafariBrowser() {			
		driver = new SafariDriver();
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}

