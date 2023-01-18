package tests.Day14_POM;

import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PositiveLoginTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));
        QdPage qdPage=new QdPage();
        qdPage.logInButton.click();
        qdPage.email.sendKeys(ConfigReader.getProperty("qdUserValidEmail"));
        qdPage.password.sendKeys(ConfigReader.getProperty("qdValidUserPassword"));
        qdPage.cookies.click();
        System.out.println(qdPage.login2.getText());
        ReusableMethods.wait(5);
        qdPage.login2.click();
        Driver.closeDriver();


    }

}
