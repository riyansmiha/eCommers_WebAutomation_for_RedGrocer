package TestRunner;

import Pages.RegisterPage;
import Utils.Utils;
import BaseURL.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class RegisterRunner extends Setup {

    RegisterPage obj_register;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void Registration () throws IOException, ParseException, InterruptedException, org.json.simple.parser.ParseException {
        driver.get("https://www.redgrocer.com/");
        obj_register = new RegisterPage(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String user1 = obj_register.Registration(utils.getName(), utils.getPhone(), utils.getPassword(),utils.getConfirm_password());
        Assert.assertEquals(user1, "Registration Successfully");
        System.out.println(user1);
    }
}
