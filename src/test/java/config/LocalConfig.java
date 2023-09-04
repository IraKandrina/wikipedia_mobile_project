package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/local.properties"
})

public interface LocalConfig extends Config {
//
//    @Key("platformName")
//    @DefaultValue("android")
//    String platformName();
//
//    @Key("deviceName")
//    @DefaultValue("Samsung Galaxy S21")
//    String deviceName();
//
//    @Key("osVersion")
//    @DefaultValue("12.0")
//    String osVersion();

//    String platformName();
//
//    String osVersion();
//
//    String deviceName();
//    String appPackage();
//
//    String appActivity();
//
//    String appPath();

//    @Key("localURL")
//    String localUrl();
//
//    @Key("platformName")
//    String platformName();
//
//    @Key("deviceName")
//    String deviceName();
//
//    @Key("platformVersion")
//    String platformVersion();
//
//    @Key("appLocalURL")
//    String appLocalURL();
//
//    @Key("appPath")
//    String appPath();
//
//    @Key("appPackage")
//    String appPackage();
//
//    @Key("appActivity")
//    String appActivity();

    @Key("platformName")
    @DefaultValue("android")
    String platformName();

    @Key("deviceName")
    @DefaultValue("Samsung Galaxy S21")
    String deviceName();

    @Key("osVersion")
    @DefaultValue("12.0")
    String osVersion();
}
