package tests.Day14_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {
    @Test
    public void firstTest(){
        System.out.println("first test running");
        Assert.assertTrue(5>9);
    }
    @Test (dependsOnMethods = "firstTest")
    public void secondTest(){
        System.out.println("second test running");
    }
    @Test
    public void thirdTest(){
        System.out.println("third test running");
    }
}
