package com.qa.Util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.TestBase.Launch_Browser;

public class Utility extends Launch_Browser {

	public static void screenshot(){
		String path = "D:\\velocity Training\\setup\\New_work_space\\Maven_Project1\\ScreenShot\\"+System.currentTimeMillis()+".png";
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File F = new File(path);
		
		try {
			FileHandler.copy(src,F);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
