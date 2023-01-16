package tests.Day14_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_NegativeTest {
    QdPage qdPage=new QdPage();
    @Test
    public void wrongMailTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.logInButton.click();
        qdPage.email.sendKeys(ConfigReader.getProperty("qdInValidUserEmail"));
        qdPage.password.sendKeys(ConfigReader.getProperty("qdValidUserPassword"));
        qdPage.cookies.click();
        qdPage.Login2.click();
        Assert.assertTrue(qdPage.email.isDisplayed());
        Driver.closeDriver();

    }
    //qdURL=https://www.qualitydemy.com/
    //qdUserValidEmail=a@a.com
    //qdValidUserPassword=123Abc.
    //
    //qdInValidUserEmail=a@ddda.com
    //qdInvalidPassword=asdfghj


    @Test
    public void wrongPassword(){
        qdPage=new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.logInButton.click();
        qdPage.email.sendKeys(ConfigReader.getProperty("qdUserValidEmail"));
        qdPage.password.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        //qdPage.cookies.click();
        qdPage.Login2.click();
        Assert.assertTrue(qdPage.email.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void wrongPasswordAndEmail(){
        qdPage=new QdPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        qdPage.logInButton.click();
        qdPage.email.sendKeys(ConfigReader.getProperty("qdInValidUserEmail"));
        qdPage.password.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        qdPage.cookies.click();
        qdPage.Login2.click();
        Assert.assertTrue(qdPage.email.isDisplayed());
        Driver.closeDriver();

    }
}
