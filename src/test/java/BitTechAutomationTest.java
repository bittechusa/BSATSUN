import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BitTechAutomationTest 
{
	FirefoxDriver browser = new FirefoxDriver();
	
	@Before
	public void start()
	{
		browser.get("http://www.facebook.com");
		
	}
	
	@After
	public void end()
	{
		browser.quit();
	}
	
	@Test
	public void login()
	{
		browser.findElement(By.id("email")).sendKeys("asad@gmail.com");
	}

}

