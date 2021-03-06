package com.tumi.webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.tumi.reports.Reports;
import com.tumi.utilities.GenericMethods;

public class OrderReviewPage extends GenericMethods {
	
	public OrderReviewPage(WebDriver driver) {
		Reports.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[1]")
	private WebElement editShippingAddress;
	
	public WebElement getEditShippingAddress() {
		
		return editShippingAddress;
	}
	
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[2]")
	private WebElement editShippingMethod;
	
	public WebElement getEditShippingMethod() {
		
		return editShippingMethod;
	}
	
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[3]")
	private WebElement editPayment;
	
	public WebElement getEditPayment() {
		
		return editPayment;
	}
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Order Summary')]")
	private WebElement orderSummary;
	
	public WebElement getOrderSummary() {
		
		return orderSummary;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Place Order')]")
	private WebElement placeOrder;
	
	public WebElement getPlaceOrder() {
		
		return elementToBeClickable(placeOrder);
		//return explicitWait(placeOrder);
	}
	@FindBy(how=How.XPATH,using="//section[@id='confirmation-info-ctnr']/div/div/b")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Review Your Order')]")
	private WebElement reviewOrder;

	public WebElement getreviewOrder() {
		return explicitWait(reviewOrder);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//script[@id='checkoutMessages']/following::span[1]")
	private WebElement checkoutMessages;

	public WebElement getCheckoutMessages() {
		return explicitWait(checkoutMessages);
	}
	@FindBy(how=How.XPATH,using="//section[@id='shipping-section-ctnr']/div[1]/section/section/div/header/a")
	private WebElement ProductSelect;

	public WebElement getProductSelect() {
		return explicitWait(ProductSelect);
	}
	@FindBy(how=How.XPATH,using="//section[@id='delivery-info-ctnr']/div[2]/header")
	private WebElement ShippingMethod;

	public WebElement getShippingMethod() {
		return explicitWait(ShippingMethod);
	}
	@FindBy(how=How.XPATH,using="//section[@id='address-info-ctnr']/div[2]/div/header")
	private List<WebElement> ShippingAddress;

	public  List<WebElement> getShippingAddress() {
		return ShippingAddress;
	}
	
	@FindBy(how=How.XPATH,using="//section[@id='payment-section-ctnr']/section[2]/div[1]/div/header")
	private WebElement PaymentDetails;

	public WebElement getPaymentDetails() {
		return explicitWait(PaymentDetails);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__title-13']/div")
	private WebElement Label1;

	public WebElement getLabel1() {
		return explicitWait(Label1);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__title-14']/div")
	private WebElement Label2;

	public WebElement getLabel2() {
		return explicitWait(Label2);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__title-15']/div")
	private WebElement Label3;

	public WebElement getLabel3() {
		return explicitWait(Label3);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__body-13']/div/p")
	private WebElement Labeldata1;

	public WebElement getLabeldata1() {
		return explicitWait(Labeldata1);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__body-14']/div/div/p")
	private WebElement Labeldata2;

	public WebElement getLabeldata2() {
		return explicitWait(Labeldata2);
	}
	@FindBy(how=How.XPATH,using="//div[@id='accordion__body-15']/div//div/div[2]")
	private WebElement Labeldata3;

	public WebElement getLabeldata3() {
		return explicitWait(Labeldata3);
	}
	
	
}
