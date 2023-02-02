package team06.tests.US_16;

import org.testng.annotations.Test;

public class US_16_TC01 {

    // US_16: User should be able to add Simple Product as a Vendor


    // US_16_TC01
    //Simle Product should be default.
    @Test

    public void simpleProductAsAVendor(){


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




    }
}
