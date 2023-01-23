package tests.Day17_Reports_ParalelTesting_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] AmazonSearchingBox() {
        //dataprovider istediğimiz test metoduna test datası sağlar. tek şartı iki katlı object arrayi döndürmelidir.
        Object [][] amazonSearchingWordArray={{"Nutella"},{"java"},{"apple"},{"samsung"},{"armut"}};
        return  amazonSearchingWordArray;
    }

    @Test(dataProvider = "AmazonSearchingBox")
    public void searchTest(String searchingWord){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(searchingWord+ Keys.ENTER);
        String actualResult=amazonPage.amazonResultElement.getText();
        Assert.assertTrue(actualResult.contains(searchingWord));
        Driver.closeDriver();
    }
}
