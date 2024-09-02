package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static PageObject.HistoryPageObject.*;
import static org.testng.Assert.assertTrue;

public class HistoryPage {
    public void verifyHistoryButtonEnableOrNot(AppiumDriver driver)
    {
        assertTrue(ReusableMethods.verifyElementsPresent(historyButton,driver),"History Button is not Present");
        assertTrue(ReusableMethods.ButtonEnableOrNot(historyButton,driver),"History Button is not Enable");
    }
    public void verifyMyOrderDataIntegration(AppiumDriver driver)
    {
        ReusableMethods.click(historyButton,driver);
        ReusableMethods.waitForElementVisibility(myOrderSection,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(myOrderSection,driver),"My order section is not present");
        assertTrue(ReusableMethods.verifyElementsPresent(orderData1,driver),"No data Found");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(orderData2,driver),"No data Found");
    }
}
