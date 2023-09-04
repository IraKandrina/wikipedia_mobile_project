package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/remote.properties"
})

public interface RemoteConfig extends Config {
//    @Key("username")
//    String username();
//
//    @Key("password")
//    String password();
//
//    @Key("app")
//    @DefaultValue("bs://sample.app")
//    String app();
//
//    @Key("device")
//    @DefaultValue("Google Pixel 3")
//    String device();
//
//    @Key("osVersion")
//    @DefaultValue("9.0")
//    String osVersion();

//    @Key("baseURL")
//    @DefaultValue("http://hub.browserstack.com/wd/hub")
//    String baseURL();

//    @Key("urlRemoteWebDriver")
//    @DefaultValue("http://hub.browserstack.com/wd/hub")
//    String getUrlRemoteWebDriver();

//    String username();
//
//    String password();
//
//    String app();
//
//    String device();
//
//    String osVersion();

//    @Key("login")
//    String login();
//
//    @Key("password")
//    String password();
//
//    @Key("baseURL")
//    String baseUrl();
//
//    @Key("appURL")
//    String appUrl();
//
//    @Key("device")
//    String device();
//
//    @Key("os_version")
//    String osVersion();
//
//    @Key("project")
//    String projectName();
//
//    @Key("build")
//    String buildName();
//
//    @Key("name")
//    String testName();

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("app")
    @DefaultValue("bs://b3a8c2e8fd6c9705ba6c622b7db55ac194c0e36b")
    String getApp();

    @Key("deviceName")
    @DefaultValue("Google Pixel 5")
    String getDeviceName();

    @Key("version")
    @DefaultValue("12.0")
    String getVersion();

    @Key("baseURL")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getRemoteWebDriver();

}
