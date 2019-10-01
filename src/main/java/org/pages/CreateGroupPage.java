package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testbase.Maintest;

public class CreateGroupPage extends Maintest {
	HomePage homepage;
	public CreateGroupPage() {
		PageFactory.initElements(driver, this);
				
	}
	
			
	@FindBy(xpath="//input[@tabindex='1'] ")
	WebElement enterGroupname;
	@FindBy(xpath="//a[@class='dropdown-toggle']']")
	WebElement verifyuser;
	
	
	@FindBy(id="group_memberships_attributes_1_user_attributes_name")
	WebElement firstname;
	@FindBy(id="group_memberships_attributes_1_user_attributes_email")
	WebElement firstemail;
	
	@FindBy(id="group_memberships_attributes_2_user_attributes_name")
	WebElement secondname;
	@FindBy(id="group_memberships_attributes_2_user_attributes_email")
	WebElement secondemail;
	@FindBy(id="group_memberships_attributes_3_user_attributes_name")
	WebElement thirdname;
	@FindBy(id="group_memberships_attributes_3_user_attributes_email")
	WebElement thirdemail;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit_btn;
	
		
	
	public void createGroupDetails( String groupvalue,String fname, String FEmail,String sname, String sEmail,String tname, String tEmail ) {
		enterGroupname.sendKeys(groupvalue);
		firstname.sendKeys(fname);
		firstemail.sendKeys(FEmail);
		secondname.sendKeys(sname);
		secondemail.sendKeys(sEmail);
		thirdname.sendKeys(tname);
		thirdemail.sendKeys(tEmail);
		submit_btn.click();
		}
	

}
