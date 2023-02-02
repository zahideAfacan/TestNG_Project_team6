package team06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team06.utilities.Driver;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(linkText = "Addresses")
        public WebElement addresses;




    }

