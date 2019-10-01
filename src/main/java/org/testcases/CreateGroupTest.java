package org.testcases;

import org.pages.CreateGroupPage;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.testbase.Maintest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utility.TestUtil;

public class CreateGroupTest extends Maintest {
	HomePage hm;
	LoginPage login;
	CreateGroupPage cgt;
	String sheetName = "group";
	
	
	public CreateGroupTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		intilize();
		driver.get(prop.getProperty("url"));
		 login = new LoginPage();
		System.out.println("before login");
		 hm=login.loginp(prop.getProperty("username"), prop.getProperty("password"));
		 System.out.println("success retun -creategroup");
		 System.out.println("hit the click event");
		 cgt= hm.clicktheEvent();
		}
	@DataProvider
	public Object[][] getSplittData() {
		
		Object data[][]= TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	@Test(priority=1,dataProvider="getSplittData")
	public void fillTheGroup(String groupname, String firstname,String firstemail, String secondname,String secondemail , String thirdname,String thirdemail ) {
		System.out.println("creategroup-from group");
		cgt.createGroupDetails(groupname, firstname, firstemail, secondname, secondemail, thirdname, thirdemail);
		//cgt.createGroupDetails();
	}
}
