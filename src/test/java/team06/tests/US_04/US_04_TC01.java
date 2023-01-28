package team06.tests.US_04;


import org.testng.annotations.Test;
import team06.pages.HomePage;
import team06.utilities.ConfigReader;
import team06.utilities.Driver;

import static team06.utilities.JSUtils.clickElementByJS;

public class US_04_TC01 {
    @Test
    public void US04_TC01Test(){
        HomePage homePage=new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("url_allover_commerce"));
        clickElementByJS(homePage.myAccount);




    }

}
