package TestRunner;

import BaseURL.Setup;
import Pages.BrandPage;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrandRunner extends Setup {

    BrandPage obj_brand;
    Utils utils;

   @Test
    public void select_brand() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.redgrocer.com/");
        obj_brand = new BrandPage(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String bb=obj_brand.select_brand(utils.getPhone(), utils.getPassword());
        Assert.assertEquals(bb, "All Brands");
        System.out.println(bb);
    }

    @Test
    public void checkout() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.redgrocer.com/");
        obj_brand = new BrandPage(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String cc=obj_brand.checkout(utils.getPhone(), utils.getPassword());
        Assert.assertEquals(cc, "Complete Order");
        System.out.println(cc);
    }

}
