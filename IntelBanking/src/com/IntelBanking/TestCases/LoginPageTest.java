package com.IntelBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IntelBanking.PageObject.LoginPage;

public class LoginPageTest extends BaseClass{

	
	@Test
	public void loginTest() {
		driver.get(baseurl);
			logger.info("Opend URL");
		
		LoginPage ln=new LoginPage(driver);
		ln.setUsername(username);
			logger.info("Entered Username");
		
		ln.setPassword(password);
			logger.info("Entered Password");

		ln.clicklogin();
			logger.info("Clicked Login");

		if(driver.getTitle().equals("Guru")) {
			logger.info("Successfully logged");
			Assert.assertTrue(true);
		}else {
			logger.error("Error logged");
			Assert.assertTrue(false);
		}
	}

	
}
