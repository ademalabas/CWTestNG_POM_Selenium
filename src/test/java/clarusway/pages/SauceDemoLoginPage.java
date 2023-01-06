package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {


    // initElements methodu Page class i initialize etmek adina kullanilir
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // @FindBy annotasyonu elementleri locate ederken kullandigimiz ve initElements methodu ile elementlerin bulunmasini saglayan bir anotasyondur


    @FindBy(id = "user-name")
    public WebElement txtUsername;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;



}
