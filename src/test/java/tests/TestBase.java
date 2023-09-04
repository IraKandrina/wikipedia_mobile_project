package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import io.qameta.allure.selenide.AllureSelenide;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    public static String testType = System.getProperty("testType");
    @BeforeAll
    static void beforeAll() {
        if (testType == null) {
            testType = "local";
        }

        if (testType.equals("local")) {
            Configuration.browser = LocalMobileDriver.class.getName();
        } else {
            Configuration.browser = BrowserstackMobileDriver.class.getName();
        }

        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = sessionId().toString();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        if (testType.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }

        closeWebDriver();
    }
}
