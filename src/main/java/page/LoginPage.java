package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	} 
	//webelement
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Sign in')]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//Intractable method
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
		}
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		}
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	public void loginIn(String username, String password) {
		USERNAME_ELEMENT.sendKeys();
		PASSWORD_ELEMENT.sendKeys();
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
		
		
	
}
