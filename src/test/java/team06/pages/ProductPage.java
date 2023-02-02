package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css= "div[class='yith-wcwl-add-button']")
    public WebElement favoriteItemHeart;
}
