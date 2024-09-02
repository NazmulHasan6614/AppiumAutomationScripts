package PageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductPageObject {
    public static By productButton= AppiumBy.androidUIAutomator("new UiSelector().description(\"প্রোডাক্টস \")");
    public static By productDetails=By.xpath("//android.widget.ImageView[contains(@content-desc, 'FastPower Easy Bike Battery') and contains(@content-desc, '৳16000')]");
    public static By productName=AppiumBy.androidUIAutomator("new UiSelector().description(\"FastPower Easy Bike Battery - 12 V\")");
    public static By customersPrice=AppiumBy.androidUIAutomator("new UiSelector().description(\"Customer price\")");
    public static By dealerPrice=AppiumBy.androidUIAutomator("new UiSelector().description(\"Dealer price\")");
    public static By backButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    public static By plusIcon=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)");
    public static By product1=By.xpath("//android.widget.ImageView[contains(@content-desc, 'FastPower Easy Bike Battery') and contains(@content-desc, '৳16000')]");
    public static By product2=By.xpath("//android.widget.ImageView[contains(@content-desc, 'Betacell -12V- 120Ah') and contains(@content-desc, '৳27000')]");
    public static By frowardButton=AppiumBy.accessibilityId("এগিয়ে যান");
    public static By productName1=By.xpath("(//android.view.View[@content-desc=\"Fastpower genuine Li-ion UPS Battery\"])[1]");
    public static By productName2=By.xpath("(//android.view.View[@content-desc=\"Fastpower genuine Li-ion UPS Battery\"])[2]");
    public static By checkBoxFirstProduct=By.xpath("//android.view.View[contains(@content-desc, 'FastPower Easy Bike Battery')]/android.widget.ImageView[2]");
    public static By checkBoxSecondProduct=By.xpath("//android.view.View[contains(@content-desc, 'Betacell -12V- 120Ah')]/android.widget.ImageView[2]");
    public static By productQuantity=AppiumBy.androidUIAutomator("new UiSelector().description(\"সাব টোটাল (0 আইটেম)\")");
    public static By checkOutButton=By.xpath("(//android.view.View[@content-desc=\"চেকআউট\"])[2]");
    public static By paymentMethod=AppiumBy.androidUIAutomator("new UiSelector().description(\"Cash On Delivery\")");
    public static By confirmOrderButton=By.xpath("//android.view.View[@content-desc=\"অর্ডার নিশ্চিত করুন\"]");
    public static By confirmationMessage=By.xpath("//android.view.View[@content-desc=\"অর্ডার নিশ্চিত হয়েছে\"]");
    public static By backHomeButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"হোম এ ফিরে যান\")");
    public static By productIncreaseButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(9)");
    public static By productDecreaseButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(8)");
}
