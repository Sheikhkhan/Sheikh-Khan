package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;
import com.util.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


	public class Loginstepdef {
		WebDriver driver;
	    Highlighter color;
	    
		@Given("^user is on oscommerce website$")
		public void user_is_on_oscommerce_website() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khan\\workspace\\oscommerce\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			color = new Highlighter(driver);
			driver.get("https://demo.oscommerce.com/");
			
		}

		
		
		@When("^user clicks on my account$")
		public void user_clicks_on_my_account() throws Throwable {

			color.drawBorder(driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")),"PINK");
			driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")).click();

		}

		@When("^user enters  valid credentials$")
		public void user_enters_valid_credentials() throws Throwable {
	        color.drawBorder(driver.findElement(By.xpath("//*[@name='email_address']")), "BLUE");
			driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys("shaazi1@aol.com");
			color.drawBorder(driver.findElement(By.xpath("//*[@name='password']")), "purple");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Nawaz12");

		}

		@Then("^user able to log in$")
		public void user_able_to_log_in() throws Throwable {

			driver.findElement(By.xpath("(//*[@class='ui-button-text'])[4]")).click();
			ScreenShot.captureScreenShot(driver, "CommerceLogin");
		}
	}

//		@When("^User clicks on mouse$")
//		public void user_clicks_on_mouse() throws Throwable {
//			driver.findElement(By.xpath("//*[@href='https://demo.oscommerce.com/product_info.php?products_id=3']")).click();
	//
//		}
	//
//		@When("^User clicks on add to cart$")
//		public void user_clicks_on_add_to_cart() throws Throwable {
//			driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]")).click();
//		}
	//
//		@Then("^Add to cart page is displayed$")
//		public void add_to_cart_page_is_displayed() throws Throwable {
//			if (driver.getTitle().equalsIgnoreCase("osCommerce Demo")) {
//				System.out.println("Test Pass");
//			} else {
//				System.out.println("Test Fail");
//			}
	//
//		}
	//
//		@When("^user updates the number of mouse to two$")
//		public void user_updates_the_number_of_mouse_to_two() throws Throwable {
//			driver.findElement(By.xpath("(//*[@type='text'])[1]")).clear();
//			driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("2");
	//
//		}
	//
//		@When("^user updates number of mouse in cart$")
//		public void user_updates_number_of_mouse_in_cart() throws Throwable {
//			driver.findElement(By.xpath("(//*[@type='text'])[1]")).submit();
//		}
	//
//		@Then("^value changes to two$")
//		public void value_changes_to_two() throws Throwable {
	//
//			if (driver.findElement(By.xpath("(//*[contains(text(),'$79.98')])[1]")).getText().equalsIgnoreCase("$79.98")) {
	//
//				System.out.println("Test Pass");
//			} else {
//				System.out.println("Test Fail");
	//
//			}
//			
//		}
	//	
//		@When("^user clicks check out button$")
//		public void user_clicks_check_out_button() throws Throwable {
//		       driver.findElement(By.xpath("(//*[@class='ui-button-text'])[6]")).click();
//		}
	//	
//		@When("^user clicks on continue button$")
//		public void user_clicks_on_continue_button() throws Throwable {
//		       driver.findElement(By.xpath("(//*[@class='ui-button-text'])[6]")).click();
//		}
	//


