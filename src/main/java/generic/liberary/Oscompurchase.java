package generic.liberary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oscompurchase {

	
		WebDriver driver;
			
			
			public void getsetup() {
			System.setProperty("webdriver.gecko.driver", "/home/mahbub/WebDrivers/geckodriver_linux64/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://demo.oscommerce.com/");
			
			}
	
	
	
	
	
}
