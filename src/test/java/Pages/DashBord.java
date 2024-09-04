package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static PageObject.DashBordObject.*;
import static org.testng.Assert.assertTrue;

public class DashBord {
    public void verifyTotalSell(AppiumDriver driver) {
        assertTrue(ReusableMethods.verifyElementsPresent(totalSellSpace, driver), "Total sell Space is not enable");
        ReusableMethods.click(totalSellSpace, driver);
        ReusableMethods.click(dropDown, driver);
        ReusableMethods.scrollIntoElementAndClick(options, driver);
        assertTrue(ReusableMethods.verifyElementsPresent(sellCommission, driver));
        ReusableMethods.click(backButton,driver);

    }

    public void verifySellAndCustomersDetails(AppiumDriver driver)
    {
        ReusableMethods.click(totalSellSpace,driver);
        ReusableMethods.click(orderId,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(productName,driver),"No product Found in sell details");
        assertTrue(ReusableMethods.getTextFromMobileElements(productName,driver).contains("Easy Bike"),"Product name does not match");
        assertTrue(ReusableMethods.verifyElementsPresent(customersId,driver),"Customers Id is not present");
        assertTrue(ReusableMethods.verifyElementsPresent(name,driver),"Name is not present");
        assertTrue(ReusableMethods.verifyElementsPresent(address,driver),"Address is not present");
        assertTrue(ReusableMethods.verifyElementsPresent(mobileNo,driver),"Mobile is not present");
       ReusableMethods.click(backButton,driver);


    }
    public void verifySellCommission(AppiumDriver driver)
    {
        ReusableMethods.click(backButton,driver);
        assertTrue(ReusableMethods.ButtonEnableOrNot(sellCommissionSpace,driver),"Sell space is not enable");
        ReusableMethods.click(sellCommissionSpace,driver);
        ReusableMethods.click(dropDown,driver);
        ReusableMethods.scrollIntoElementAndClick(custom,driver);
        ReusableMethods.click(startDate,driver);
        ReusableMethods.click(endDate,driver);
        ReusableMethods.click(saveButton,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(message,driver));
    }
}
