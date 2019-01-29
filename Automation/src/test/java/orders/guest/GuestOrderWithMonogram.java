package orders.guest;

import java.util.Map;

import org.testng.annotations.Test;

import com.tumi.dataProvider.ReadTestData;
import com.tumi.utilities.GenericMethods;
import com.tumi.utilities.UIFunctions;

/**
 * @author Shwetha Capo
 *
 */
public class GuestOrderWithMonogram extends GenericMethods {
	Map<String, String> testData = ReadTestData.getJsonData("TumiTestData", "GuestOrders");

	/*
	 * TA-48 
	 * Verify Order with merchandise Ready to ship + Personalization for
	 * Guest User.
	 */
	
	@Test(description = "Verify Order with merchandise Ready to ship + Personalization for  Guest User.")
	public void orderWithMonogramAsGuest() {
		UIFunctions.addProductToCart("TumiTestData","GuestOrders");
		UIFunctions.addMonogram("TumiTestData", "GuestOrders");
		click(pdp.getAddToCart(),"Add to cart");
		click(minicart.getProceedCheckOut(), "Proceed to Checkout");
		click(mainCart.getProceedToCheckout(), "Proceed to Checkout");
		input(singlePage.getEmailAddress(), testData.get("EmailID"), "Email ID");
		//UIFunctions.waitForContinueToEnable();
		click(singlePage.getContinueAsGuest(), "Contiue as Guest");
		UIFunctions.addGuestDetails();
		click(shipping.getContinueShippingMethod(), "Contiue Shipping");
		click(shipMethod.getProceedToPayment(), "Proceed to Payment");
		UIFunctions.addCardDetails("TumiTestData", "GuestOrders");
		UIFunctions.completeOrder();
	}

}
