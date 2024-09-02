package Test;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import static PageObject.LoginPageObject.firstLogInButton;

public class Base {
    public static AppiumDriver driver;


    @BeforeClass
    public  void launchingMobileApp() throws MalformedURLException {
        try {
            UiAutomator2Options capabilities = new UiAutomator2Options();
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "14");
            capabilities.setCapability("automationName", "uiAutomator2");
            capabilities.setCapability("appPackage", "com.example.fast_power_dealer");
            capabilities.setCapability("appActivity", "com.example.fast_power_dealer.MainActivity");

            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, capabilities);
            ReusableMethods.waitUntilPerformClickAction(firstLogInButton,driver);

        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
