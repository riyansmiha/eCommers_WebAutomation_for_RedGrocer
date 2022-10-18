package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BrandPage {

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

    @FindBy(xpath = "(//a[@class='opacity-60 fs-14 px-3 py-2 d-inline-block fw-600 hov-opacity-100 text-reset'])[2]")
    WebElement brands_btn;

    @FindBy(xpath = "//button[@class='btn btn-primary aiz-cookie-accept']")
    WebElement pop2;

    @FindBy(xpath = "//img[contains(@alt,'Bashundhara Group')]")
    WebElement select_boshundhora;

    @FindBy(xpath = "//img[@alt='Bashundhara Toilet Tissue Regular White 1 Roll']")
    WebElement select_tissue;

    @FindBy(xpath = "//i[contains(@class,'las la-plus')]")
    WebElement plus_icon;

    @FindBy(xpath = "//i[contains(@class,'las la-plus')]")
    WebElement plus_icon2;

    @FindBy(xpath = "//i[contains(@class,'las la-plus')]")
    WebElement plus_icon3;

    @FindBy(xpath = "//i[contains(@class,'las la-minus')]")
    WebElement minus_icon;
    @FindBy(xpath = "//i[contains(@class,'las la-minus')]")
    WebElement minus_icon2;

    @FindBy(xpath = "//span[@class='d-none d-md-inline-block'][contains(.,'Add to cart')]")
    WebElement addTo_cart;

    @FindBy(xpath = "(//img[contains(@height,'40px')])[1]")
    WebElement addTo_cart_icon;

    @FindBy(xpath = "//a[@href='https://redgrocer.com/checkout-cart'][contains(.,'Checkout')]")
    WebElement checkOut;
    @FindBy(xpath = "//span[@class='aiz-rounded-check flex-shrink-0 mt-1']")
    WebElement select_add;

    @FindBy(xpath = "(//span[contains(@class,'aiz-square-check')])[1]")
    WebElement aiz_square_check;

    @FindBy(xpath = "//button[contains(@onclick,'submitOrder(this)')]")
    WebElement submitOrder;

    public BrandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String select_brand(String phone, String password) throws InterruptedException {
        pop.click();
        signin_btn.click();
        phn.sendKeys(phone);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);
        brands_btn.click();
        Thread.sleep(2000);
        pop2.click();

        String branding = driver.findElement(By.xpath("//h1[@class='fw-600 h4'][contains(.,'All Brands')]")).getText();

        return branding;

    }
    public String checkout(String phone, String password) throws InterruptedException {
        pop.click();
        signin_btn.click();
        phn.sendKeys(phone);
        pass.sendKeys(password);
        login_btn.click();
        Thread.sleep(2000);
        brands_btn.click();
        Thread.sleep(2000);
        pop2.click();
        select_boshundhora.click();
        select_tissue.click();
        Thread.sleep(2000);
        plus_icon.click();
        Thread.sleep(2000);
        plus_icon2.click();
        Thread.sleep(2000);
        plus_icon3.click();
        Thread.sleep(2000);
        minus_icon.click();
        Thread.sleep(2000);
        minus_icon2.click();
        Thread.sleep(2000);

        addTo_cart.click();
        Thread.sleep(5000);

        addTo_cart_icon.click();
        checkOut.click();
        select_add.click();
        aiz_square_check.click();
        submitOrder.click();

        String shopping_info = driver.findElement(By.xpath("(//button[@type='button'][contains(.,'Complete Order')]")).getText();
        return shopping_info;
    }
}

