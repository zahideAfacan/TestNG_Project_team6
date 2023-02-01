package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

import java.util.List;

public class MyAccount_m1 {

    public MyAccount_m1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement product;

    @FindBy(xpath = "(//span[@class='text'])[18]")
    public WebElement addNewProduct;

    @FindBy(xpath = "//div[@class='page_collapsible_content_holder']")
    public List<WebElement>inventoryList;

    @FindBy(xpath="//input[@name='submit-data']")
    public WebElement submitButton;

    @FindBy(xpath="(//input[@type='submit'])[2]")
    public WebElement draftButton;


    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath="//button[@name='login']")
    public WebElement signIn;



}
