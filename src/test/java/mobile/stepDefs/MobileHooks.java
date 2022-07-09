package mobile.stepDefs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mobile.pages.ApiDemoHomePage;
import mobile.pages.ApiDemoViewsPage;
import mobile.utils.Driver;


public class MobileHooks {
    public static AndroidDriver<AndroidElement> androidDriver;
    public static ApiDemoHomePage apiDemoHomePage;
    public static ApiDemoViewsPage apiDemoViewsPage;

    @Before
    public void setup() throws Exception {
        androidDriver = Driver.getDriver();
        apiDemoHomePage = new ApiDemoHomePage(androidDriver);
        apiDemoViewsPage = new ApiDemoViewsPage(androidDriver);
    }


    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}
