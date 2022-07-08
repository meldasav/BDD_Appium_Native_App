package mobile.stepDefs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mobile.utils.DesiredCapabilitiesUtils;
import mobile.pages.ApiDemoHomePage;
import org.openqa.selenium.WebDriver;


public class MobileHooks {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static WebDriver webDriver;
    public static ApiDemoHomePage apiDemoHomePage;

    @Before
    public void setup() throws Exception {
        androidDriver = DesiredCapabilitiesUtils.setupAndroidDesiredCapabilities();
        apiDemoHomePage = new ApiDemoHomePage(androidDriver);

    }

    @After
    public void tearDown() {
        DesiredCapabilitiesUtils.quitDriver();
    }
}
