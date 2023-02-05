package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class RegistrationPage_KU {
    public RegistrationPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement register;

    @FindBy(id = "reg_username")
    public WebElement registerusername;

    @FindBy(id = "reg_email")
    public WebElement registeremail;

    @FindBy(id = "reg_password")
    public WebElement registerpassword;

    @FindBy(id = "register-policy")
    public WebElement registerpolicy;

    @FindBy(name = "register")
    public WebElement registerbutton;

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeVendor;


}


