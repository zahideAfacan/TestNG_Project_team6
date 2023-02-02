package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class WholesaleProductPage_m1 {

    public WholesaleProductPage_m1(){

        PageFactory.initElements(Driver.getDriver(),this); }

    //WholesaleProduct

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[9]")
    public WebElement wholesaleProduct;

    @FindBy(id="piecetype")
    public WebElement priceType;

    @FindBy(id="unitpercart")
    public WebElement unitsPerPiece;

    @FindBy(id="minorderqtytr")
    public WebElement minOrderQuantity;

    }

