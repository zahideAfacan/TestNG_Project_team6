package team06.tests.US_02;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.pages.RegistrationPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.ReusableMethods;

public class US_02_TC03 {
    @Test
    public void us_02_TC03Test(){
        HomePage homePage=new HomePage();
        RegistrationPage registrationPage=new RegistrationPage();
        Faker faker = new Faker();

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
        homePage.registerButton.click();
        ReusableMethods.waitFor(1);
        registrationPage.regUsername.sendKeys(ConfigReader.getProperty("allover_commerce_username"));
        ReusableMethods.waitFor(1);
        registrationPage.regEmail.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);
        registrationPage.regPassword.sendKeys(ConfigReader.getProperty("allover_commerce_password"));
        ReusableMethods.waitFor(1);
        registrationPage.checkbox.click();
        ReusableMethods.waitFor(1);
        registrationPage.signUpButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(registrationPage.submitStatus.getText().
                contains("An account is already registered with that username. Please choose another."));
        ReusableMethods.waitFor(1);
        Driver.closeDriver();



    }


}
