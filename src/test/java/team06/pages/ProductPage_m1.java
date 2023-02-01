package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class ProductPage_m1 {
    public ProductPage_m1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "product_type")
    public WebElement simpleProduct;

    @FindBy(id = "is_virtual")
    public WebElement virtual;

    @FindBy(id = "pro_title")
    public WebElement productTitle;

    @FindBy(id = "insert-media-button")
    public WebElement addMedia;

    @FindBy(xpath = "(//button[@class='button insert-media add_media'])[2]")
    public WebElement addMedia2;

    }

