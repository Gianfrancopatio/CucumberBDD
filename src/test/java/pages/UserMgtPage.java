package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class UserMgtPage {

    public WebElement submitBtn;
    public WebElement logInBtn;
    public WebElement accessDbBtn;

    public UserMgtPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( id = "Firstname")
    public WebElement firstnamefield;

    @FindBy ( id = "Lastname")
    public WebElement lastnamefield;

    @FindBy(id = "Email")
    public WebElement emailfield;

    @FindBy ( id = "Phonenumber")
    public WebElement phonefield;

    @FindBy ( id = "Select-role")
    public WebElement selectRole;

    public void selectRole (String roleType){
        Select select = new Select (selectRole);
        select.selectByVisibleText(roleType);
    }




}
