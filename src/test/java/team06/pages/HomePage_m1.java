package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;


public class HomePage_m1 {


    public HomePage_m1(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;
    @FindBy(xpath = "//i[@class='w-icon-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement productTitle;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addedToCart;

    @FindBy(xpath = "//i[@class='w-icon-cart']")
    public WebElement cart;

    @FindBy(xpath = "//span[@class='cart-count']")
    public WebElement cartCount;

    @FindBy(xpath = "//a[.='View cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement quantityPlus;

    @FindBy(id = "quantity_63d52e3926401")
    public WebElement quantityAmount;

    @FindBy(xpath = "//span[@class='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//a[.='Checkout']")
    public WebElement checkout;

    @FindBy(xpath = "//h3[.='Billing details']")
    public WebElement billingDetails;
    @FindBy(xpath = "//h4[.='Payment Methods']")
    public WebElement paymentMethod;

    @FindBy(id = "payment_method_bacs")
    public WebElement wireTransfer;

    @FindBy(id = "payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id = "place_order")
    public WebElement placeHolder;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderComplete;

    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement signInHome;

    @FindBy(xpath = "//button[@name='coupon_code']")
    public WebElement applyCode;

    @FindBy(xpath = "//button[@name='apply_coupon']")
    public WebElement applyCoupon;





}