package team06.tests.US_03;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team06.pages.*;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import static org.testng.AssertJUnit.assertEquals;
import static team06.utilities.ReusableMethods.waitFor;

public class US_03_TC01 {

    @Test
    public void US_03_TC01Test() {
        HomePage homePage=new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        EditShippingAddressPage editShippingAddressPage = new EditShippingAddressPage();
        AddressesPage addressesPage = new AddressesPage();
        BillingAddressPage_KU billingAddressPageKU =new BillingAddressPage_KU();
        Faker faker=new Faker();

        //Go to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

        //--Complete the registration process

        //Click on Register icon
        RegistrationPage_KU registrationPageKU =new RegistrationPage_KU();
        registrationPageKU.register.click();

        //Select the username text box and Enter the valid username

        registrationPageKU.registerusername.sendKeys(faker.name().username());
        waitFor(2);

        //Select the username email address box and Enter the valid email address
        registrationPageKU.registeremail.sendKeys(faker.internet().emailAddress());
        waitFor(2);
        String registerEmail= registrationPageKU.registeremail.getAttribute("value");

        //Select the password text box and Enter the valid password
        registrationPageKU.registerpassword.sendKeys("Abcdef");
        waitFor(2);

        //Click "I agree to the privacy policy" checkbox; with clicking "I agree to the privacy policy"
        registrationPageKU.registerpolicy.click();
        waitFor(2);

        //Click on SIGN UP button to register
        registrationPageKU.registerbutton.click();
        waitFor(5);


        Actions actions = new Actions(Driver.getDriver());
        //scroll the button of the homepage
        actions.sendKeys(Keys.END).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //locate my account and click
        homePage.myAccount.click();
        waitFor(2);


        //locate Addresses and click
        myAccountPage.addresses.click();
        waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(1);
        billingAddressPageKU.billingAddress.click();
        waitFor(2);



        //Fill BILLING ADDRESS DETAILS.
        billingAddressPageKU.billingAddressFirstName.clear();
        billingAddressPageKU.billingAddressFirstName.sendKeys(faker.name().firstName());
        waitFor(1);

        billingAddressPageKU.billingAddressLastName.clear();
        billingAddressPageKU.billingAddressLastName.sendKeys(faker.name().lastName());
        waitFor(1);

        new Select(billingAddressPageKU.billingAddresscountryDropDown).selectByVisibleText("Turkey");
        waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        billingAddressPageKU.billingAddressStreetAddress.clear();
        billingAddressPageKU.billingAddressStreetAddress.sendKeys(faker.address().streetAddress());
        waitFor(1);


        billingAddressPageKU.billingAddressZipCode.clear();
        billingAddressPageKU.billingAddressZipCode.sendKeys(faker.address().zipCode());
        waitFor(1);

        billingAddressPageKU.billingAddressCity.clear();
        billingAddressPageKU.billingAddressCity.sendKeys(faker.address().city());
        waitFor(1);


        new Select(billingAddressPageKU.billingAddressstateDropDown).selectByVisibleText("Van");
        waitFor(1);

        billingAddressPageKU.billingAddressPhone.clear();
        billingAddressPageKU.billingAddressPhone.sendKeys(faker.phoneNumber().cellPhone());
        waitFor(1);

        //Verify to email address that the registered email address should be filled in automatically

        String billingAddressEmail=billingAddressPageKU.billingAddressEmail.getAttribute("value");

        //System.out.println("registerEmail = " + registerEmail);
        //System.out.println("billingAddressEmail = " + billingAddressEmail);

        assertEquals(billingAddressEmail,registerEmail);

        //Click to Save Address button

        billingAddressPageKU.getBillingAddressSaveAdressButton.click();

        //Verify that should be added
        String addressSaveMessage=billingAddressPageKU.saveSuccessfull.getText();

        //System.out.println("addressSaveMessage = " + addressSaveMessage);
        assertEquals(addressSaveMessage,"Address changed successfully.");


        Driver.closeDriver();
    }
}
