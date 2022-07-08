@Regression
Feature: Api Demo Application

  @ValidateText
  Scenario: Get text of button
    Given user gets text of Accessibility option
    Then user validates that it is "Accessibility"