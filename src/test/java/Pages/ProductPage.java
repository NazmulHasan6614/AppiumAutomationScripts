package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import org.testng.asserts.SoftAssert;

import static PageObject.ProductPageObject.*;
import static org.testng.Assert.assertTrue;

public class ProductPage {
    SoftAssert softAssert=new SoftAssert();
    public void verifyProductButtonIsEnable(AppiumDriver driver)
    {
        ReusableMethods.waitForElementVisibility(productButton,driver);
        assertTrue(ReusableMethods.ButtonEnableOrNot(productButton,driver),"Button is not Enable");
    }
    public void verifyProductsDetails(AppiumDriver driver)
    {
        ReusableMethods.click(productButton,driver);
        ReusableMethods.waitForElementVisibility(productDetails,driver);
        ReusableMethods.click(productDetails,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(customersPrice,driver),"Customers price is unavailable");
        assertTrue(ReusableMethods.verifyElementsPresent(dealerPrice,driver),"Dealer price is unavailable");
        assertTrue(ReusableMethods.getTextFromMobileElements(productName,driver).contains("FastPower Easy Bike Battery - 12 V"),"No product name found");
        ReusableMethods.click(backButton,driver);
        softAssert.assertAll();
    }
    public void verifyAddToCartFunctionality(AppiumDriver driver)
    {
        ReusableMethods.waitForElementVisibility(plusIcon,driver);
        assertTrue(ReusableMethods.ButtonEnableOrNot(plusIcon,driver),"Plus icon is not Enable");
        ReusableMethods.click(plusIcon,driver);
        ReusableMethods.waitUntilPerformClickAction(product1,driver);
        ReusableMethods.waitUntilPerformClickAction(product2,driver);
        ReusableMethods.waitUntilPerformClickAction(frowardButton,driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(productName1,driver).contains("Fastpower genuine Li-ion UPS Battery"),"No product Found");
        assertTrue(ReusableMethods.getTextFromMobileElements(productName2,driver).contains("Fastpower genuine Li-ion UPS Battery"),"No product Found");
        ReusableMethods.click(backButton,driver);
        ReusableMethods.click(checkBoxFirstProduct,driver);
        ReusableMethods.click(checkBoxSecondProduct,driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(productQuantity,driver).contains("0"),"Item failed to remove");
        softAssert.assertAll();

    }
    public void verifyCheckOutFunctionality(AppiumDriver driver)
    {
        ReusableMethods.waitUntilPerformClickAction(product1,driver);
        assertTrue(ReusableMethods.ButtonEnableOrNot(productIncreaseButton,driver),"Button is not enable");
        assertTrue(ReusableMethods.ButtonEnableOrNot(productDecreaseButton,driver),"Button is not enable");
        ReusableMethods.click(productIncreaseButton,driver);
        ReusableMethods.click(productDecreaseButton,driver);
        ReusableMethods.waitUntilPerformClickAction(product2,driver);
        ReusableMethods.click(frowardButton,driver);
        ReusableMethods.click(checkOutButton,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(paymentMethod,driver),"No payment method available");
        ReusableMethods.click(paymentMethod,driver);
        ReusableMethods.click(confirmOrderButton,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(confirmationMessage,driver),"Order Failed to placed");
        assertTrue(ReusableMethods.getTextFromMobileElements(confirmationMessage,driver).contains("নিশ্চিত হয়েছে"),"Order Failed to placed");
        assertTrue(ReusableMethods.ButtonEnableOrNot(backHomeButton,driver),"Back Home Button is not Enable");
        ReusableMethods.click(backHomeButton,driver);
        softAssert.assertAll();

    }
}
