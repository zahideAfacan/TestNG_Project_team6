package team06.tests.US_10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import team06.pages.RegistrationPage_KU;
import team06.pages.VendorRegistrationPage_KU;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import static org.testng.AssertJUnit.assertEquals;
import static team06.utilities.ReusableMethods.waitFor;

public class US_10_TC01 {

    @Test
    public void  US_10_TC01Test() {
        //Go to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
        //Click on Register icon
        RegistrationPage_KU registrationPageKU =new RegistrationPage_KU();
        registrationPageKU.register.click();
        waitFor(3);

        //Click on "Become a Vendor" text
        VendorRegistrationPage_KU vendorRegistrationPageKU =new VendorRegistrationPage_KU();
        // clickElementByJS(registrationPage.becomeVendor);
        registrationPageKU.becomeVendor.click();

        //Select the password text box and Enter a password for "too short"
        vendorRegistrationPageKU.vendorPassword.sendKeys("Abcde");
        waitFor(2);

        //Verify to password level chart should be visible
        String passwordStrength1= Driver.getDriver().findElement(By.id("password_strength")).getText();
        assertEquals(passwordStrength1,"Too short");
        waitFor(2);

        //Enter a password for "weak"
        vendorRegistrationPageKU.vendorPassword.clear();
        waitFor(2);
        vendorRegistrationPageKU.vendorPassword.sendKeys("Abcdefg");

        //Verify to password level chart should be visible
        String passwordStrength2= Driver.getDriver().findElement(By.id("password_strength")).getText();
        assertEquals(passwordStrength2,"Weak");
        waitFor(2);

        //Enter a password for "good"
        vendorRegistrationPageKU.vendorPassword.clear();
        waitFor(2);
        vendorRegistrationPageKU.vendorPassword.sendKeys("abcdefg9");

        //Verify to password level chart should be visible
        String passwordStrength3= Driver.getDriver().findElement(By.id("password_strength")).getText();
        assertEquals(passwordStrength3,"Good");
        waitFor(2);

        //Enter a password for "strong"
        vendorRegistrationPageKU.vendorPassword.clear();
        waitFor(2);
        vendorRegistrationPageKU.vendorPassword.sendKeys("abcdefg7A");

        //Verify to password level chart should be visible
        String passwordStrength4= Driver.getDriver().findElement(By.id("password_strength")).getText();
        assertEquals(passwordStrength4,"Strong");

        Driver.closeDriver();

    }
}

