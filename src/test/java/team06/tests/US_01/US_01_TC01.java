package team06.tests.US_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import team06.pages.RegistrationPage_KU;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import static org.testng.AssertJUnit.*;
import static team06.utilities.ReusableMethods.waitFor;

public class US_01_TC01 {

    @Test
    public void US_01_TC01Test() {


       //Go to https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

        //Click on Register icon
        RegistrationPage_KU registrationPageKU =new RegistrationPage_KU();
        registrationPageKU.register.click();

        //Select the username text box and Enter the valid username
        Faker faker=new Faker();
        registrationPageKU.registerusername.sendKeys(faker.name().username());
        waitFor(2);

        //Select the username email address box and  Enter the valid email address
        registrationPageKU.registeremail.sendKeys(faker.internet().emailAddress());
        waitFor(2);

        //Select the password text box and Enter the valid password
        registrationPageKU.registerpassword.sendKeys("Abcdef");
        waitFor(2);


        // Don’t click "I agree to the privacy policy" checkbox; without clicking "I agree to the privacy policy"

        // registerPage.registerpolicy.click();

        waitFor(2);

        //Click on SIGN UP button to register

        registrationPageKU.registerbutton.click();

        //Verify Sign-up shouldn't be completed

        String validationMessage= registrationPageKU.registerpolicy.getAttribute("validationMessage");
        assertEquals(validationMessage,"Please check this box if you want to proceed.");
        assertTrue(Driver.getDriver().findElement(By.linkText("Register")).isDisplayed());

        Driver.closeDriver();

    }
}

