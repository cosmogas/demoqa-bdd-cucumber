package steps;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePageSteps {


    @Then("section {string} should be visible")
    public void sectionShouldBeVisible(String sectionTitle) {
        $(".card-body").shouldHave(text(sectionTitle));
    }
}
