package PageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HistoryPageObject {
    public static By historyButton= AppiumBy.androidUIAutomator("new UiSelector().description(\"হিস্টোরি \")");
    public static By myOrderSection=By.xpath("//android.view.View[@content-desc=\"আমার অর্ডার\n" +
            "Tab 1 of 2\"]");
    public static By orderData1=By.xpath("//android.view.View[contains(@content-desc, 'ID #FD-173761')]");
    public static By orderData2=By.xpath("//android.view.View[contains(@content-desc, 'ID #FD-571716')]");
}
