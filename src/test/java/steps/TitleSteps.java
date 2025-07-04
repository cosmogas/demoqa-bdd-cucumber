package steps;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TitleSteps {

    @Given("user opens ToolsQA home page")
    public void openHomePage() {
        open("https://demoqa.com");
    }

    @Then("page title should be {string}")
    public void checkPageTitle(String expectedTitle) {
        String actualTitle = title(); // selenide.title()
        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError("Expected title: " + expectedTitle + ", but was: " + actualTitle);
        }
    }

}
