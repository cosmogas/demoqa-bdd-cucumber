package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        Configuration.headless = true;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
    }
}
