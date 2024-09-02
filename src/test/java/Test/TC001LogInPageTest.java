package Test;

import Pages.LogInPage;
import org.testng.annotations.Test;

public class TC001LogInPageTest extends Base {
    LogInPage logObj=new LogInPage();
    @Test(priority = 1)
    public void elementVerifyOfLoginPageTest()
    {
        logObj.elementVerifyOfLoginPage(driver);
    }
    @Test(priority = 2)
    public void verifyLogInWithBothPasswordAndEmailNullTest()
    {
        logObj.verifyLogInWithBothPasswordAndEmailNull(driver);
    }
    @Test(priority = 3)
    public void verifyLoginWithNullUserNameTest()
    {
        logObj.verifyLoginWithNullUserName(driver);
    }
    @Test(priority = 4)
    public void verifyLoginWithNullPassWord()
    {
        logObj.verifyLoginWithNullPassWord(driver);
    }

    @Test(priority = 5)
    public void verifyLoginWithInvalidCredentialsTest()
    {
        logObj.verifyLoginWithInvalidCredentials(driver);
    }
    @Test(priority = 6)
    public void verifySuccessfulLoginWithValidCredentialsTest()
    {
        logObj.verifySuccessfulLoginWithValidCredentials(driver);
    }
}
