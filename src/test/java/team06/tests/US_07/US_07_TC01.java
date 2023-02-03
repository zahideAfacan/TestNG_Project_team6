package team06.tests.US_07;

import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.ComparingPage;

import team06.pages.HomePage_m1;

import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

public class US_07_TC01 {
    /*
US_07
User should be able to compare selected items. (Compare)

        User should be able to select up to 4 products to compare

 */

   // US_07_TC01


@Test

    public void comparing() {
    // User should be able to select up to 4 products to compare


    //1-	User goes to https://allovercommerce.com/
    HomePage_m1 homePageM1 = new HomePage_m1();
    Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));


    //2- And user searchs for "women" on search box
    homePageM1.search.sendKeys("women");
    ReusableMethods.waitFor(2);

    //3- And user clicks on search button
    JSUtils.clickElementByJS(homePageM1.searchButton);
    ReusableMethods.waitFor(2);

    // 4-	Click to the Compare button product-1
    ComparingPage comparingPage = new ComparingPage();

    JSUtils.clickElementByJS(comparingPage.compare1);
    ReusableMethods.waitFor(2);


    // 5-	Click to the Compare button product-2
    JSUtils.clickElementByJS(comparingPage.compare2);
    ReusableMethods.waitFor(2);

    // 6-  And user searchs for "man" on search box
    homePageM1.search.sendKeys("man");
    ReusableMethods.waitFor(2);

    // 7- And user clicks on search button
    JSUtils.clickElementByJS(homePageM1.searchButton);
    ReusableMethods.waitFor(2);

    // 8-	Click to the Compare button product-3
    JSUtils.clickElementByJS(comparingPage.compare1);
    ReusableMethods.waitFor(2);

    // 9-	Click to the Compare button product-4
    JSUtils.clickElementByJS(comparingPage.compare2);
    ReusableMethods.waitFor(2);

    // 10-	Verify the number of products is equal to 4 !
    String compProducts1 =comparingPage.numberOfProducts.getText();
    Assert.assertTrue(compProducts1.contains("4 Products"));


     //The user should be able to remove products from comparison and add new products.

   // 11-	Click to "Clean All" button.
    JSUtils.clickElementByJS(comparingPage.cleanAll);
    ReusableMethods.waitFor(2);

    // 12-Verify the number of product is equal to zero !
    String compProducts2 =comparingPage.numberOfProducts.getText();
    Assert.assertTrue(compProducts2.contains("0 Products"));


    // 13 - And user searchs for "women" on search box
    homePageM1.search.sendKeys("women");
    ReusableMethods.waitFor(2);

    // 14 - And user clicks on search button
    JSUtils.clickElementByJS(homePageM1.searchButton);
    ReusableMethods.waitFor(2);

    // 15-	Click to the Compare button product-1
    JSUtils.clickElementByJS(comparingPage.compare1);
    ReusableMethods.waitFor(3);

    // 16-	Click to the Compare button product-2
    JSUtils.clickElementByJS(comparingPage.compare2);
    ReusableMethods.waitFor(3);


    // The user should be able to compare selected products

    //  17- Click to start "Compare button" to compare.
    JSUtils.clickElementByJS(comparingPage.startCompare);
    ReusableMethods.waitFor(3);

    //  18- Verify "Compare" is written?
    String comparingTitlePrice =comparingPage.priceText.getText();
    Assert.assertTrue(comparingTitlePrice.contains("Price"));


    // The user should be able to remove items from the comparison screen.

    //  19- Click to close icon to remove product1
    JSUtils.clickElementByJS(comparingPage.closeIcon1);
    ReusableMethods.waitFor(3);

    //  20- Click to close icon to remove product2
    JSUtils.clickElementByJS(comparingPage.closeIcon1);
    ReusableMethods.waitFor(3);

    //  21- Verify there is no products added
    String noProductAdded =comparingPage.noProducts.getText();
    Assert.assertTrue(noProductAdded.contains("No products added to the compare"));

    // Close driver
    Driver.closeDriver();





}


}
