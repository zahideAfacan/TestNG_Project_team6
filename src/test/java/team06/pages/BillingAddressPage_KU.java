package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class BillingAddressPage_KU {

    public BillingAddressPage_KU(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Add'])[1]")
    public WebElement billingAddress;



    @FindBy(id = "billing_first_name")
    public WebElement billingAddressFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingAddressLastName;

    @FindBy(id = "billing_address_1")
    public WebElement billingAddressStreetAddress;


    @FindBy(id = "billing_city")
    public WebElement billingAddressCity;

    @FindBy(id = "billing_postcode")
    public WebElement billingAddressZipCode;

    @FindBy(id = "billing_phone")
    public WebElement billingAddressPhone;

    @FindBy(id = "billing_email")
    public WebElement billingAddressEmail;


    @FindBy(id = "billing_country")
    public WebElement billingAddresscountryDropDown;



    @FindBy(id = "billing_state")
    public WebElement billingAddressstateDropDown;

    @FindBy(name = "save_address")
    public WebElement getBillingAddressSaveAdressButton;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement saveSuccessfull;





}
