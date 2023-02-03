package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

<<<<<<< Updated upstream
public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
=======

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;
>>>>>>> Stashed changes

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

<<<<<<< Updated upstream

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;


}

=======
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccount;











}
>>>>>>> Stashed changes
