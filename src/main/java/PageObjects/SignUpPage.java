package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

    @FindBy(id = "FullName")
    private WebElement inputUserName;

    @FindBy(id = "Email")
    private WebElement inputUserEmail;

    @FindBy (id ="Password")
    private WebElement inputUserPassword;
    @FindBy(id = "AgreeToTerms")
    private WebElement agreeToTermsCheckbox;
    @FindBy(xpath = "//label[text()=\"I accept \"]")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public SignUpPage setUserName(String userName){
        setValue(inputUserName, userName);
        return this;
    }
    public SignUpPage setUserEmail(String userEmail) throws InterruptedException {
        setValue(inputUserEmail,userEmail);
        Thread.sleep(1000);
        return this;
    }
    public SignUpPage setUserPassword(String userPassword){
        setValue(inputUserPassword,userPassword);
        return this;
    }
    public SignUpPage unableAgreeToTerms(){
        agreeToTermsCheckbox.click();
        return this;
    }
    public ConfirmEmailAddressPage clickSignUpButton(){
        signUpButton.click();
        return new ConfirmEmailAddressPage(driver);
    }

}
