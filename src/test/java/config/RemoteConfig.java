package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:browserstack.properties"
})

public interface RemoteConfig extends Config {
    String username();
    String password();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String app();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();

    @Key("baseURL")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String baseURL();
}
