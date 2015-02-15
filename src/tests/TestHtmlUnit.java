package tests;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class TestHtmlUnit {
	private WebDriver driver;
	
	@Test
	public void runLocalHtmlUnitBrowser() {
		
		driver = new HtmlUnitDriver();
		driver.get("http://software-testing.ru/");
		assertTrue("Text not found!", driver.getTitle().toString().contains("Software-Testing.Ru"));
		driver.quit();
	}

}