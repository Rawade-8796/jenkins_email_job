package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.Launch_Browser;

public class Execution extends Launch_Browser {
	@Test
	public void verifySonyVaioi5() throws InterruptedException {
		Thread.sleep(3000);
		demoblaze.verifyLaptops();
		Thread.sleep(3000);
		demoblaze.verifySonyvaioi5();
	}

}
