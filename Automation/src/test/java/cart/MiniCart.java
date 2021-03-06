package cart;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tumi.dataProvider.ReadTestData;
import com.tumi.utilities.GenericMethods;

public class MiniCart extends GenericMethods {
	
	public Map<String, String> testData = ReadTestData.retrieveData("Cart", "VerifyCart");
	
	@Test(priority = 0)
	public void verifyMiniCartCount() {

		login("PlaceOrder", "TumiLogin");
		click(myacc.getMyAccountClose(), "My Account Close");
		input(home.getSearchProduct(), testData.get("SKUID"), "Search Product");
		keyEnter(home.getSearchProduct());
		try {
			if (getText(home.getNoProducts()).contains("SORRY")) {
				Assert.fail("Sorry, no search results");
			}
		} catch (Exception e) {
			
		}
		click(pdp.getAddToCart(), "Add to Cart");
		click(minicart.getContinueShopping(), "Continue Shopping");
		verifyAssertInt(parseInt(getAttributeValue(pdp.getProductQuantity())), parseInt(getText(pdp.getCartCount())));
	}
	
	@Test(priority = 6)
	public void removeProductInCart() {
		click(minicart.getProceedCheckOut(), "Proceed to Checkout");
		click(mainCart.getRemoveItemInCart(), "Remove item in cart");
		verifyAssertEquals(getText(mainCart.getShopingCartMessege()), prop.getProperty("cart.emptyCart"));
	}

}
