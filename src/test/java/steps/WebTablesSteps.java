package steps;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebTablesSteps {

    @Given("user opens web tables page")
    public void openWebTablesPage() {
        open("https://demoqa.com/webtables");
    }

    @When("user adds new person with name {string} and email {string}")
    public void addNewPerson(String name, String email) {
        $("#addNewRecordButton").click();
        $("#firstName").setValue(name);
        $("#lastName").setValue("Testovich");
        $("#userEmail").setValue(email);
        $("#age").setValue("30");
        $("#salary").setValue("10000");
        $("#department").setValue("QA");
        $("#submit").click();
    }

    @Then("table should contain entry with name {string} and email {string}")
    public void checkTableEntry(String name, String email) {
        $$(".rt-tr-group").findBy(text(name)).shouldHave(text(email));
    }
}


