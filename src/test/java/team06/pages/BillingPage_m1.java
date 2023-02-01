package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class BillingPage_m1 {

    public BillingPage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "billing_first_name")
    public WebElement firstName;

    @FindBy(id = "billing_last_name")
    public WebElement lastName;

    @FindBy(id = "select2-billing_country-container")
    public WebElement country;

    @FindBy(id = "billing_address_1")
    public WebElement streetAddress;

    @FindBy(id = "//span[@class='select2-selection__arrow']")
    public WebElement stateDown;

    @FindBy(id = "billing_city")
    public WebElement city;

    @FindBy(id = "select2-billing_state-container")
    public WebElement state;

    @FindBy(id = "billing_postcode")
    public WebElement zipCode;

    @FindBy(id = "billing_phone")
    public WebElement phone;

    @FindBy(id = "billing_email")
    public WebElement email;
}
