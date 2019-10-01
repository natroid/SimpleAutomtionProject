package org.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testbase.Maintest;

public class HomePage extends Maintest {
	
	@FindBy(xpath="//a[@href='#']")
	//@FindBy(xpath="//a[@class='dropdown-toggle']']")
	WebElement verifyuser;
	
	@FindBy(xpath="//a[text()='Create a group']")
	WebElement clickgroup;

	public HomePage() {
		PageFactory.initElements(driver, this);
		//intilize();
		//LoginPage loginpg = new LoginPage();
		//loginpg.loginp(prop.getProperty("username"),prop.getProperty("password") );
	}
	
	public boolean verifythePageUser() {
		System.out.println("name "+verifyuser.getText());
	return verifyuser.isDisplayed();
		
	}
	
	
	
	public CreateGroupPage clicktheEvent() {
		System.out.println("click the user");
		verifyuser.click();
		System.out.println("1");
		Actions action =new  Actions(driver);
		System.out.println("2");
		action.moveToElement(verifyuser).build().perform();
		clickgroup.click();
		System.out.println("group clicked");
		return new CreateGroupPage();
		}
		
	}
	

