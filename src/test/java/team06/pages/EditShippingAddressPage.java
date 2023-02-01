package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class EditShippingAddressPage {

    public EditShippingAddressPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(id = "shipping_first_name")
        public WebElement shippingfirstName;

        @FindBy(id = "shipping_last_name")
        public WebElement shippinglastName;

        @FindBy(css = "select[name='shipping_country']")
        public WebElement shippingCountryDropdown;

        @FindBy(id = "shipping_address_1")
        public WebElement shippingAddress;

        @FindBy(id = "shipping_postcode")
        public WebElement shippingPostcode;

        @FindBy(id = "shipping_city")
        public WebElement shippingCity;

        @FindBy(css = "select[id='shipping_state']")
        public WebElement shippingStateDropdown;

        @FindBy(css = "button[type='submit']")
        public WebElement saveAddressButton;



}
