package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.util.Highlighter;
import com.util.ScreenShot;

public class OStestNG {

	WebDriver driver;
	Highlighter color;

	@BeforeTest
	public void getsetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khan\\workspace\\oscommerce\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		color = new Highlighter(driver);
		driver.get("https://demo.oscommerce.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void user_clicks_on_my_account() throws Throwable {

		color.drawBorder(driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")), "PINK");
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")).click();
		color.drawBorder(driver.findElement(By.xpath("//*[@name='email_address']")), "BLUE");
		driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys("shaazi1@aol.com");
		color.drawBorder(driver.findElement(By.xpath("//*[@name='password']")), "purple");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Nawaz12");
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[4]")).click();
		ScreenShot.captureScreenShot(driver, "CommerceLogin");

	//}

	//public void user_clicks_on_mouse() throws Throwable {
		driver.findElement(By.xpath("//*[@href='https://demo.oscommerce.com/product_info.php?products_id=3']")).click();
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]")).click();
		if (driver.getTitle().equalsIgnoreCase("osCommerce Demo")) {
			System.out.println("Test Pass");
		}

		else {
			System.out.println("Test Fail");
		}

		driver.findElement(By.xpath("(//*[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("2");

		driver.findElement(By.xpath("(//*[@type='text'])[1]")).submit();

		if (driver.findElement(By.xpath("(//*[contains(text(),'$79.98')])[1]")).getText().equalsIgnoreCase("$79.98")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[6]")).click();
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[6]")).click();
		
	}
}


