package team06.tests.US_16;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.MyAccount_m1;
import team06.pages.ProductPage_m1;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

public class US_16_TC01 {

    // US_16: User should be able to add Simple Product as a Vendor


    // US_16_TC01
    //Simle Product should be default.
    @Test

    public void simpleProductAsAVendor(){

   // 1-User goes to https://allovercommerce.com/store-manager/products/
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));


        MyAccount_m1 myAccountM1 =new MyAccount_m1();
        ProductPage_m1 productPageM1 =new ProductPage_m1();
        MyAccount_m1 myAccount_m1 = new MyAccount_m1();


        // 2-  click on "my Account"
        JSUtils.clickElementByJS(myAccountM1.myAccountButton);
        ReusableMethods.waitFor(2);


        // 3- enter the "username"
        myAccountM1.username.sendKeys("gulcin");
        ReusableMethods.waitFor(2);


        // 4- enter the "password"
        myAccountM1.password.sendKeys("Goteam_06");
        ReusableMethods.waitFor(2);


        // 5- click on "sign in button"
        JSUtils.clickElementByJS(myAccountM1.signIn);
        ReusableMethods.waitFor(2);


        // 6- click on "Store Manager"
        JSUtils.clickElementByJS(myAccountM1.storeManager);
        ReusableMethods.waitFor(3);

        // 7- click on "Product"
        JSUtils.clickElementByJS(myAccountM1.product);
        ReusableMethods.waitFor(2);


        // 8- click on "Add New Product"
        JSUtils.clickElementByJS(myAccountM1.addNewProduct);
        ReusableMethods.waitFor(2);



        // 9- Verify "Simple Product" is selected?
        WebElement simplePro = productPageM1.simpleProduct;
        Assert.assertTrue(simplePro.isDisplayed());

        // 10- Verify tick button "Virtual" is displayed?

        WebElement virtualButton = productPageM1.virtual;
        Assert.assertTrue(virtualButton.isDisplayed());

        // 11- Verify tick button "Downloadable" is displayed?

        WebElement downloadableButton = productPageM1.downloadable;
        Assert.assertTrue(downloadableButton.isDisplayed());

        // 12- Click tick button"Virtual".
        JSUtils.clickElementByJS(productPageM1.virtual);
        ReusableMethods.waitFor(2);



        // 13-Click tick button"Downloadable".
        JSUtils.clickElementByJS(productPageM1.downloadable);
        ReusableMethods.waitFor(2);



        // 14-Write Price to price box

        productPageM1.priceBox.sendKeys("15");
        ReusableMethods.waitFor(2);


        // 15-Write Sale Price to price box

        productPageM1.salePriceBox.sendKeys("35");
        ReusableMethods.waitFor(2);



        // 16-The steps of US14 and US15 should be done succesfully.

// waiting for US 14 to adding.

        // 17-Click to submit button
        JSUtils.clickElementByJS(myAccountM1.submitButton);
        ReusableMethods.waitFor(2);




    }
}
