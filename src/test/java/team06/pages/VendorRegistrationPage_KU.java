package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class VendorRegistrationPage_KU {

    public VendorRegistrationPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "passoword")
    public WebElement vendorPassword;


}



