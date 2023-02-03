package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "reg_username")
    public WebElement regUsername;

    @FindBy(id = "reg_email")
    public WebElement regEmail;

    @FindBy(id = "reg_password")
    public WebElement regPassword;

    @FindBy(id = "register-policy")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUpButton;

    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement submitStatus;

}
