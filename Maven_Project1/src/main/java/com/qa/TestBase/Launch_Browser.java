package com.qa.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.qa.PageLayer.Demoblaze_Home_Page;
import com.qa.Util.Listners1;
import com.qa.Util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Launch_Browser {
	
	String br = "chrome";
	String url = "https://www.demoblaze.com";
	
	public static WebDriver driver;
	public static Demoblaze_Home_Page demoblaze;
	public static Utility util;
	
	
	@BeforeClass
	public void start() {
		if(br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		else if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		}
		else if(br.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		demoblaze = new Demoblaze_Home_Page();
		util = new Utility(); 
	
	}
	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}
}
