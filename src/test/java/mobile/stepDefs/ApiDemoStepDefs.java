package mobile.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static mobile.stepDefs.MobileHooks.apiDemoHomePage;
import static mobile.stepDefs.MobileHooks.apiDemoViewsPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ApiDemoStepDefs {
    String actualOptionText;

    @Given("user gets text of Accessibility option")
    public void userGetsTextOfAccessibilityOption() {
        actualOptionText = apiDemoHomePage.accessibilityOption.getText();
    }

    @Then("user validates that it is {string}")
    public void userValidatesThatItIs(String expectedOptionText) {
        assertEquals(expectedOptionText, actualOptionText);
    }

    @Given("user taps on {string}")
    public void userTapsOn(String elementText) {
        apiDemoHomePage.accessibilityOption.click();
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedElementText) {
        assertEquals(expectedElementText, apiDemoHomePage.customView.getText());
    }

    @Given("user taps on Views")
    public void userTapsOnViews() {
        apiDemoHomePage.viewsOption.click();
    }

    @And("user taps on Animation")
    public void userTapsOnAnimation() {
        apiDemoViewsPage.animationOption.click();
    }

    @And("user taps on Shake")
    public void userTapsOnShake() {
        apiDemoViewsPage.shakeOption.click();
    }

    @Then("user should be able to see input box")
    public void userShouldBeAbleToSeeInputBox() {
        assertTrue(apiDemoViewsPage.passwordInputBox.isDisplayed());
    }

    @Given("user gets texts of all options and validates them")
    public void userGetsTextsOfAllOptionsAndValidatesThem(DataTable allExpectedOptions) {
        for (int i = 0; i < allExpectedOptions.asList().size(); i++) {
            assertEquals(allExpectedOptions.asList().get(i), apiDemoHomePage.allMainMenuOptions.get(i).getText());
        }
    }
}




