package tests;

import helpers.AccountHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends BaseTest {

    AccountPage accountPage = new AccountPage();
    String firstName = AccountHelper.getRandomFirstName();
    String lastName = AccountHelper.getRandomLastName();
    String email = AccountHelper.getRandomEmail();
    String password = "MyPassword!";

    @Test (priority = 1)
    public void testRegisterFunctionality() {
        accountPage.clickOnMyProfileBtn();
        accountPage.clickOnRegisterButton();
        accountPage.setFirstName(firstName);
        accountPage.setLastName(lastName);
        accountPage.setEmail(email);
        accountPage.setTelephone("+38970123456");
        accountPage.setPassword(password);
        accountPage.setConfirmPassword(password);
        accountPage.clickOnSubscribeYesRadioButton();
        accountPage.clickOnGeneralConditionsCheckBox();
        accountPage.clickOnContinueButton();

        Assert.assertTrue(accountPage
                .getConfirmationMessageText()
                .toLowerCase().contains("ви благодариме за вашата најава!"));
    }

    @Test (priority = 2)
    public void testLoginFunctionality() {
        // Go to account / login page
        accountPage.clickOnMyProfileBtn();

        // Validations
        accountPage.clickOnLoginButton();
        Assert.assertTrue(accountPage
                .getWarningLoginAlertText()
                .toLowerCase()
                .contains("предупредување: не се совпаѓаат адресата за е-пошта и / или лозинка."));

        // Valid login case
        accountPage.setEmail(email);
        accountPage.setPassword(password);
        accountPage.clickOnLoginButton();

        Assert.assertTrue(accountPage
                .getMyAccountHeaderText()
                .toLowerCase()
                .contains("моја сметка"));
    }

    @Test (priority = 3)
    public void testEditAccountFunctionality() {
        // Log in
        accountPage.clickOnMyProfileBtn();
        accountPage.setEmail(email);
        accountPage.setPassword(password);
        accountPage.clickOnLoginButton();

        // Edit account
        accountPage.clickOnEditAccountButton();
        accountPage.editFirstNameInput(AccountHelper.getRandomFirstName());
        accountPage.editLastNameInput(AccountHelper.getRandomLastName());
        accountPage.editEmailInput(AccountHelper.getRandomEmail());
        accountPage.editTelephoneInput("+389663885");
        accountPage.clickOnContinueEditingButton();

        Assert.assertTrue(accountPage
                .getConfirmationMessageOnEditingText()
                .toLowerCase()
                .contains("вашата сметка е успешно ажурирана."));
    }

}
