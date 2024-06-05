package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	@FindBy(how = How.XPATH, using= "//input[@id='user_name']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using= "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using= "//button[@id='login_submit']") WebElement SIGNIN_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using= "//span[text()='Codefios                ']") WebElement LOGINPAGE_ELEMENT;
	
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);	
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickOnSignInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	public void validateLoginPage() {
		String ActualText= LOGINPAGE_ELEMENT.getText();
		Assert.assertEquals(ActualText, "Codefios", "Page not Found");
		System.out.println(ActualText);
	}
	
	
	

}
