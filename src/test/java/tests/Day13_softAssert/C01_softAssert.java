package tests.Day13_softAssert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_softAssert {
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://amazon.com");

        SoftAssert softAssert=new SoftAssert();

        String expectedUrl="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains(expectedUrl));


        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        String actualResultText=amazonPage.amazonResultElement.getText();
        String expectedResultWord="Nutella";
        softAssert.assertTrue(actualResultText.contains(expectedResultWord));


        ReusableMethods.wait(5);
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
