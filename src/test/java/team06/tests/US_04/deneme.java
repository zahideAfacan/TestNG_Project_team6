package team06.tests.US_04;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.pages.ProductPage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;
import team06.utilities.JSUtils;

public class deneme {
    WebDriver driver;
    @Test
    public void US_08_TC01_Test() {
        HomePage homePage=new HomePage();
        ProductPage productPage = new ProductPage();

//        Go to https: //allovercommerce.com
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));

//        Select any favorite item
//        homePage.searchBox.sendKeys("Blue Ski Boots");
//        homePage.searchButton.click();

//        Find heart shape icon that belongs to selected item
//       productPage.favoriteItemHeart.click();

//        Actions actions = new Actions(driver);
//        actions.moveToElement(productPage.favoriteItemHeart).perform();
//        JSUtils.clickElementByJS(productPage.favoriteItemHeart);
//        actions.click(productPage.favoriteItemHeart).perform();
        JSUtils.clickElementByJS(productPage.favoriteItemHeart);

//        Click on selected icon to add the favorite item to Wishlist
    }


}
