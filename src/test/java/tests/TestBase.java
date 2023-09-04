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
    //public static String testType = System.getProperty("testType");
    //static String driver = System.getProperty("mobileDeviceHost", "browserstack");
    //public static String deviceHost = System.getProperty("deviceHost");
    //public static String testType = System.getProperty("testType");
    public static String testType = System.getProperty("testType");
    @BeforeAll
    static void beforeAll() {
//        if (driver.equals("browserstack")) {
//            Configuration.browser = BrowserstackMobileDriver.class.getName();
//        } else if (driver.equals("emulation")) {
//            Configuration.browser = LocalMobileDriver.class.getName();
//        } else {
//            throw new RuntimeException("Incorrect stand name");
//        }

        //Configuration.browser = LocalMobileDriver.class.getName();
//        if (testType == null) {
//            testType = "local";
//        }

//        if (testType == null) {
//            testType = "remote";
//        }
//
//        if (testType.equals("local")) {
//            Configuration.browser = LocalMobileDriver.class.getName();
//        } else {
//            Configuration.browser = BrowserstackMobileDriver.class.getName();
//        }
//
//        Configuration.browserSize = null;
        //Configuration.timeout = 30000;

//        switch (deviceHost) {
//            case "browserstack":
        //Configuration.browser = BrowserstackMobileDriver.class.getName();
//        Configuration.browser = BrowserstackMobileDriver.class.getName();
////                break;
////            case "local":
////                Configuration.browser = LocalMobileDriver.class.getName();
////                break;
//        //}
//        Configuration.browserSize = null;
//        Configuration.timeout = 30000;

        if (testType == null) {
            testType = "local";
        }

        switch (testType) {
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                System.out.println("local test start");
                break;
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                System.out.println("remote test start");
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
    void afterEach() {
        String sessionId = sessionId().toString();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();

        if (testType.equals("browserstack")) {
            Attach.addVideo(sessionId);
        }

//        switch (testType) {
//            case "browserstack":
//                Attach.video(sessionId);
//                break;
//        }


    }
}
