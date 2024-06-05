package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	String username= "demo@codefios.com";
	String password ="abc123";
	
	@Test
	public void validUSerShouldBeAbleToLoginIn() throws Exception {
		
		driver = BrowserFactory.setup();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.validateLoginPage();
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}

}
