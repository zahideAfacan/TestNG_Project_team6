package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class AddressesPage {

    public AddressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[href='https://allovercommerce.com/my-account-2/edit-address/shipping/']")
    public WebElement editShippingAddress;
}
