package tests.Day12_TestNG;

import org.testng.annotations.Test;
//priority sayısı küçük olan önce çaılşır.
// eğer eşitse alfabatik olarak küçük  önce çalışır
// priority değeri yazılmazsa default olarak '0' kabul edilir.
public class C01_TestNG_FirstTest {
    @Test (priority = 7)
    public void firstTest(){
        System.out.println("first test running");
    }
    @Test (priority = 2)
    public void secondTest(){
        System.out.println("second test running");
    }
    @Test (priority = 44)
    public void thirdTest(){
        System.out.println("third test running");
    }
}
