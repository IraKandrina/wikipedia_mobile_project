package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import io.qameta.allure.selenide.AllureSelenide;
import helpers.Attach;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = sessionId().toString();
        Attach.pageSource();
        if (deviceHost.equals("local")) {
            Attach.screenshotAs("Last screenshot");
        }
        if (deviceHost.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }
        closeWebDriver();
    }
}
