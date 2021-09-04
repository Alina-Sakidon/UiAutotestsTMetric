package Registration;

import PageObjects.ConfirmEmailAddressPage;
import org.testng.annotations.Test;

public class ValidRegistrationTests extends BaseTest{
    @Test
    public void registrationWithoutNotifications () throws InterruptedException {
        ConfirmEmailAddressPage confirmEmailAddressPage = openSite()
                .goToSignUpPage()
                .setUserName("Qqq")
                .setUserEmail("qqq@mail.com")
                .setUserPassword("Qwerty123!")
                .unableAgreeToTerms()
                .clickSignUpButton();

    }

}
