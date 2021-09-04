package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//a[text()='Sign Up']")
    private WebElement signUpButton;

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public SignUpPage goToSignUpPage(){
        signUpButton.click();
        return new SignUpPage(driver);
    }

}
