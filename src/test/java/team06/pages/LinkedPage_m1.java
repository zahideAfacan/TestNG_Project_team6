package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class LinkedPage_m1 {
    public LinkedPage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //Linked
    @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;

    @FindBy(xpath="(//ul[@aria-live='polite'])[4]")
    public WebElement upSells;

    @FindBy(xpath="(//ul[@aria-live='polite'])[5]")
    public WebElement crossSells;



    }

