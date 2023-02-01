package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class AttributesPage_m1 {

    public AttributesPage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Attributes

    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributes;

    @FindBy(id="attributes_is_active_1")
    public WebElement active;

    @FindBy(xpath="(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement color;

    @FindBy(xpath="(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[1]")
    public WebElement selectAllColor;

    @FindBy(xpath="(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[2]")
    public WebElement selectAllSize;

    @FindBy(id="attributes_is_visible_1")
    public WebElement visibleOnProduct;

    @FindBy(id="attributes_is_active_2")
    public WebElement size;

    @FindBy(xpath="//select[@name='wcfm_attribute_taxonomy']")
    public WebElement addAttribute;

    @FindBy(xpath="//button[@class='button wcfm_add_attribute']")
    public WebElement addAttributeButton;

    @FindBy(xpath="(//span[@title='Toggle Block'])[2]")
    public WebElement colorDown;

    @FindBy(id="attributes_is_active_1")
    public WebElement colorActive;

    @FindBy(id="attributes_is_active_2")
    public WebElement sizeActive;

    @FindBy(xpath="(//span[@title='Toggle Block'])[3]")
    public WebElement sizeDown;


}
