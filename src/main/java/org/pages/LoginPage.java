package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testbase.Maintest;

public class LoginPage extends Maintest {
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement start;
	
	@FindBy(xpath="//div[@class='input']//input[@id='user_session_email']")
	WebElement username;
	
	////div[@class='input']//input[@id='user_session_password
	@FindBy(xpath="//div[@class='input']//input[@id='user_session_password']")
	WebElement passwd;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement sunmit_btn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		}
	public void clickLogin() {
			start.click();
			lo.info("click the login page");
	}
	
	public HomePage loginp(String usere , String upassword) {
		start.click();
		username.sendKeys(usere);
		passwd.sendKeys(upassword);
		 sunmit_btn.click();
		 System.out.println("login  Success -loginpage");
		 return new HomePage();
	}

	
}