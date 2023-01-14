package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercise {
    public AutomationExercise(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailbutton;
}
