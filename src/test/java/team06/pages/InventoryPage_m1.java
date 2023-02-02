package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

import java.util.List;

public class InventoryPage_m1 {

    public InventoryPage_m1(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    //Inventory
    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory;

    @FindBy(xpath="//div[@class='page_collapsible_content_holder']")
    public List<WebElement> menu;

    @FindBy(id="sku")
    public WebElement sku;

    @FindBy(id="manage_stock")
    public WebElement manageStock;

    @FindBy(id="stock_qty")
    public WebElement stockQty;

    @FindBy(id="backorders")
    public WebElement allowBackorders;

    @FindBy(id="sold_individually")
    public WebElement soldIndividually;
}
