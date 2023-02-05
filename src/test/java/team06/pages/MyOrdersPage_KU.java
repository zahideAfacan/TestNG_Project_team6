package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class MyOrdersPage_KU {

    public MyOrdersPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Order']")
    public WebElement orderNumber;

    @FindBy(xpath = "//*[.='Date']")
    public WebElement orderDate;

    @FindBy(xpath = "//*[.='Status']")
    public WebElement orderStatus;

    @FindBy(xpath = "//*[.='Total']")
    public WebElement orderTotal;




}
