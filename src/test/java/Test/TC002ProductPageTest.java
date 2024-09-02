package Test;

import Pages.LogInPage;
import Pages.ProductPage;
import org.testng.annotations.Test;

public class TC002ProductPageTest extends Base {
    LogInPage logObj=new LogInPage();
    ProductPage productObj=new ProductPage();
    @Test(priority = 1)
    public void verifySuccessfulLoginWithValidCredentialsTest()
    {
        logObj.verifySuccessfulLoginWithValidCredentials(driver);
    }
    @Test(priority = 2)
    public void verifyProductButtonIsEnableTest()
    {
        productObj.verifyProductButtonIsEnable(driver);
    }
    @Test(priority =3)
    public void verifyProductsDetailsTest()
    {
        productObj.verifyProductsDetails(driver);
    }

   @Test(priority = 4)
    public void verifyAddToCartFunctionalityTest()
    {
        productObj.verifyAddToCartFunctionality(driver);
    }

    @Test(priority = 5)
    public void verifyCheckOutFunctionalityTest()
    {
        productObj.verifyCheckOutFunctionality(driver);
    }


}
