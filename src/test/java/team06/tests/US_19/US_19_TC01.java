package team06.tests.US_19;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team06.pages.*;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static team06.utilities.ReusableMethods.waitFor;

public class US_19_TC01 {

    @Test
    public void US_19_TC01Test(){
        //Go to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

        //Click on Sign in icon
        HomeAndLoginPage_KU homeAndLoginPage_ku=new HomeAndLoginPage_KU();
        VendorLoginPage_KU vendorLoginPageKU =new VendorLoginPage_KU();

        homeAndLoginPage_ku.signInHomeKU.click();

        //Select the username text box and enter the valid username,
        // select the password text box and enter the valid password,
        // click on SIGN IN button
        homeAndLoginPage_ku.usernameKU.sendKeys("vendor.allover@gmail.com");
        homeAndLoginPage_ku.passwordKU.sendKeys("Goteam_06");
        homeAndLoginPage_ku.signInButtonKU.click();
        waitFor(7);

        //Click on ADD TO CART button ( for 2 products)
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.END).perform();
        waitFor(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        waitFor(1);

        vendorLoginPageKU.addToChart1.click();
        waitFor(1);
        vendorLoginPageKU.addToChart2.click();
        waitFor(1);
        actions.sendKeys(Keys.END).perform();
        waitFor(1);

        //Click on CART and verify to be visible during the Chart-Checkout process.
        vendorLoginPageKU.cart.click();
        waitFor(5);
        String product= vendorLoginPageKU.product.getText();
        String price= vendorLoginPageKU.price.getText();
        assertEquals(product, "Product");
        assertEquals(price, "Price");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //Click on CHECKOUT button
        waitFor(1);
        vendorLoginPageKU.proceedToCheckout.click();
        waitFor(1);

        BillingDetailsPage_KU billingDetailsPageKU =new BillingDetailsPage_KU();
        Faker faker=new Faker();
        //Fill BILLING DETAILS.
        billingDetailsPageKU.billingFirstName.clear();
        billingDetailsPageKU.billingFirstName.sendKeys(faker.name().firstName());
        waitFor(1);

        billingDetailsPageKU.billingLastName.clear();
        billingDetailsPageKU.billingLastName.sendKeys(faker.name().lastName());
        waitFor(1);

        new Select(billingDetailsPageKU.countryDropDown).selectByVisibleText("Turkey");
        waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        billingDetailsPageKU.billingStreetAddress.clear();
        billingDetailsPageKU.billingStreetAddress.sendKeys(faker.address().streetAddress());
        waitFor(1);

        billingDetailsPageKU.billingCity.clear();
        billingDetailsPageKU.billingCity.sendKeys(faker.address().city());
        waitFor(1);

        billingDetailsPageKU.billingZipCode.clear();
        billingDetailsPageKU.billingZipCode.sendKeys(faker.address().zipCode());
        waitFor(1);

        new Select(billingDetailsPageKU.stateDropDown).selectByVisibleText("Kocaeli");
        waitFor(1);

        billingDetailsPageKU.billingPhone.clear();
        billingDetailsPageKU.billingPhone.sendKeys(faker.phoneNumber().cellPhone());
        waitFor(1);

        billingDetailsPageKU.billingEmail.clear();
        billingDetailsPageKU.billingEmail.sendKeys(faker.internet().emailAddress());
        waitFor(1);

        //Verify that total amount is visible
        assertTrue(billingDetailsPageKU.totalAmount.isDisplayed());

        //Verify that wire transfer/EFT or pay at the door options should be selectable.
        if(billingDetailsPageKU.wireTransferRadioButton.isSelected()){
            billingDetailsPageKU.payAtTheDoorRadioButton.click();}
        waitFor(1);
        if(billingDetailsPageKU.payAtTheDoorRadioButton.isSelected()){
            billingDetailsPageKU.wireTransferRadioButton.click();}

        //Click on PLACE ORDER button and verify that be able to see that the shopping has been completed.
        waitFor(3);
        billingDetailsPageKU.placeOrderButton.click();

        waitFor(5);

        OrderCompletePage_KU orderCompletePageKU =new OrderCompletePage_KU();

        assertTrue(orderCompletePageKU.orderReceivedText.isDisplayed());

        //Locate My Orders and click
        actions.sendKeys(Keys.END).perform();
        waitFor(1);
        orderCompletePageKU.myOrders.click();

        //Verify that be able see the details of orders
        MyOrdersPage_KU myOrdersPageKU =new MyOrdersPage_KU();

        assertTrue(myOrdersPageKU.orderNumber.isDisplayed());
        assertTrue(myOrdersPageKU.orderDate.isDisplayed());
        assertTrue(myOrdersPageKU.orderStatus.isDisplayed());
        assertTrue(myOrdersPageKU.orderTotal.isDisplayed());

        Driver.closeDriver();
    }
}
