package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class loginPage {
    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( id = "practice-form")
    public WebElement Login;
}
