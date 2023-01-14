package tests.Day12_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_NutellaTestWithTestNG {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        WebElement searchBox=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella");

     Driver.closeDriver();
    }
}