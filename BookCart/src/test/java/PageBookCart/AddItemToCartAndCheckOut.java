package PageBookCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddItemToCartAndCheckOut {

    public WebDriver driver;

    @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[2]/div/div[3]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[2]")
    public WebElement Selectitem;

    @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[4]")
    public WebElement addToCartButton;

    @FindBy(xpath = "/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/span[3]")
    public WebElement cartButton;

    @FindBy(xpath = "//span[normalize-space(text())='CheckOut']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//input[contains(@class,'mat-mdc-input-element')][1]")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@placeholder" +
            "='Address Line 1']")
    public WebElement addressBox1;

    @FindBy(xpath = "//*[@id=\"mat-input-4\"]")
    public WebElement addressBox2;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    public WebElement pinCodeBox;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    public WebElement stateBox;

    @FindBy(xpath = "(//button[contains(@class,'mdc-button mdc-button--raised')])[1]")
    public WebElement placeOrderButton;

    public AddItemToCartAndCheckOut(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AddItemToCartAndCheckOut selectItem() {
        assertTrue(Selectitem.isDisplayed(), "Proizvod nije pronađen.");
        Selectitem.click();
        return this;
    }

    public AddItemToCartAndCheckOut addToCart() {
        assertTrue(addToCartButton.isDisplayed(), "Dugme 'Add to Cart' nije pronađeno.");
        return this;
    }

    public AddItemToCartAndCheckOut openCart() {
        assertTrue(cartButton.isDisplayed(), "Dugme za korpu nije pronađeno.");
        cartButton.click();
        return this;
    }
    public AddItemToCartAndCheckOut proceedToCheckout() {
        assertTrue(checkoutButton.isDisplayed(), "Dugme za Checkout nije pronađeno.");
        checkoutButton.click();
        return this;
    }

    public AddItemToCartAndCheckOut scrollToElementAndClick() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", placeOrderButton);
        assertTrue(placeOrderButton.isDisplayed(), "Dugme 'Place Order' nije vidljivo.");
        placeOrderButton.click();
        return this;
    }


    public AddItemToCartAndCheckOut enterShippingAddress(String name, String address1, String address2, String zipCode, String state) {
        nameBox.clear();
        nameBox.sendKeys(name);

        addressBox1.clear();
        addressBox1.sendKeys(address1);

        addressBox2.clear();
        addressBox2.sendKeys(address2);

        pinCodeBox.clear();
        pinCodeBox.sendKeys(zipCode);

        stateBox.clear();
        stateBox.sendKeys(state);
        return this;
    }
}
