package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:local.properties"
})

public interface LocalConfig extends Config {
    @Key("platformName")
    @DefaultValue("android")
    String platformName();

    @Key("deviceName")
    @DefaultValue("Google Pixel 3")
    String deviceName();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();
}
