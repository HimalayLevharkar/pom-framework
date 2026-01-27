package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage  {

	
	
	
	private WebDriver driver;

	
	//locators 
	
	
	
	
	private By usernameTextBox = By.id("Email");

	private By passwordTextBox = By.id("Password");

	private By loginButton = By.xpath("//button[@class='button-1 login-button' and @type='submit']");

	
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	
	
	
	//Actions 
	public void enterUsername(String username) {
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public void enterPassword(String userpassword) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(userpassword);
	}

	public void clickLogin() {
		
		driver.findElement(loginButton).click();

	}

}
