package team06.tests.US_20;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team06.pages.CouponCreationPage_ZA;
import team06.pages.HomePage;
import team06.pages.LoginPage;
import team06.pages.MyAccountPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

public class US_20_TC01 {

    @Test
    public void us_20_TC01Test() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        CouponCreationPage_ZA couponCreationPage=new CouponCreationPage_ZA();
        Faker faker=new Faker();


        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
//      click on Sign In button
        JSUtils.clickElementByJS(homePage.signIn);

        //user enter email adress in the email input
        loginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));

        //user enter Password
        loginPage.password.sendKeys(ConfigReader.getProperty("vendor_password"));

        //user click on Sign In button
        JSUtils.clickElementByJS(loginPage.signInButton);
        JSUtils.clickElementByJS(myAccountPage.signOut);

        //user clicks store manager button in dashboard
       JSUtils.clickElementByJS( myAccountPage.storeManager);

       //user clicks Coupons button in dashboard
        JSUtils.clickElementByJS(myAccountPage.Coupons);

        //user clicks Add New button
        JSUtils.clickElementByJS(myAccountPage.AddNew);

        couponCreationPage.codeInput.sendKeys(faker.code().ean13());
        couponCreationPage.descriptionInput.sendKeys(ConfigReader.getProperty("Description"));
        ReusableMethods.waitFor(2);
        Select select=new Select(couponCreationPage.discountTypeDropdown);
        select.selectByIndex(1);
        couponCreationPage.couponAmountInput.sendKeys(faker.number().digits(1));
        ReusableMethods.waitFor(2);
        couponCreationPage.expiryDate.sendKeys();





    }
}
