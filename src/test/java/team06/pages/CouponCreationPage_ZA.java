package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class CouponCreationPage_ZA {
    public CouponCreationPage_ZA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement codeInput;

    @FindBy(id = "description")
    public WebElement descriptionInput;

    @FindBy(id = "discount_type")
    public WebElement discountTypeDropdown;

    @FindBy(id = "coupon_amount")
    public WebElement couponAmountInput;

    @FindBy(id = "expiry_date")
    public WebElement expiryDate;

    @FindBy(id = "free_shipping")
    public WebElement AllowFreeShipping;

    @FindBy(id = "show_on_store")
    public WebElement showOnStore;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement submitButton;

}
