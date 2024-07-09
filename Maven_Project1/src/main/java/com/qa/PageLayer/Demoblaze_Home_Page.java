package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Launch_Browser;

public class Demoblaze_Home_Page extends Launch_Browser {
	
	@FindBy(xpath="(//a[contains(@id,'itemc')])[2]")
	private WebElement laptop;
	
	@FindBy(xpath="(//a[contains(text(),'Sony vaio i50')])")
	private WebElement sonyvaioi5;
	
	public Demoblaze_Home_Page(){
		PageFactory.initElements(driver,this);
	}
	
	public void verifyLaptops() {
		laptop.click();
	}
	
	public void verifySonyvaioi5() {
		sonyvaioi5.click();
	}
}
