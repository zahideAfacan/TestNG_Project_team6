package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class OrderCompletePage_KU {
    public OrderCompletePage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']")
    public WebElement orderReceivedText;

    @FindBy(id= "menu-item-1066")
    public WebElement myOrders;


}
