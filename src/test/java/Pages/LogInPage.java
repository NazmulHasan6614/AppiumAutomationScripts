package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static PageObject.LoginPageObject.*;

import static org.testng.Assert.assertTrue;

public class LogInPage {
    SoftAssert softAssert=new SoftAssert();
    public void elementVerifyOfLoginPage(AppiumDriver driver) {
        assertTrue(ReusableMethods.verifyElementsPresent(emailField, driver), "No Element Found");
        assertTrue(ReusableMethods.verifyElementsPresent(passWordField, driver), "No Element Found");
        softAssert.assertAll();
    }

    public void verifyLogInWithBothPasswordAndEmailNull(AppiumDriver driver) {
        ReusableMethods.click(logInButton, driver);
        assertTrue(ReusableMethods.verifyElementsPresent(errorMessageForUserId, driver), "LogIn successfully");
        assertTrue(ReusableMethods.verifyElementsPresent(errorMessageForPasswordField, driver), "LogIn successfully");
        softAssert.assertAll();
    }

    public void verifyLoginWithNullUserName(AppiumDriver driver) {
        ReusableMethods.click(passWordField, driver);
        ReusableMethods.sendData(passWordField, driver, validPassword);
        ReusableMethods.click(logInButton, driver);
        ReusableMethods.Clear(passWordField, driver);
        assertTrue(ReusableMethods.verifyElementsPresent(errorMessageForUserId, driver), "LogIn successfully");
        softAssert.assertAll();

    }

    public void verifyLoginWithNullPassWord(AppiumDriver driver) {
        ReusableMethods.click(emailField, driver);
        ReusableMethods.sendData(emailField, driver, validEmail);
        ReusableMethods.click(logInButton, driver);
        ReusableMethods.Clear(emailField, driver);
        assertTrue(ReusableMethods.verifyElementsPresent(errorMessageForPasswordField, driver), "LogIn successfully");
        softAssert.assertAll();

    }


    public void verifyLoginWithInvalidCredentials(AppiumDriver driver) {

            ReusableMethods.click(emailField, driver);
            ReusableMethods.sendData(emailField, driver, inValidEmail);
            ReusableMethods.click(passWordField, driver);
            ReusableMethods.sendData(passWordField, driver, inValidPassword);
            ReusableMethods.click(logInButton, driver);
            ReusableMethods.click(emailField, driver);
            ReusableMethods.Clear(emailField, driver);
            ReusableMethods.click(passWordField, driver);
            ReusableMethods.Clear(passWordField, driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public void verifySuccessfulLoginWithValidCredentials(AppiumDriver driver) {
        ReusableMethods.click(emailField, driver);
        ReusableMethods.sendData(emailField, driver, validEmail);
        ReusableMethods.click(passWordField, driver);
        ReusableMethods.sendData(passWordField, driver, validPassword);
        ReusableMethods.click(logInButton, driver);
        assertTrue(ReusableMethods.verifyElementsPresent(firstPowerLogo, driver), "Login Denied");
        ReusableMethods.waitUntilPerformClickAction(tapToSeeBalance,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(details,driver),"Tap to balance is not working");
        softAssert.assertAll();

    }

}
