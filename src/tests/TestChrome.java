package tests;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome {
	private WebDriver driver;
	
	@Test
	public void runLocalChromeBrowser() {			
		driver = new ChromeDriver();
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}
