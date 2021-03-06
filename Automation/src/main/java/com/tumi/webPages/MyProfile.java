package com.tumi.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tumi.reports.Reports;
import com.tumi.utilities.GenericMethods;

/**
 * @author Shwetha Capo
 *
 */
public class MyProfile  extends GenericMethods{
	
	public MyProfile(WebDriver driver) {
		Reports.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@name='titleCode']")
	private WebElement krtitle;
	
	@FindBy(how=How.XPATH, using="//i[@id='profile.titleSelectBoxItArrow']")
	private WebElement title;
	public WebElement getTitle() {
		if (selectedCountry.contains("US")||
				selectedCountry.contains("Canada")) {
			return title;
			} else {
	
		return explicitWait(krtitle);
	}
	}
	//same for korea
	@FindBy(how=How.XPATH, using="//input[@id='profile.firstName']")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}
	//same for Korea
	@FindBy(how=How.XPATH, using="//input[@id='profile.lastName']")
	private WebElement surname;
	
	public WebElement getSurname() {
		return surname;
	}
	//same for korea
	@FindBy(how=How.XPATH, using="//input[@id='profile.phone']")
	private WebElement phone;
	
	public WebElement getPhone() {
		return phone;
	}
	
	//same for korea
	@FindBy(how=How.XPATH, using="//input[@id='textNotification']")
	private WebElement notifications;
	
	public WebElement getNotifications() {
		return notifications;
	}
	@FindBy(how=How.XPATH, using="//form[@id='updateProfileForm']/div[3]/button")
	private WebElement krsave;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Save Updates')]")
	private WebElement save;
 public WebElement getSave() {
	 if (selectedCountry.contains("US")||
				selectedCountry.contains("Canada")) {
				return save;
			} else {
				return explicitWait(krsave);
	
	}
	}
	@FindBy(how=How.XPATH, using="//form[@id='updateProfileForm']/div[3]/a")
	private WebElement krcancel;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Cancel')]")
	private WebElement cancel;
 public WebElement getCancel() {
	 if (selectedCountry.contains("US")||
				selectedCountry.contains("Canada")) {
		 return cancel;
			} else {
				return explicitWait(krcancel);
		
	}
	}

}



