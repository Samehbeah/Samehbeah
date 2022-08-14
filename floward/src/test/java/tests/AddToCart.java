package tests;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.floward.CartPage;
import com.floward.HomePage;
import com.floward.ProductsPage;



public class AddToCart extends TestBase {
	String countryName = "Kuwait";
	String categoryName="Plants";
	String productName = "Orchid Glass";
	String ExpectedCartPage = "https://floward.com/en-kw/checkout/cart";
	HomePage homePage;
	CartPage cartPage;
	ProductsPage productsPage;


	@Test
	public void checkAddToCart() {
		homePage = new HomePage(driver);
		homePage.selectCountry(countryName);
		productsPage= new ProductsPage(driver);
		productsPage.selectCategory(categoryName);
		productsPage.selectProduct(productName);
		productsPage.continueToCartPage();
		String ActualCartPage= driver.getCurrentUrl();
		Assert.assertEquals(ActualCartPage, ExpectedCartPage);
		cartPage= new CartPage(driver);
		assertTrue(cartPage.isProductInCartPage(productName));
		





	}

}
