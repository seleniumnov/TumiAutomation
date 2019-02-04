package orders.registered;

import java.util.Map;

import org.testng.annotations.Test;

import com.tumi.dataProvider.ReadTestData;
import com.tumi.utilities.GenericMethods;
import com.tumi.utilities.UIFunctions;

/**
 * @author Shwetha Capo
 *
 */
public class RegisterOrderWithVoucher extends GenericMethods {
	Map<String, String> testData = ReadTestData.getJsonData("TumiTestData", "GuestOrders");

	/*
	 * TA-189 Verify Order with merchandise Ready to ship + Voucher Code-Registered
	 * User
	 * 
	 */
	@Test(description = " Verify Order with merchandise Ready to ship + Voucher Code-Registered User")
	public void orderWithVoucherAsRegistered() throws Exception {
		login("TumiTestData", "RegisteredOrders");
		UIFunctions.addProductToCart("TumiTestData", "GuestOrders");
		click(pdp.getAddToCart(), "Add to cart");
		click(minicart.getProceedCheckOut(), "Proceed to Checkout");
		click(mainCart.getProceedToCheckout(), "Proceed to Checkout");
		domClick(signinShip.getAddNewAddress(), "Add new Address");
		UIFunctions.addGuestDetails();
		UIFunctions.addPromotionalCodeAtSinglePage("TumiTestData", "GuestOrders");
		domClick(shipping.getContinueShippingMethod(), "Contiue Shipping");
		click(shipMethod.getProceedToPayment(), "Proceed to Payment");
		domClick(signinBill.getAddNewPay(), "Add new Payment");
		UIFunctions.addCardDetails("TumiTestData", "GuestOrders");
		UIFunctions.completeOrder();
	}

}