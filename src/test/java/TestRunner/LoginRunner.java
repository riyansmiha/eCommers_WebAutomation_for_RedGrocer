package TestRunner;

import Pages.LoginPage;
import Utils.Utils;
import BaseURL.Setup;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.io.IOException;


public class LoginRunner extends Setup {
    LoginPage obj_login;
    Utils utils;
    @Test(enabled = true, priority = 0)
    public void doLogin() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.redgrocer.com/");
        obj_login = new LoginPage(driver);
       utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn=obj_login.doLogin(utils.getPhone(), utils.getPassword());
        Assert.assertEquals(nn, "Dashboard");
        System.out.println(nn);
    }

    @Test(enabled = true ,priority = 1)
    public void doLoginWithWrongPassword() throws IOException, InterruptedException, ParseException {
        driver.get("https://www.redgrocer.com/");
        obj_login = new LoginPage(driver);
        utils=new Utils(driver);
        utils.readJSONArray(1);
       String txt = obj_login.doLoginWithWrongPassword(utils.getPhone(), utils.getPassword());
       Assert.assertEquals(txt, "Invalid email or password");
        System.out.println(txt);
    }

}
