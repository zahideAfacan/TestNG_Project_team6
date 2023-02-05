package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

import java.util.List;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(linkText = "Addresses")
        public WebElement addresses;

    @FindBy(linkText = "Sign Out")
    public WebElement signOut;

    @FindBy(xpath = "//div[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4']")
    public List<WebElement> iconBoxes;

    @FindBy(linkText = "Orders")
    public WebElement Orders;

    @FindBy(linkText = "Store Manager")
    public WebElement storeManager;

    @FindBy(linkText = "Downloads")
    public WebElement Downloads;

    @FindBy(linkText = "Addresses")
    public WebElement Addresses;

    @FindBy(linkText = "Account details")
    public WebElement AccountDetails;

    @FindBy(linkText = "Wishlist")
    public WebElement Wishlist;

    @FindBy(linkText = "Support Tickets")
    public WebElement supportTickets;

    @FindBy(linkText = "Followings")
    public WebElement Followings;

    @FindBy(linkText = "Logout")
    public WebElement Logout;

    //store manager page "Coupons" button
    @FindBy(linkText = "Coupons")
    public WebElement Coupons;

    //store manager=>Coupons=>Add New
    @FindBy(linkText = "Add New")
    public WebElement AddNew;





    }

