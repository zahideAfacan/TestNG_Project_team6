package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class VendorLoginPage_KU {
    public VendorLoginPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="(//a[@href='?add-to-cart=15766'])[2]" )
    public WebElement addToChart1;

    @FindBy(xpath ="(//a[@href='?add-to-cart=13216'])[2]" )
    public WebElement addToChart2;

    @FindBy(id = "menu-item-1078")
    public WebElement cart;

    // farkli sayfa yapalim
    @FindBy(xpath ="//*[text()='Product']" )
    public WebElement product;

    @FindBy(xpath ="//*[text()='Price']" )
    public WebElement price;

    @FindBy(linkText ="PROCEED TO CHECKOUT" )
    public WebElement proceedToCheckout;


}
