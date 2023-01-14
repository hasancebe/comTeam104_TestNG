package tests.Day13_softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercise;
import utilities.Driver;

public class C02_SoftAssert {
    @Test
    public void test01(){
        Driver.getDriver().get("https://automationexercise.com");

        SoftAssert softAssert=new SoftAssert();
        AutomationExercise automationExercise=new AutomationExercise();
        //Test Case 1: Register User
        automationExercise.loginButton.click();

        //Test Case 2: Login User with correct email and password
        //Test Case 3: Login User with incorrect email and password
        //Test Case 4: Logout User
        //Test Case 5: Register User with existing email
        //Test Case 6: Contact Us Form
        //Test Case 7: Verify Test Cases Page
        //Test Case 8: Verify All Products and product detail page
        //Test Case 9: Search Product
        //Test Case 10: Verify Subscription in home page
        //Test Case 11: Verify Subscription in Cart page
        //Test Case 12: Add Products in Cart
        //Test Case 13: Verify Product quantity in Cart
        //Test Case 14: Place Order: Register while Checkout
        //Test Case 15: Place Order: Register before Checkout
        //Test Case 16: Place Order: Login before Checkout
        //Test Case 17: Remove Products From Cart
        //Test Case 18: View Category Products
        //Test Case 19: View & Cart Brand Products
        //Test Case 20: Search Products and Verify Cart After Login
        //Test Case 21: Add review on product
        //Test Case 22: Add to cart from Recommended items
        //Test Case 23: Verify address details in checkout page
        //Test Case 24: Download Invoice after purchase order
        //Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
        //Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    }
}
