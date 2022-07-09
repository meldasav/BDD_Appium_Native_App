package mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ApiDemoViewsPage {

    public ApiDemoViewsPage(AndroidDriver<AndroidElement> androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Animation\")")
    public AndroidElement animationOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Shake\"]")
    public AndroidElement shakeOption;

    @AndroidFindBy(id = "io.appium.android.apis:id/pw")
    public AndroidElement passwordInputBox;

}
