package tests.Day17_Reports_ParalelTesting_DataProvider;

import com.github.dockerjava.core.command.DisconnectFromNetworkCmdImpl;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_HtmlReports extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("nutella testi","kullanıcının amazonda nutella arama testi ");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazona anasayfaya girildi");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        extentTest.info("arama kutusuna nutella yazıldı");
        ReusableMethods.waitForVisibility(amazonPage.amazonResultElement,5);
        String actularesult=amazonPage.amazonResultElement.getText();
        String expectedresult="Nutella";
        extentTest.info("arama sonuçları kaydedildi");
        Assert.assertTrue(actularesult.contains(expectedresult));
        extentTest.pass("arama sonucunun nutella içerdiği test edildi");
        Driver.closeDriver();
    }
}
