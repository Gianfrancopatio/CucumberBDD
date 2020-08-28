
package step_impl;

import pages.UserMgtPage;
import utils.CucumberUtils;
import utils.SeleniumUtils;

import java.util.Map;

public class UserMgtPageImpl {

    public void fillRegistrationForm(Map<String, String> map){
        UserMgtPage userMgtPage = new UserMgtPage();
        for(String key: map.keySet()) {
            switch (key.toLowerCase()) {
                case "firstname":
                    SeleniumUtils.sendKeys(userMgtPage.firstnamefield, map.get(key));
                    break;
                case "lastname":
                    SeleniumUtils.sendKeys(userMgtPage.lastnamefield, map.get(key));
                    break;
                case "phone number":
                    SeleniumUtils.sendKeys(userMgtPage.phonefield, map.get(key));
                    break;
                case "email":
                    SeleniumUtils.sendKeys(userMgtPage.emailfield, map.get(key));
                    break;
                case "role":
                    userMgtPage.selectRole(map.get(key));
                default:
                    System.out.println("Invalid field type");
            }
            CucumberUtils.logInfo("Entered data: " + map.get(key), false);
        }
        CucumberUtils.logInfo("", true);
    }
}