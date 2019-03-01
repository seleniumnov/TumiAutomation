package tumi.home;

import java.util.Map;

import org.testng.annotations.Test;

import com.tumi.dataProvider.ReadTestData;
import com.tumi.utilities.GenericMethods;
import com.tumi.utilities.UIFunctions;

public class Quickshop extends GenericMethods {
	
	Map<String, String> testData = ReadTestData.getJsonData("TumiTestData", "GuestDetails");

	/*
	 * TA-65 Verify Quick shop in PGP.
	 */
	@Test
	public void VerifyQuickShop() {
		
		mouseHover(home.getLuggageOption());
		click(pgp.getCarryOnLuggage(), "Carry on Luaggage");
		click(pgp.getQuickShop(), "QuickShop");
		click(pgp.getQuickShopAddtoCart(), "QuickShop Add to Cart");
		click(minicart.getProceedCheckOut(), "Proceed to Cart");
		click(mainCart.getProceedCart(), "Proceed to Checkout");
		input(singlePage.getEmailAddress(), testData.get("EmailID"), "Email ID");
		UIFunctions.waitForContinueToEnable();
		click(singlePage.getContinueAsGuest(), "Contiue as Guest");
		UIFunctions.addGuestDetails();
		click(shipping.getContinueShippingMethod(), "Contiue Shipping");
		click(shipMethod.getProceedToPayment(), "Proceed to Payment");
		UIFunctions.addCardDetails("TumiTestData", "GuestOrders");
		UIFunctions.completeOrder();
	}
}