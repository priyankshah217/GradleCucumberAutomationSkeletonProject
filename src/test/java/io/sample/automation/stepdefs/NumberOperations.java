package io.sample.automation.stepdefs;

import io.cucumber.java8.En;

import static com.google.common.truth.Truth.assertThat;

public class NumberOperations implements En {
  private Integer actualResult;

  public NumberOperations() {
    When("I {string} {int} and {int}", (String operation, Integer num1, Integer num2) -> {
      switch (operation) {
        case "add":
          actualResult = num1 + num2;
          break;
        case "subtract":
          actualResult = num1 - num2;
          break;
        case "multiply":
          actualResult = num1 * num2;
          break;
        case "divide":
          actualResult = num1 / num2;
          break;
      }
    });
    Then("It should show me {int}", (Integer expectedResult) -> {
      assertThat(actualResult).isEqualTo(expectedResult);
    });
  }
}
