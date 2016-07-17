
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestSignOnPage{

	public static final String SIGNON_URL="http://newtours.demoaut.com/mercurysignon.php";
	public static final String EXPECTED_TITLE="Sign-on: Mercury Tours";
	private ChromeDriver driver;

	@Before
	public void openBrowser(){
		// Create Chrome browser instance
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyTitle() throws Exception{

		// Navigate to new tours signOn page
		driver.get(SIGNON_URL);

		// assert page title
		assertEquals("Verify title "+EXPECTED_TITLE,EXPECTED_TITLE,driver.getTitle());

	}

	@After
	public void closeBrowser(){
		// Close the browser instance
		driver.quit();
	}
}
