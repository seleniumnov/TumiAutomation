package com.tumi.utilities;

import org.openqa.selenium.support.PageFactory;

import com.tumi.pageObjects.HomePage;

public class TumiLibs extends GenericMethods {
	
	public static void closeSignUp() {		
		try {
			HomePage home = PageFactory.initElements(driver, HomePage.class);
			click(home.getSignupPopup(), "Close SignUp Window");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeSignUpForUS() {		
		try {
			HomePage home = PageFactory.initElements(driver, HomePage.class);
			driver.switchTo().activeElement();
			domClick(home.getSignupPopupUS(), "Close SignUp Window");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void acceptCookies() {
		try {
			HomePage home = PageFactory.initElements(driver, HomePage.class);
			domClick(home.getAcceptCookies(), "Accept Cookies");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
