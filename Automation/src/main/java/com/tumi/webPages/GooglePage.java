package com.tumi.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.tumi.reports.Reports;
import com.tumi.utilities.GenericMethods;

/**
 * @author Shwetha Capo
 *
 */
public class GooglePage extends GenericMethods{
	
	public GooglePage(WebDriver driver) {
		Reports.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//li[@id='janrain-googleplus']/a")
	private WebElement googleLogin;
	
	public WebElement getGoogleLogin() {
		return googleLogin;
	}
	
	 @FindBy(how=How.XPATH, using="//div[@jsname='rwl3qc']")
		private WebElement useAnotherAcc;
		
		public WebElement getUseAnotherAcc() {
			return useAnotherAcc;
		}
		
	@FindBy(how=How.XPATH, using="//div[@id='identifierNext']")
			private WebElement firstNext;
			
			public WebElement getFirstNext() {
				return firstNext;
			}
			//input[@name='identifier']		
    @FindBy(how=How.XPATH, using="//input[@id='identifierId']")
	private WebElement email;
	
	public WebElement getEmail() {
		return explicitWait(email);
	}
	
	@FindBy(how=How.XPATH, using="//div[@id='password']/div/div/div/input")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(how=How.XPATH, using="//div[@id='passwordNext']")
	private WebElement passwordNext;
	
	public WebElement getPasswordNext() {
		return passwordNext;
	}
	
	@FindBy(how=How.XPATH, using="//div[@id='submit_approve_access']")
	private WebElement allow;
	
	public WebElement getAllow() {
		return allow;
	}
	
	@FindBy(how=How.XPATH, using="submit_deny_access")
	private WebElement cancel;
	
	public WebElement getCancel() {
		return cancel;
	}
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'No Thanks')]")
	private WebElement noThanks;
	
	public WebElement getNoThanks() {
		return explicitWait(noThanks);
	}
	
	/*@FindBy(how=How.XPATH, using="submit_deny_access")
	private WebElement cancel;
	
	public WebElement getCancel() {
		return cancel;
	}*/
	
	
	
	
	
	
	

}
