package qaclickacademy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetChromeWebdriver {
	@BeforeTest
	@Test
	public void chromedriver(){
		System.out.println("Setting-up System Property");
		System.setProperty("webdriver.chrome.driver", "C://WebDriver//new//chromedriver.exe");
	}

}
