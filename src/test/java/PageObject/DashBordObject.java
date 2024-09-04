package PageObject;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class DashBordObject {
    public static By totalSellSpace= AppiumBy.androidUIAutomator("new UiSelector().description(\"6 পিস\n" +
            "টোটাল সেলস\")");
    public static By dropDown=AppiumBy.androidUIAutomator("new UiSelector().description(\"This Month\")");
    public static By options=AppiumBy.androidUIAutomator("new UiSelector().description(\"August\")");
    public static By sellCommission=By.xpath("//android.view.View[contains(@content-desc, 'ID #FPTD-831433')]");
    public static By backButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    public static By orderId=By.xpath("//android.view.View[contains(@content-desc, 'ID #FPTD-136778')]");
    public static By productName=By.xpath("//android.view.View[@content-desc=\"FastPower Easy Bike Battery - 12 V\"]");
    public static By customersId=AppiumBy.androidUIAutomator("new UiSelector().description(\"অর্ডার আইডি\")");
    public static By name=AppiumBy.androidUIAutomator("new UiSelector().description(\"নাম\")");
    public static By address=AppiumBy.androidUIAutomator("new UiSelector().description(\"নাম\")");
    public static By mobileNo=AppiumBy.androidUIAutomator("new UiSelector().description(\"মোবাইল নাম্বার\")");
    public static By sellCommissionSpace=AppiumBy.androidUIAutomator("new UiSelector().description(\"0 টাকা \n" +
            "সেলস কমিশন\")");
    public static By custom=AppiumBy.androidUIAutomator("new UiSelector().description(\"Custom\")");
    public static By startDate=AppiumBy.androidUIAutomator("new UiSelector().description(\"18, Wednesday, September 18, 2024\")");
    public static By endDate=AppiumBy.androidUIAutomator("new UiSelector().description(\"20, Friday, September 20, 2024\")");
    public static By saveButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"Save\")");
    public static By message=AppiumBy.androidUIAutomator("new UiSelector().description(\"দুঃখিত, কোন রেকর্ড খুজে পাওয়া যায় নি।\")");

}
