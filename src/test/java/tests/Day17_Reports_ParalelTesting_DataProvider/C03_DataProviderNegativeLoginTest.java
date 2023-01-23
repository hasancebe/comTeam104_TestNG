package tests.Day17_Reports_ParalelTesting_DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderNegativeLoginTest {
    @DataProvider
    public static Object[][] negativeLoginTestDatas() {

        /*
        DDT : TestNG by using dataProvider
         */

        Object [][] arr ={{"A11","A12345"},{"B12","B12345"},{"C13","C12345"},{"D14","D12345"},{"E15","E12345"}};


        return arr;
    }

    // go to the Qualitydemy
    // Use given userNanems and passwords
    // test that if you can login

    // username    Password
    // A11          A12345
    // B12          B12345
    // C13          C12345
    // D14          D12345
    // E15          E12345


    @Test (dataProvider = "negativeLoginTestDatas")
    public void negativeLoginTest(String userEmail,String userPassword){

        Driver.getDriver().get(ConfigReader.getProperty("qdURL"));

        QdPage qdPage = new QdPage();

        qdPage.logInButton.click();
        qdPage.email.sendKeys(userEmail);
        qdPage.password.sendKeys(userPassword);
        qdPage.login2.click();

        Assert.assertTrue(qdPage.email.isDisplayed());

    }


}
