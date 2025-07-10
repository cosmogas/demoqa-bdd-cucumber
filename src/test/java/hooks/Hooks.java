package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class Hooks {

    @Before
    public void setUp() {
        // Selenide config
        Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;

        // Allure + Selenide integration
        addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}

