package Test;

import Pages.LogInPage;
import Pages.StockPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC004StockPageTest extends Base{
    LogInPage logObj=new LogInPage();
    StockPage stockObj=new StockPage();
    @Test(priority = 1)
    public void verifySuccessfulLoginWithValidCredentialsTest()
    {
        logObj.verifySuccessfulLoginWithValidCredentials(driver);
    }
    @Test(priority = 2)
    public void stockButtonEnableOrNotTest()
    {
        stockObj.verifyStockButtonEnableOrNot(driver);
    }
    @Test(priority = 3)
    public void verifyAllProductAreInStockPageTest()
    {
        stockObj.verifyAllProductAreInStockPage(driver);
    }
    @Test(priority = 4)
    public void verifyStockHistoryTest()
    {
        stockObj.verifyStockHistory(driver);
    }

}
