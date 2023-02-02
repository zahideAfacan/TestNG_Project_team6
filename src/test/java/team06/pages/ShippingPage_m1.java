package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class ShippingPage_m1 {

    public ShippingPage_m1(){

        PageFactory.initElements(Driver.getDriver(),this); }

        //Shipping

        @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[4]")
         public WebElement shipping;

        @FindBy(id="weight")
        public WebElement shippingWeight;

        @FindBy(id="length")
        public WebElement shippingLength;

        @FindBy(id="width")
        public WebElement shippingWidth;

        @FindBy(id="height")
        public WebElement shippingHeight;

        @FindBy(id="shipping_class")
        public WebElement shippingClass;

        @FindBy(id="_wcfmmp_processing_time")
        public WebElement processingTime;
    }

