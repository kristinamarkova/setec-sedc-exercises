package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends AccountPage {

    AccountPage accountPage = new AccountPage();

    @Test (priority = 1)
    public void testRegisterFunctionality() {
        accountPage.clickOnMyProfileBtn();
        accountPage.clickOnRegisterButton();
        accountPage.setFirstName("Kristina");
        accountPage.setLastName("Markova");
        accountPage.setEmail("moj6@gmail.com");
        accountPage.setTelephone("+38970123456");
        String myPassword = "MyPassword!";
        accountPage.setPassword(myPassword);
        accountPage.setConfirmPassword(myPassword);
        accountPage.clickOnSubscribeYesRadioButton();
        accountPage.clickOnGeneralConditionsCheckBox();
        accountPage.clickOnContinueButton();

        Assert.assertEquals(accountPage.getConfirmationMessageText(), "Ви благодариме за вашата најава!");
    }

    @Test (priority = 2)
    public void testLoginFunctionality() {
        accountPage.clickOnMyProfileBtn();
        accountPage.setEmail("moj6@gmail.com");
        accountPage.setPassword("MyPassword!");
        accountPage.clickOnLoginButton();

        Assert.assertEquals(accountPage.getMyAccountHeaderText(), "Моја сметка");
    }

    @Test (priority = 3)
    public void testEditAccountFunctionality() {
        accountPage.clickOnMyProfileBtn();
        accountPage.setEmail("moj6@gmail.com");
        accountPage.setPassword("MyPassword!");
        accountPage.clickOnLoginButton();

        accountPage.clickOnEditAccountButton();
        accountPage.editFirstNameInput("Kiki");
        accountPage.editLastNameInput("Markovaaa");
        accountPage.editEmailInput("nov6@gmail.com");
        accountPage.editTelephoneInput("+389663885");
        accountPage.clickOnContinueEditingButton();
        String successfulEditingText = "×\n"
                + "Вашата сметка е успешно ажурирана.";

        Assert.assertEquals(getConfirmationMessageOnEditingText(), successfulEditingText);
    }

}
