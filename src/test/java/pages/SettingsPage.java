package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SettingsPage {
    public SettingsPage clickLanguageField() {
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Wikipedia language")).click();
        return this;
    }

    public SettingsPage checkLanguage() {
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Deutsch")).shouldBe(visible);
        return this;
    }
}
