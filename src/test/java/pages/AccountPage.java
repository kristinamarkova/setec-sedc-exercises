package pages;

import org.openqa.selenium.By;
import tests.BaseTest;

public class AccountPage extends BaseTest {

    // Home page objects
    By myProfileButton = By.xpath("//*[@id=\"header-right\"]/a/i");

    // Register page objects
    By registerButton = By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
    By firstNameInput = By.id("input-firstname"); // this can be used for both register & edit account ***
    By lastNameInput = By.id("input-lastname"); // this can be used for both register & edit account ***
    By emailInput = By.id("input-email"); // this can be used for both register, login & edit account ***
    By telephoneInput = By.id("input-telephone"); // this can be used for both register & edit account ***
    By passwordInput = By.id("input-password"); // this can be used for both register & login ***
    By confirmPasswordInput = By.id("input-confirm");
    By subscribeYesRadioButton = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
    By generalConditionsCheckBox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
    By confirmationMessageRegister = By.xpath("//*[@id=\"content\"]/p[1]");

    // Login page objects
    By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
    By myAccountHeaderText = By.xpath("//*[@id=\"content\"]/h2[1]");
    By warningLoginAlert = By.xpath("//*[@id=\"content\"]/div[1]");

    // Edit account objects
    By editAccountButton = By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a");
    By continueButtonOnEdit = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
    By confirmationMessageEditAccount = By.xpath("//*[@id=\"content\"]/div");


    // Here start methods doing actions on Homepage
    public void clickOnMyProfileBtn() {
        driver.findElement(myProfileButton).click();
    }

    // Here start methods doing actions on Register page
    public void clickOnRegisterButton() {
        driver.findElement(registerButton).click();
    }

    // setFirstName method can be used in both Register and Edit account tests ***
    public void setFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    // setLastName method can be used in both Register and Edit account tests ***
    public void setLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    // setEmail method can be used in both Register, Login and Edit account tests ***
    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    // setTelephone method can be used in both Register and Edit account tests ***
    public void setTelephone(String telephone) {
        driver.findElement(telephoneInput).sendKeys(telephone);
    }

    // setPassword method can be used in both Register, Login and Edit account tests ***
    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setConfirmPassword(String password) {
        driver.findElement(confirmPasswordInput).sendKeys(password);
    }

    public void clickOnSubscribeYesRadioButton() {
        driver.findElement(subscribeYesRadioButton).click();
    }

    public void clickOnGeneralConditionsCheckBox() {
        driver.findElement(generalConditionsCheckBox).click();
    }

    // clickOnContinueButton method can be used in both Register and Edit account tests ***
    public void clickOnContinueButton() {
        driver.findElement(continueButton).click();
    }

    public String getConfirmationMessageText() {
        return driver.findElement(confirmationMessageRegister).getText();
    }

    // Here start methods doing actions on Login page
    
    // clickOnLoginButton method can be used in both Register, Login and Edit account tests ***
    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getMyAccountHeaderText() {
        return driver.findElement(myAccountHeaderText).getText();
    }

    public String getWarningLoginAlertText() {
        return driver.findElement(warningLoginAlert).getText();
    }

    // Here start methods doing actions on Edit account page
    public void clickOnEditAccountButton() {
        driver.findElement(editAccountButton).click();
    }

    public void editFirstNameInput(String newFirstName) {
        driver.findElement(firstNameInput).clear();
        driver.findElement(firstNameInput).sendKeys(newFirstName);
    }

    public void editLastNameInput(String newLastName) {
        driver.findElement(lastNameInput).clear();
        driver.findElement(lastNameInput).sendKeys(newLastName);
    }

    public void editEmailInput(String newEmail) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(newEmail);
    }

    public void editTelephoneInput(String newTelephone) {
        driver.findElement(telephoneInput).clear();
        driver.findElement(telephoneInput).sendKeys(newTelephone);
    }

    public void clickOnContinueEditingButton() {
        driver.findElement(continueButtonOnEdit).click();
    }

    public String getConfirmationMessageOnEditingText() {
        return driver.findElement(confirmationMessageEditAccount).getText();
    }

}
