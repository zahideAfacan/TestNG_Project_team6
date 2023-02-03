package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
        public WebElement signIn;


    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;


}
