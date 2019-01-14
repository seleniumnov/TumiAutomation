package com.tumi.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.tumi.reports.Reports;
import com.tumi.utilities.GenericMethods;

public class ShippingMethodPage extends GenericMethods {
	
	public ShippingMethodPage(WebDriver driver) {
		Reports.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH,using="//input[@id='standard-ground-net']")
	private WebElement standardShippingMethod;
	
	public WebElement getStandardShippingMethod() {
		
		return explicitWait(standardShippingMethod);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='second-day-net']")
	private WebElement secondDayShippingMethod;
	
	public WebElement getSecondDayShippingMethod() {
		
		return explicitWait(secondDayShippingMethod);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='overnight-net']")
	private WebElement priorityShippingMethod;
	
	public WebElement getpriorityShippingMethod() {
		
		return explicitWait(priorityShippingMethod);
	}
	

	@FindBy(how=How.XPATH,using="//button[contains(text(), 'Proceed to Payment')]")
	private WebElement proceedToPayment;
	
	public WebElement getProceedToPayment() {
		
		return proceedToPayment;
	}

}