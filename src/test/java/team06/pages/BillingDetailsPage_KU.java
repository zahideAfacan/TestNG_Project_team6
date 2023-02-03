package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class BillingDetailsPage_KU {

    public BillingDetailsPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(id = "billing_address_1")
    public WebElement billingStreetAddress;


    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "billing_postcode")
    public WebElement billingZipCode;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(id = "billing_email")
    public WebElement billingEmail;


    @FindBy(id = "billing_country")
    public WebElement countryDropDown;



    @FindBy(id = "billing_state")
    public WebElement stateDropDown;




    @FindBy(xpath = "//*[.='Total']")
    public WebElement totalAmount;


    @FindBy(id = "payment_method_bacs")
    public WebElement wireTransferRadioButton;

    @FindBy(id = "payment_method_cod")
    public WebElement payAtTheDoorRadioButton;

    @FindBy(id = "place_order")
    public WebElement placeOrderButton;

}
