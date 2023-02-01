package team06.tests.US_15;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.*;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

public class US_15_TC01 {


    /*
    1)Inventory, Shipping, Attributes, Linked, Seo, Wholesale product display settings, Advanced menus should be visible.
    2)Vendor should be able to do Inventory processes.  (SKU, Manage Stock, Stock status, Sold Individually)
    3)Vendor should be able to do Shipping processes (Weight, Dimensions, Shipping class, Processing Time)
    4)Vendor should be able to do Attributes processes. (Color, Size)
    5)Vendor should be able to do Linked processes. (Up-sells, Cross-sells)
    6)Vendor should be able to do Seo processes. (Enter a focus keyword, Meta description)
    7)Vendor should be able to do Wholesale Product display settings . (Piece Type, Units Per Piece, Min Order Quantity)
    8)Vendor should be able to do  Advanced processes. (Menu Order, Purchase Note)

     */

    @Test

    public void Vendor2_1(){

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));


        MyAccount_m1 myAccountM1 =new MyAccount_m1();
        InventoryPage_m1 inventoryPageM1 =new InventoryPage_m1();
        AttributesPage_m1 attributesPageM1 =new AttributesPage_m1();
        ShippingPage_m1 shippingPageM1 =new ShippingPage_m1();
        LinkedPage_m1 linkedPageM1 =new LinkedPage_m1();
        WholesaleProductPage_m1 wholesaleProductPageM1 =new WholesaleProductPage_m1();
        AdvancedPage_m1 advancedPageM1 =new AdvancedPage_m1();
        SeoPage_m1 seoPageM1 =new SeoPage_m1();
        ProductPage_m1 productPageM1 =new ProductPage_m1();



        //1)  Inventory, Shipping, Attributes, Linked, Seo, Wholesale product display settings, Advanced menus should be visible.
        //  click on "my Account"
        JSUtils.clickElementByJS(myAccountM1.myAccountButton);

        //  enter the "username"
         myAccountM1.username.sendKeys("gulcin");

        //  enter the "password"
         myAccountM1.password.sendKeys("Goteam_06");

        //  click on "sign in button"
        JSUtils.clickElementByJS(myAccountM1.signIn);

        //  click on "Store Manager"
        JSUtils.clickElementByJS(myAccountM1.storeManager);
        ReusableMethods.waitFor(3);

        //  click on "Product"
        JSUtils.clickElementByJS(myAccountM1.product);

        //  click on "Add New Product"
        JSUtils.clickElementByJS(myAccountM1.addNewProduct);

        //  select "Variable Product" on dropdown menu
        new Select(productPageM1.simpleProduct).selectByVisibleText("Variable Product");

        //  enter the product title
        productPageM1.productTitle.sendKeys("proNG");
        ReusableMethods.waitFor(5);
        JSUtils.scrollDownByJS();

        //  Verify that "Inventory" is available or not On menu
        Assert.assertTrue(inventoryPageM1.inventory.isDisplayed());

        //  Verify that "Shipping" is available On menu
        Assert.assertTrue(shippingPageM1.shipping.isDisplayed());

        //  Verify that "Attributes" is available On menu
        Assert.assertTrue(attributesPageM1.attributes.isDisplayed());

        //  Verify that "Linked" is available on menu
        Assert.assertTrue(linkedPageM1.linked.isDisplayed());

        //  Verify that"SEO" is available on menu
        Assert.assertTrue(seoPageM1.seo.isDisplayed());

        //  Verify that "Wholesale product display settings" is available on menu
        Assert.assertTrue(wholesaleProductPageM1.wholesaleProduct.isDisplayed());

        //  Verify that "Advanced" is available on menu
        JSUtils.clickElementByJS(advancedPageM1.advanced);

        //close driver
        Driver.closeDriver();
}
}