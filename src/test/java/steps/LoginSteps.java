package steps;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginSteps {

    @Given("user opens login page")
    public void openLoginPage() {
        open("https://demoqa.com/login");
    }

    @When("user logs in with username {string} and password {string}")
    public void login(String username, String password) {
        $("#userName").setValue(username);
        $("#password").setValue(password);
        $("#login").click();
    }

    @Then("dashboard should show username {string}")
    public void checkUsername(String username) {
        $("#userName-value").shouldHave(text(username));
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        open("https://demoqa.com/login");


        $("#userName").should(appear);
        $("#password").should(appear);


        $("#userName").setValue("testuser");
        $("#password").setValue("Test1234!");
        $("#login").click();

        $("#userName-value").should(appear).shouldHave(text("TestUser"));
    }


}







