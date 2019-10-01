package org.testcases;


import org.pages.LoginPage;

import org.testbase.Maintest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Maintest {
	LoginPage login;
	
	 public LoginTest() {
		super();
	}
	
@BeforeMethod
public void setUP() {
	intilize();
	driver.get(prop.getProperty("url"));
	 login = new LoginPage();
	}
@Test(priority=1)
 public void intiteLogin() {
	System.out.println("open page");
	 login.clickLogin();
}

@Test(priority=2)
public void  login() {
	login.loginp(prop.getProperty("username"),prop.getProperty("password") );
}


}

