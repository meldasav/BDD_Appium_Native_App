package mobile.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ApiDemoStepDefs {
    String actualOptionText;

    @Given("user gets text of Accessibility option")
    public void userGetsTextOfAccessibilityOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.accessibilityOption.getText();
    }

    @Then("user validates that it is {string}")
    public void userValidatesThatItIs(String expectedOptionText) {
        Assert.assertEquals(expectedOptionText, actualOptionText);
    }

}
