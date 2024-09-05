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
    public static By targetSpace=AppiumBy.androidUIAutomator("new UiSelector().description(\"১৫০০ পিস\n" +
            "টার্গেট\")");
    public static By message1=AppiumBy.androidUIAutomator("new UiSelector().description(\"দুঃখিত, কোন রেকর্ড খুজে পাওয়া যায় নি।\")");
    public static By targetCommissionSpace=By.xpath("//android.widget.ImageView[@content-desc=\"১৫০০ পিস\n" +
            "টার্গেট কমিশন\"]");
    public static By targetBonus=AppiumBy.xpath("(//android.widget.ImageView[contains(@content-desc, 'Fastpower genuine Li-ion UPS Battery')])[1]");
    public static By sellsEntry=AppiumBy.androidUIAutomator("new UiSelector().description(\"সেলস \n" +
            "এন্ট্রি\")");
    public static By sellsEntryProduct=AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc, 'FastPower Easy Bike Battery - 12 V')]");
    public static By sellsEntryCheckBox=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(7)");
    public static By customerDetailsSearchField=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)");
    public static By customer=AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc, '01764233618')]");
    public static By confirmRadioBox=AppiumBy.xpath("//android.view.View[@content-desc=\"আমি সকল তথ্য সঠিক ভাবে যাচাই বাছাই করে বিক্রয় নিশ্চিত করছি\"]");
    public static By radioBox=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(17)");
    public static By purchaseButton=AppiumBy.xpath("(//android.view.View[@content-desc=\"বিক্রয় নিশ্চিত করুন\"])[2]");
    public static By orderSuccessMessage=AppiumBy.xpath("//android.view.View[@content-desc=\"বিক্রয় নিশ্চিত হয়েছে\"]");
    public static By customerName=AppiumBy.androidUIAutomator("new UiSelector().description(\"Nazmul\")");

    //Data
    public static String customerPhoneNumber="01764233618";

}
