package team06.tests.US_02;

import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.pages.RegistrationPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.ReusableMethods;

public class US_02_TC02 {
    @Test
    public void us_02_TC02Test(){
        HomePage homePage=new HomePage();
        RegistrationPage registrationPage=new RegistrationPage();

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
        homePage.registerButton.click();
        ReusableMethods.waitFor(1);
        registrationPage.regUsername.sendKeys(ConfigReader.getProperty("new_username"));
        ReusableMethods.waitFor(1);
        registrationPage.regEmail.sendKeys(ConfigReader.getProperty("registered_email"));
        ReusableMethods.waitFor(1);
        registrationPage.regPassword.sendKeys(ConfigReader.getProperty("new_password"));
        ReusableMethods.waitFor(1);
        registrationPage.checkbox.click();
        ReusableMethods.waitFor(1);
        registrationPage.signUpButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(registrationPage.submitStatus.getText().
                contains("An account is already registered with your email address."));
        ReusableMethods.waitFor(1);
        Driver.closeDriver();



    }

}
