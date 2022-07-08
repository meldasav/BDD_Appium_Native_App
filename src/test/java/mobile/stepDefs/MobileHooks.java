package mobile.stepDefs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mobile.pages.ApiDemoLogTextBoxPage;
import mobile.utils.DesiredCapabilitiesUtils;
import mobile.pages.ApiDemoHomePage;
import mobile.pages.ApiDemoVerticesPage;
import org.openqa.selenium.WebDriver;


public class MobileHooks {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static WebDriver webDriver;
    public static ApiDemoHomePage apiDemoHomePage;
    public static ApiDemoVerticesPage apiDemoVerticesPage;
    public static ApiDemoLogTextBoxPage apiDemoLogTextBoxPage;

    @Before
    public void setup() throws Exception {
        androidDriver = DesiredCapabilitiesUtils.setupAndroidDesiredCapabilities();
        apiDemoHomePage = new ApiDemoHomePage(androidDriver);
        apiDemoVerticesPage = new ApiDemoVerticesPage(androidDriver);
        apiDemoLogTextBoxPage = new ApiDemoLogTextBoxPage(androidDriver);
    }

    @After
    public void tearDown() {
        DesiredCapabilitiesUtils.quitDriver();
    }
}
