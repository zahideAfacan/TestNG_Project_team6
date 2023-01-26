package team06.tests;

import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

public class US_06 {

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
    public void searchBox() {
        HomePage homePage=new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

        homePage.search.sendKeys("clothes");


           /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  Then
    Assert that total price of all products is 129.94 dollars
  And
    Flash each web element you used
   */

    }
}