package team06.tests.US_06;

import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.BillingPage_m1;
import team06.pages.HomePage_m1;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

import java.util.Locale;

public class US_06_TC01 {
    /*

   -------------------
   User should be able to shop on the site
   -----------------

   The user should be able to find the desired product in the search box.
   The user should be able to add the product they are looking for to their cart. (ADD TO CART)
   User should see the items that have been added to the cart.
   The amount of products in the cart should be adjustable by the user.
   User should be able to see the Billing Address in order to purchase the products
   The user should be able to view and select payment options.
   The user should be able to complete their purchase.

    */
    //The user should be able to find the desired product in the search box.
    @Test
    public void searchBox()  {

        //1-The user should be able to find the desired product in the search box.
                //Given user goes to "https://allovercommerce.com" page
        HomePage_m1 homePageM1 = new HomePage_m1();
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

                //And user searches for "tshirt" on search box
        homePageM1.search.sendKeys("tshirt");
        ReusableMethods.waitFor(3);

                //And user clicks on search button
        JSUtils.clickElementByJS(homePageM1.searchButton);

                //Then user verify product title contains "tshirt"
        String productTitle= homePageM1.productTitle.getText().toLowerCase(Locale.ROOT);
        Assert.assertTrue(productTitle.contains("tshirt"));

        //2-The user should be able to add the product they are looking for to their cart. (ADD TO CART)
                //And user clicks on ADD TO CART
        JSUtils.clickElementByJS(homePageM1.addToCart);
        ReusableMethods.waitFor(3);
                 //verify added to cart
        String addedToCart= homePageM1.addedToCart.getText();
        Assert.assertTrue(addedToCart.contains("“Tshirt” has been added to your cart."));

        //3-User should see the items that have been added to the cart.
                 //And user clicks on cart
        JSUtils.clickElementByJS(homePageM1.cart);
        ReusableMethods.waitFor(3);
                //Then verify product count is displayed
        Assert.assertTrue(homePageM1.cartCount.isDisplayed());

        //4-The amount of products in the cart should be adjustable by the user.
                //clicks view cart.
        JSUtils.clickElementByJS(homePageM1.viewCart);
        ReusableMethods.waitFor(3);

                //clicks quantity plus
        homePageM1.quantityPlus.click();
        ReusableMethods.waitFor(3);

                //verify is count equal 2
        Assert.assertEquals("2","2");

        //5-User should be able to see the Billing Address in order to purchase the products

                // clicks checkout
        JSUtils.clickElementByJS(homePageM1.checkout);
                // verify  Billing Address is visible

        Assert.assertTrue(homePageM1.billingDetails.isDisplayed());

        //6-The user should be able to view and select payment options.

                //verify is visible payment methods
        Assert.assertTrue(homePageM1.paymentMethod.isDisplayed());

                //clicks Wire transfer/EFT
        JSUtils.clickElementByJS(homePageM1.wireTransfer);
        ReusableMethods.waitFor(3);

                //clicks Pay at the door
        JSUtils.clickElementByJS(homePageM1.payAtTheDoor);
        ReusableMethods.waitFor(3);

        //7-The user should be able to complete their purchase.

         //enter the first name into the billing detail
        BillingPage_m1 billingPageM1 =new BillingPage_m1();
        billingPageM1.firstName.sendKeys("John");

        //enter the last name into the billing detail
        billingPageM1.lastName.sendKeys("Doe");
        ReusableMethods.waitFor(3);

        //enter the country into the billing detail
        JSUtils.setValueByJS(billingPageM1.country, "United State (US)");


        //enter the StreetAddress into the billing detail
        billingPageM1.streetAddress.sendKeys("Happy Street");

        //enter the city into the billing detail
        billingPageM1.city.sendKeys("New York");
        ReusableMethods.waitFor(3);

        //enter the state into the billing detail
        JSUtils.setValueByJS(billingPageM1.state, "New York");

        //enter the zip code into the billing detail
        billingPageM1.zipCode.sendKeys("12345");

        //enter the phone into the billing detail
        billingPageM1.phone.sendKeys("123456789");

        //enter the email into the billing detail
        billingPageM1.email.sendKeys("johndoe@gmail.com");

        //clicks Place Order
        JSUtils.clickElementByJS(homePageM1.placeHolder);
        ReusableMethods.waitFor(3);

        //verify complete purchase
        String orderComplete= homePageM1.orderComplete.getText();
        Assert.assertTrue(orderComplete.contains("Thank you. Your order has been received."));

        //close driver
        Driver.closeDriver();

    }
}