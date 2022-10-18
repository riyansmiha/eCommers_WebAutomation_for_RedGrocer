package Pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@class='btn btn-primary aiz-cookie-accept']")
    WebElement pop;

    @FindBy(xpath = "//a[contains(.,'Sign in')]")
    WebElement signin_btn;

    @FindBy(xpath = "//input[@id='phone-code']")
            WebElement phn;
    @FindBy(xpath = "//input[contains(@id,'password')]")
            WebElement pass;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
            WebElement login_btn;
    @FindBy(xpath = "(//a[contains(.,'Logout')])[1]")
    WebElement log_out;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

 /*   public String Login_With_Fst(String phone, String password) throws IOException, ParseException, InterruptedException {
        pop.click();
        signin_btn.click();
        phn.sendKeys(phone);
        pass.sendKeys(password);
        login_btn.click();

        return LogAssert.getText();
    }*/
     public String doLogin(String phone, String password) throws InterruptedException {
     pop.click();
     signin_btn.click();
     phn.sendKeys(phone);
     pass.sendKeys(password);
     login_btn.click();

     String heading = driver.findElement(By.className("h3")).getText();
     log_out.click();
     return heading;
 }
    public String doLoginWithWrongPassword(String phone, String password) throws InterruptedException {
        pop.click();
        signin_btn.click();
        phn.sendKeys(phone);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);

        String heading2 = driver.findElement(By.xpath("//span[@data-notify='message'][contains(.,'Invalid email or password')]")).getText();
        return heading2;

    }

}


