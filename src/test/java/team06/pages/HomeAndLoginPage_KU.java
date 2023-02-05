package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class HomeAndLoginPage_KU {
    public HomeAndLoginPage_KU(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement signInHomeKU;

    @FindBy(css = "input[id='username']")
    public WebElement usernameKU;

    @FindBy(css = "input[id='password']")
    public WebElement passwordKU;

    @FindBy(css = "button[name='login']")
    public WebElement signInButtonKU;


}
