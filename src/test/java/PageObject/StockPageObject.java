package PageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class StockPageObject {
    public static By stockButton=By.xpath("//android.widget.ImageView[@content-desc=\"স্টক \"]");
    public static By easyBikeBattery= By.xpath("//android.widget.ImageView[contains(@content-desc, 'FastPower Easy Bike Battery - 12 V') and contains(@content-desc, 'Stock: 17')]");
    public static By easyBikeBattery1 =By.xpath("//android.widget.ImageView[@content-desc=\"AutoLife Easy Bike Battery\n" +
            "Stock: 23\"]");
    public static By easyBikeBattery2=By.xpath("//android.widget.ImageView[@content-desc=\"SixCell Easy Bike Battery - 12V\n" +
            "Stock: 17\"]");
    public static By inButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"In\")");
    public static By outButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"Out\")");
    public static By stockId=By.xpath("(//android.view.View[contains(@content-desc, 'Stock ID #123456789') and contains(@content-desc, 'Invoice ID #123456789')])[2]");
}
