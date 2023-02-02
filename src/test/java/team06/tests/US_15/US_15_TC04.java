package team06.tests.US_15;

import org.testng.annotations.Test;
import team06.pages.*;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

public class US_15_TC04 {


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

    public void Vendor2_4() {

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));


        MyAccount_m1 myAccountM1 = new MyAccount_m1();
        AttributesPage_m1 attributesPageM1 = new AttributesPage_m1();


        //  click on "my Account"
        JSUtils.clickElementByJS(myAccountM1.myAccountButton);

        //  enter the username
        myAccountM1.username.sendKeys("gulcin");

        //  enter the password
        myAccountM1.password.sendKeys("Goteam_06");

        //  click on "sign in button"
        JSUtils.clickElementByJS(myAccountM1.signIn);

        //  click on "Store Manager"
        JSUtils.clickElementByJS(myAccountM1.storeManager);
        ReusableMethods.waitFor(3);

        //  click on "Product"
        JSUtils.clickElementByJS(myAccountM1.product);

        //  click on "Add New"
        JSUtils.clickElementByJS(myAccountM1.addNewProduct);

        //4)Vendor should be able to do Attributes processes. (Color, Size)
        //  Click on "attributes"
        JSUtils.clickElementByJS(attributesPageM1.attributes);

        //	Vendor click "color" on attributes processes
        JSUtils.clickElementByJS(attributesPageM1.colorDown);

        //	Vendor selects color on Dropdown menu
        JSUtils.setValueByJS(attributesPageM1.color,"beige");

        //	Vendor click "select all color" attributes processes
        JSUtils.clickElementByJS(attributesPageM1.selectAllColor);

        //	Vendor click "color active" on attributes processes
        JSUtils.clickElementByJS(attributesPageM1.colorActive);

        //	Vendor click "size" on attributes processes
        JSUtils.clickElementByJS(attributesPageM1.sizeDown);

        //	Vendor selects size on Dropdown menu
        JSUtils.setValueByJS(attributesPageM1.size, "Extra Large");

        //	Vendor click "select all size" attributes processes
        JSUtils.clickElementByJS(attributesPageM1.selectAllSize);

        //	Vendor click "size active" on attributes processes
        JSUtils.clickElementByJS(attributesPageM1.sizeActive);

        //close driver
        Driver.closeDriver();

    }
}