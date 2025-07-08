package steps;

import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class NegativeLoginSteps {

    @Given("user opens login page for negative test")
    public void openLoginPageForNegative() {
        clearBrowserCookies();
        open("https://demoqa.com/login");
        $("#userForm").shouldBe(visible);
    }

    @When("user attempts to login with invalid username {string} and password {string}")
    public void attemptLoginInvalid(String username, String password) {
        $("#userName").shouldBe(visible).setValue(username);
        $("#password").shouldBe(visible).setValue(password);
        $("#login").click();
    }

    @Then("error message {string} should appear on login page")
    public void errorMessageShouldAppear(String expectedMessage) {
        $("#name").shouldBe(visible).shouldHave(text(expectedMessage));
    }
}
