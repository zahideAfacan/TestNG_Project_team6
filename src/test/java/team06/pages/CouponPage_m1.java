package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class CouponPage_m1 {

    public CouponPage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath="//input[@name='coupon_code']")
    public WebElement couponCode;

    @FindBy(xpath="//button[@name='apply_coupon']")
    public WebElement applyCoupon;

    
}













