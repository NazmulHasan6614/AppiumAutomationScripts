package Test;

import Pages.HistoryPage;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class TC003HistoryPageTest extends Base {
    HistoryPage hObj=new HistoryPage();
    LogInPage logObj=new LogInPage();
    @Test(priority = 1)
    public void verifySuccessfulLoginWithValidCredentialsTest()
    {
        logObj.verifySuccessfulLoginWithValidCredentials(driver);
    }
    @Test(priority = 2)
    public void verifyHistoryButtonEnableOrNotTest()
    {
        hObj.verifyHistoryButtonEnableOrNot(driver);
    }
    @Test(priority = 3)
    public void verifyMyOrderDataIntegrationTest()
    {
        hObj.verifyMyOrderDataIntegration(driver);
    }
}
