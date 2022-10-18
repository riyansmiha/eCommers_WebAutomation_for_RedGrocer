package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    @FindBy(xpath = "//button[@class='btn btn-primary aiz-cookie-accept']")
    WebElement pop;

    @FindBy(xpath = "//a[contains(.,'Sign in')]")
            WebElement signin_btn;
    @FindBy(xpath = "//a[contains(.,'Register Now')]")
            WebElement register_btn;
    @FindBy(css = "#reg-form > div:nth-child(2) > input")
            WebElement fullname;
   @FindBy(xpath = "//input[@name='phone']")
            WebElement phn;
    @FindBy(xpath = "//input[@name='password']")
            WebElement pass;
    @FindBy(xpath = "//input[@name='password_confirmation']")
            WebElement confirm_pass;
    @FindBy(xpath = "//span[@class='aiz-square-check']")
            WebElement checkbox;
    @FindBy(xpath = "//button[contains(.,'Create Account')]")
            WebElement create_account;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Verify')]")
            WebElement verification_code;
    @FindBy(xpath = "//h1[@class='h4 fw-600'][contains(.,'Create an account.')]")
    WebElement Testassert;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Registration (String name, String phone, String password, String confirm_password) throws InterruptedException {

        pop.click();
        Thread.sleep(2000);
        signin_btn.click();
        Thread.sleep(2000);
        register_btn.click();
        Thread.sleep(5000);
        fullname.sendKeys(name);
        phn.sendKeys(phone);
        pass.sendKeys(password);
        confirm_pass.sendKeys(confirm_password);
        checkbox.click();
        Thread.sleep(2000);
        create_account.click();

        Thread.sleep(15000);
        verification_code.click();

        return Testassert.getText();
    }
}
