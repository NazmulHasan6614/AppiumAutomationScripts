package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import org.testng.asserts.SoftAssert;

import static PageObject.DashBordObject.*;
import static PageObject.ProductPageObject.backHomeButton;
import static PageObject.ProductPageObject.frowardButton;

public class DashBord {
    SoftAssert softAssert = new SoftAssert();

    public void verifyTotalSell(AppiumDriver driver) {
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(totalSellSpace, driver), "Total sell Space is not enable");
        ReusableMethods.click(totalSellSpace, driver);
        ReusableMethods.click(dropDown, driver);
        ReusableMethods.scrollIntoElementAndClick(options, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(sellCommission, driver));
        ReusableMethods.click(backButton, driver);

    }

    public void verifySellAndCustomersDetails(AppiumDriver driver) {
        ReusableMethods.click(totalSellSpace, driver);
        ReusableMethods.click(orderId, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(productName, driver), "No product Found in sell details");
        softAssert.assertTrue(ReusableMethods.getTextFromMobileElements(productName, driver).contains("Easy Bike"), "Product name does not match");
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(customersId, driver), "Customers Id is not present");
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(name, driver), "Name is not present");
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(address, driver), "Address is not present");
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(mobileNo, driver), "Mobile is not present");
        ReusableMethods.click(backButton, driver);


    }

    public void verifySellCommission(AppiumDriver driver) {
        ReusableMethods.click(backButton, driver);
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(sellCommissionSpace, driver), "Sell space is not enable");
        ReusableMethods.click(sellCommissionSpace, driver);
        ReusableMethods.click(dropDown, driver);
        ReusableMethods.scrollIntoElementAndClick(custom, driver);
        ReusableMethods.click(startDate, driver);
        ReusableMethods.click(endDate, driver);
        ReusableMethods.click(saveButton, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(message, driver));
        ReusableMethods.click(backButton, driver);
    }

    public void verifyTargetFunctionality(AppiumDriver driver) {
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(targetSpace, driver), "Target Button Is Not Enable");
        ReusableMethods.click(targetSpace, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(message1, driver), "No Data Found Target");
        ReusableMethods.click(backButton, driver);
    }

    public void VerifyTargetCommission(AppiumDriver driver) {
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(targetCommissionSpace, driver), "Target Commission Is Not Enable");
        ReusableMethods.waitUntilPerformClickAction(targetCommissionSpace, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(targetBonus, driver), "No Data Found Target Commission");
        softAssert.assertTrue(ReusableMethods.getTextFromMobileElements(targetBonus, driver).contains("200"), "Target Commission is not accurate");
        ReusableMethods.click(backButton,driver);

    }

     public void verifyQuickActionSellsEntry(AppiumDriver driver){
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(sellsEntry, driver), "Sells entry is not enable");
        ReusableMethods.click(sellsEntry, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(sellsEntryProduct, driver), "No Sells Entry Found");
        softAssert.assertFalse(ReusableMethods.isRadioButtonSelected(sellsEntryCheckBox, driver), "Check box is Selected");
        ReusableMethods.click(sellsEntryCheckBox, driver);
        ReusableMethods.click(frowardButton, driver);
        ReusableMethods.click(customerDetailsSearchField, driver);
        ReusableMethods.sendData(customerDetailsSearchField, driver, customerPhoneNumber);
        ReusableMethods.waitUntilPerformClickAction(customer,driver);
        softAssert.assertTrue( ReusableMethods.getTextFromMobileElements(customerName,driver).contains("Nazmul"),"Search Can't filter perfectly");
        ReusableMethods.click(frowardButton, driver);
        ReusableMethods.click(confirmRadioBox, driver);
        softAssert.assertTrue(ReusableMethods.isRadioButtonSelected(radioBox, driver), "Radio Button is not selected");
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(purchaseButton, driver), "Purchase Button is not Enable");
        ReusableMethods.click(purchaseButton, driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(orderSuccessMessage, driver), "Order Failed To Placed");
        ReusableMethods.click(backHomeButton,driver);


    }
    public void makePaymentFunctionality(AppiumDriver driver)
    {
        softAssert.assertTrue(ReusableMethods.ButtonEnableOrNot(makePayment,driver),"Make Payment Button is not Enable");
        ReusableMethods.click(makePayment,driver);
        softAssert.assertTrue(ReusableMethods.verifyElementsPresent(paymentMethod,driver),"No Payment Method is Available");
        ReusableMethods.click(paymentMethod,driver);
        softAssert.assertTrue(ReusableMethods.isRadioButtonSelected(paymentRadioButton,driver),"Radio Button is not Selected");
        softAssert.assertFalse(ReusableMethods.isButtonClickable(paymentConfirmButton,driver),"Button Is Not Clickable");
    }
}
