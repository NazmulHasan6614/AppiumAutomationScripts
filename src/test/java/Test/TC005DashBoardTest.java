package Test;

import Pages.DashBord;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class TC005DashBoardTest extends Base {
    LogInPage logObj = new LogInPage();
    DashBord dObj = new DashBord();

    @Test(priority = 1)
    public void verifySuccessfulLoginWithValidCredentialsTest() {
        logObj.verifySuccessfulLoginWithValidCredentials(driver);
    }


    @Test(priority = 2)
    public void verifyTotalSellTest()
    {
        dObj.verifyTotalSell(driver);
    }
    @Test(priority = 3)
    public void verifySellAndCustomersDetailsTest()
    {
        dObj.verifySellAndCustomersDetails(driver);
    }
    @Test(priority = 4)
    public void verifySellCommissionTest()
    {
        dObj.verifySellCommission(driver);
    }
    @Test(priority = 5)
    public void verifyTargetFunctionalityTest()
    {
        dObj.verifyTargetFunctionality(driver);
    }
    @Test(priority = 6)
    public void VerifyTargetCommissionTest()
    {
        dObj.VerifyTargetCommission(driver);
    }
    @Test(priority = 7)
    public void verifyQuickActionSellsEntryTest()
    {
        dObj.verifyQuickActionSellsEntry(driver);
    }

    @Test(priority = 8)
    public void makePaymentFunctionalityTest() {
        dObj.makePaymentFunctionality(driver);
    }


}
