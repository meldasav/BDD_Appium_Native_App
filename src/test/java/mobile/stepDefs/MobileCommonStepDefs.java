package mobile.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mobile.utils.MobileCommonUtils;
import org.junit.Assert;

public class MobileCommonStepDefs {

    @Given("user taps on {string}")
    public void userTapsOn(String menuOptionText) {
        MobileCommonUtils.tapByElement(MobileHooks.androidDriver, MobileCommonUtils.elementByText(MobileHooks.androidDriver, menuOptionText));
    }

    @And("user should see {string}")
    public void userShouldSee(String expectedText) {
        Assert.assertTrue(MobileCommonUtils.elementByText(MobileHooks.androidDriver, expectedText).isDisplayed());
    }
}
