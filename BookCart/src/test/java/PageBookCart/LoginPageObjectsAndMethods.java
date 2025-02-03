package PageBookCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPageObjectsAndMethods {

    public WebDriver driver;
    public By loginbttn = By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]");
    public By usernameField = By.xpath("//input[@placeholder='Username']");
    public By passwordField = By.xpath("//input[contains(@class,'mat-mdc-input-element ng-tns-c1534922977-2')]");
    public By loginButton = By.xpath("/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button");

    public LoginPageObjectsAndMethods(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageObjectsAndMethods clickLoginbttn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBttnElement = wait.until(ExpectedConditions.elementToBeClickable(loginbttn));
        loginBttnElement.click();
        return this;
    }

    public LoginPageObjectsAndMethods enterUsername(String idaaa2111) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        usernameInput.clear();
        usernameInput.sendKeys(idaaa2111);
        return this;
    }

    public LoginPageObjectsAndMethods enterPassword(String asijamerjem21A) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordInput.clear();
        passwordInput.sendKeys(asijamerjem21A);
        return this;
    }

    public LoginPageObjectsAndMethods clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
        return this;
    }



    }

