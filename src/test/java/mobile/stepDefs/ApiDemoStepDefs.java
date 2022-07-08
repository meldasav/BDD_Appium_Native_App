package mobile.stepDefs;

import io.appium.java_client.android.AndroidElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.utils.MobileCommonUtils;
import org.junit.Assert;


import java.util.List;

public class ApiDemoStepDefs {
    String actualOptionText;
    List<AndroidElement> actualAllOptions;
    int actualSizeOfElements;

    @Given("user gets text of Accessibility option")
    public void userGetsTextOfAccessibilityOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.accessibilityOption.getText();
    }

    @Then("user validates that it is {string}")
    public void userValidatesThatItIs(String expectedOptionText) {
        Assert.assertEquals(expectedOptionText, actualOptionText);
    }

    @Given("user gets texts of all options")
    public void userGetsTextsOfAllOptions() {
        actualAllOptions = MobileHooks.apiDemoHomePage.allOptions;
    }

    @Then("user validates options")
    public void userValidatesOptions(DataTable expectedAllAOptions) {
        MobileCommonUtils.assertTextForTwoLists(expectedAllAOptions, actualAllOptions);
    }

    @Given("user gets all elements with className")
    public void userGetsAllElementsWithClassName() {
        actualSizeOfElements = MobileHooks.apiDemoHomePage.allOptionsWithClassName.size();
    }

    @Then("user validates size of element is {int}")
    public void userValidatesSizeOfElementIs(int expectedSizeOfElements) {
        Assert.assertEquals(expectedSizeOfElements, actualSizeOfElements);
    }

    @Given("user gets text of Graphics option")
    public void userGetsTextOfGraphicsOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.graphicsOption.getText();
    }

    @Given("user gets text of Media option")
    public void userGetsTextOfMediaOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.mediaOption.getText();
    }

    @Given("user gets text of Views option")
    public void userGetsTextOfViewsOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.viewsOption.getText();
    }

    @Given("user taps on Graphics")
    public void userTapsOnGraphics() {
        MobileCommonUtils.tapByElement(MobileHooks.androidDriver, MobileHooks.apiDemoHomePage.graphicsOption);
    }

    @Then("user validates that {string} is visible")
    public void userValidatesThatIsVisible(String expectedText) {
        Assert.assertTrue(MobileCommonUtils.elementByText(MobileHooks.androidDriver, expectedText).isDisplayed());
    }

    @When("user taps on Custom Evaluator")
    public void userTapsOnCustomEvaluator() {
    }

    @Then("user should see Play Button")
    public void userShouldSeePlayButton() {
    }

    @Then("user scrolls and taps on {string}")
    public void userScrollsAndTapsOn(String expectedTab) {
        MobileCommonUtils.scrollAndClick(MobileHooks.androidDriver, expectedTab);
    }

    @Then("user validates picture is displayed")
    public void userValidatesPictureIsDisplayed() {
        Assert.assertTrue(MobileHooks.apiDemoVerticesPage.picture.isDisplayed());
    }

    @Then("user validates title is {string}")
    public void userValidatesTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, MobileHooks.apiDemoVerticesPage.actualTitle.getText());
    }

    @Then("user validates options are displayed")
    public void userValidatesOptionsAreDisplayed(DataTable expectedOptions) {
        //   MobileCommonUtils.assertTextForTwoLists(expectedOptions, MobileHooks.apiDemoHomePage.allOptions);
        for (int i = 0; i < expectedOptions.asList().size(); i++) {
            Assert.assertTrue(MobileCommonUtils.elementByText(MobileHooks.androidDriver, expectedOptions.asList().get(i)).isDisplayed());
        }
    }

    @And("user validates the message is {string}")
    public void userValidatesTheMessageIs(String expectedMessage) {
        Assert.assertEquals(expectedMessage.trim(), MobileHooks.apiDemoLogTextBoxPage.allText.getText().trim());
    }

    @And("user validates there is only one message {string}")
    public void userValidatesThereIsOnlyOneMessage(String expectedText) {
        Assert.assertEquals(expectedText.trim(), MobileHooks.apiDemoLogTextBoxPage.allText.getText().trim());
    }

    @Given("user taps by coordinates {int}, {int} on {string}")
    public void userTapsByCoordinatesOn(int x, int y, String optionToTab) {
        MobileCommonUtils.tapByCoordinates(MobileHooks.androidDriver, x, y);
        System.out.println("user taps on " + optionToTab);
    }

    @And("user presses long enough by coordinates {int}, {int} to {string}")
    public void userPressesLongEnoughByCoordinatesTo(int x, int y, String optionToTab) {
        MobileCommonUtils.pressByCoordinates(MobileHooks.androidDriver, x, y, 5);
        System.out.println("user taps on " + optionToTab);
    }

    @Given("user swipes on {string} xStart {int} xEnd {int}, y {int}")
    public void userSwipesOnXStartXEndY(String swipedOption, int xStart, int xEnd, int y) {
        MobileCommonUtils.horizontalSwipeByCoordinates(MobileHooks.androidDriver, xStart, xEnd, y);
        System.out.println("user swipes on " + swipedOption);
    }

    @When("user swipe down by coordinates x {int} yStart {int} and yEnd {int} and taps on {string}")
    public void userSwipeDownByCoordinatesXYStartAndYEndAndTapsOn(int x, int yStart, int yEnd, String optionToTab) {
        for (int i = 0; i < 5; i++) {
            MobileCommonUtils.verticalSwipeByCoordinates(MobileHooks.androidDriver, x, yStart, yEnd);
        }
        MobileCommonUtils.tapByElement(MobileHooks.androidDriver, MobileCommonUtils.elementByText(MobileHooks.androidDriver, optionToTab));
    }
}
