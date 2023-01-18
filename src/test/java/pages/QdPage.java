package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {
    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
   public WebElement logInButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign Up'])[3]")
    public WebElement signUpButton;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement login2;

    @FindBy(xpath = "//*[@onclick='cookieAccept();']")
    public  WebElement cookies;




}
