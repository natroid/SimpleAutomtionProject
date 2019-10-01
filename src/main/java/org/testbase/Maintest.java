package org.testbase;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.apache.log4j.Logger;
import org.utility.WebEventListener;

public class Maintest {
	
	protected static WebDriver driver;
	protected static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlisner;
	protected Logger lo= Logger.getLogger(Maintest.class);
	public  Maintest() {
		prop =new Properties();
	
		
		try {
			FileInputStream ip = new FileInputStream("C:\\SeleniumProject\\SpliwiseAutomation\\src\\main\\java\\org\\config\\config.properties");
			prop.load(ip);
			lo.info("starting Browser");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void intilize() {
		lo.info("intilizer");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\chrome77\\chromedriver.exe");
		driver = new ChromeDriver();
		e_driver = new EventFiringWebDriver(driver);
		eventlisner = new WebEventListener();
		e_driver.register(eventlisner);
		driver = e_driver;
		lo.info("delete all cookies");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		lo.info("success");
	}
	

}
