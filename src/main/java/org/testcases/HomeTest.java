package org.testcases;

import org.pages.CreateGroupPage;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.testbase.Maintest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Maintest {
	HomePage hm;
	LoginPage login;
	CreateGroupPage cgt;
	
	public HomeTest() {
		super();
	}
	@BeforeMethod
	public void setUP() {
		intilize();
		driver.get(prop.getProperty("url"));
		 login = new LoginPage();
		 hm=login.loginp(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	

	@Test(priority=1)
	public void vertifyLogin() {
		hm.verifythePageUser();
	}
	
	@Test(priority=2)
	public void clickNewgroup() {
		hm.clicktheEvent();
		
	}
	
}
