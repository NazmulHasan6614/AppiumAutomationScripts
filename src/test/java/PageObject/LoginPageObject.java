package PageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginPageObject {
    public static By firstLogInButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"Login\")");
    public static By emailField= AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)");
    public static By passWordField=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)");
    public static By logInButton=AppiumBy.accessibilityId("Login");
    public static By firstPowerLogo=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    public static By errorMessageForUserId=AppiumBy.accessibilityId("This field cannot be empty");
    public static By errorMessageForPasswordField=AppiumBy.accessibilityId("Password is required");
    public static By tapToSeeBalance=AppiumBy.androidUIAutomator("new UiSelector().description(\"ব্যালান্স দেখতে টেপ করুন  \n" +
            "৳\")");
    public static By details=AppiumBy.accessibilityId("বিস্তারিত");

    //Data
    public static String validEmail="dealer@test.com";
    public static String validPassword="12345678";
    public static String inValidEmail="nazmul@gmail.com";
    public static String inValidPassword="647575374";
    public static String inValidEmail2="h@gmail.com";
}
