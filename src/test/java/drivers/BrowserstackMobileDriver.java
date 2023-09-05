package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.RemoteConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    static RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());

//    public static URL getBrowserstackUrl() {
//        try {
//            return new URL(config.getRemoteWebDriver());
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    @Nonnull
//    @Override
//    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
//        MutableCapabilities mutableCapabilities = new MutableCapabilities();
//        mutableCapabilities.merge(capabilities);
//
//        // Set your access credentials
//        mutableCapabilities.setCapability("browserstack.user", config.username());
//        mutableCapabilities.setCapability("browserstack.key", config.password());
//
//        mutableCapabilities.setCapability("app", config.getApp());
//        // Specify device and os_version for testing
//        mutableCapabilities.setCapability("device", config.getDeviceName());
//        mutableCapabilities.setCapability("os_version", config.getVersion());
//
//        // Set other BrowserStack capabilities
//        mutableCapabilities.setCapability("project", "BrowserStack Sample");
//        mutableCapabilities.setCapability("build", "browserstack-build-1");
//        mutableCapabilities.setCapability("name", "first_test");
//
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        try {
//            return new RemoteWebDriver(
//                    new URL(config.getRemoteWebDriver()), mutableCapabilities);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

//
//    @SneakyThrows
//    @Override
//    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
//
//        MutableCapabilities mutableCapabilities = new MutableCapabilities();
//        mutableCapabilities.merge(capabilities);
//
//        mutableCapabilities.setCapability("browserstack.user", config.login());
//        mutableCapabilities.setCapability("browserstack.key", config.password());
//
//        mutableCapabilities.setCapability("app", config.appUrl());
//
//        mutableCapabilities.setCapability("device", config.device());
//        mutableCapabilities.setCapability("os_version", config.osVersion());
//
//        mutableCapabilities.setCapability("project", config.projectName());
//        mutableCapabilities.setCapability("build", config.buildName());
//        mutableCapabilities.setCapability("name", config.testName());
//
//        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
//    }
//
//    public static URL getBrowserstackUrl() {
//        try {
//            return new URL(config.baseUrl());
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", config.getUser());
        mutableCapabilities.setCapability("browserstack.key", config.getKey());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", config.getApp());

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", config.getDevice());
        mutableCapabilities.setCapability("os_version", config.getOsVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", config.getProject());
        mutableCapabilities.setCapability("build", config.getBuild());
        mutableCapabilities.setCapability("name", config.getName());


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL(config.getUrlRemoteWebDriver()), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
