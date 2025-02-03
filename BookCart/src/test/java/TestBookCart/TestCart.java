package TestBookCart;
import BaseSetup.Setup;
import org.junit.jupiter.api.Test;
import PageBookCart.LoginPageObjectsAndMethods;
import PageBookCart.AddItemToCartAndCheckOut;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class TestCart extends Setup {


    @Test
    public void testAddItemAndCheckout() {
        LoginPageObjectsAndMethods loginPage = new LoginPageObjectsAndMethods(driver);
        AddItemToCartAndCheckOut cartPage = new AddItemToCartAndCheckOut(driver);

        loginPage
                .clickLoginbttn()
                .enterUsername("idaaa2111")
                .enterPassword("asijamerjem21A")
                .clickLoginButton();


        cartPage
                .selectItem()
                .addToCart()
                .openCart()
                .proceedToCheckout()
                .enterShippingAddress("Ida",
                        "Behdzeta Mutevelica",

                        "Hifzi Bjelevca",

                        "345678",

                        " New York"
                )
                .scrollToElementAndClick();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.urlToBe("https://bookcart.azurewebsites.net/myorders"));

    assertEquals(driver.getCurrentUrl(), "https://bookcart.azurewebsites.net/myorders", "URL nije tačan.");

}}




