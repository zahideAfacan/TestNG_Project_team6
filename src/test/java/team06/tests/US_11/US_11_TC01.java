package team06.tests.US_11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.pages.LoginPage;
import team06.pages.MyAccountPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;
import team06.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US_11_TC01 {
    @Test
    public void us_11_TC01Test() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage=new MyAccountPage();
        Actions actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
//      clik on Sign In button
//        ReusableMethods.waitForClickablility(homePage.signIn);
        JSUtils.clickElementByJS(homePage.signIn);

        //user enter email adress in the email input
        loginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));

        //user enter Password
        loginPage.password.sendKeys(ConfigReader.getProperty("vendor_password"));

        //user click on Sign In button
        JSUtils.clickElementByJS(loginPage.signInButton);

        JSUtils.clickElementByJS(myAccountPage.signOut);

        //user should verfy My Accout should be visible
        ReusableMethods.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getTitle().toString().contains("My Account"));

        //user should verify "Orders,Downloads,Addresses,Account Details,Wishlist and Logout"
        // icons and buttons are clickable

        List<WebElement> iconBoxes=myAccountPage.iconBoxes;

        for (WebElement w:iconBoxes){
            System.out.println(w.getText());
            ReusableMethods.verifyElementDisplayed(w);
   //         actions.contextClick(w).build().perform();
        }

//   user should verify "Store manager, orders, downloads, addresses , account details, wishlist,
//   Support tickets, followings ve log out" in Dashboard.

        List<WebElement> dashboardList =new ArrayList<>();
        dashboardList.add(myAccountPage.Orders);
        dashboardList.add(myAccountPage.AccountDetails);
        dashboardList.add(myAccountPage.storeManager);
        dashboardList.add(myAccountPage.supportTickets);
        dashboardList.add(myAccountPage.Downloads);
        dashboardList.add(myAccountPage.Addresses);
        dashboardList.add(myAccountPage.Followings);
        dashboardList.add(myAccountPage.Logout);
        dashboardList.add(myAccountPage.Wishlist);


        for (WebElement w:dashboardList){
            ReusableMethods.verifyElementDisplayed(w);
            System.out.println(w.getText());
        }


        Driver.closeDriver();

    }
}
