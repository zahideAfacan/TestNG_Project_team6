package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class ComparingPage {

    public ComparingPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

   @FindBy(xpath = "(//a[@title='Compare'])[1]")
   public WebElement compare1;


   @FindBy(xpath = "(//a[@title='Compare'])[2]")
   public WebElement compare2;



    @FindBy(xpath = "//div[@class='compare-heading']")
    public WebElement numberOfProducts;


    @FindBy(xpath = "//a[@class='compare-clean']")
    public WebElement cleanAll;

    @FindBy(xpath = "//a[.='Start Compare !']")
    public WebElement startCompare;


    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[1]")
    public WebElement closeIcon1;


    @FindBy(xpath = "//h2[.='No products added to the compare']")
    public WebElement noProducts;

    @FindBy(xpath = "(//div[@class='compare-col compare-field'])[2]")
    public WebElement priceText;

}
