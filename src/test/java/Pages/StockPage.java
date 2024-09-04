package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static PageObject.StockPageObject.*;
import static org.testng.Assert.assertTrue;

public class StockPage {
    public void verifyStockButtonEnableOrNot(AppiumDriver driver)
    {
        assertTrue(ReusableMethods.ButtonEnableOrNot(stockButton,driver),"Stock Button is not Functional");
    }
    public void verifyAllProductAreInStockPage(AppiumDriver driver)
    {
        ReusableMethods.click(stockButton,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(easyBikeBattery,driver),"Data not found");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(easyBikeBattery1,driver),"Data not found");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(easyBikeBattery2,driver),"Data not found");
    }
    public void verifyStockHistory(AppiumDriver driver)
    {
        ReusableMethods.click(easyBikeBattery,driver);
        assertTrue(ReusableMethods.ButtonEnableOrNot(inButton,driver),"In button is not enable");
        assertTrue(ReusableMethods.ButtonEnableOrNot(outButton,driver),"Out button is not enable");
        assertTrue(ReusableMethods.verifyElementsPresent(stockId,driver),"No stock id Found");

    }
}
