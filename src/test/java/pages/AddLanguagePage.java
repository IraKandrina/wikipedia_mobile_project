package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddLanguagePage {
    public AddLanguagePage clickMenuButton() {
        $(AppiumBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        return this;
    }

    public AddLanguagePage clickSettingsButton() {
        $(AppiumBy.id("org.wikipedia.alpha:id/explore_overflow_settings_container")).click();
        return this;
    }

    public AddLanguagePage clickAddLanguageButton() {
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("Wikipedia languages")).click();
        //$(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
        $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).findBy(text("ADD LANGUAGE")).click();
        return this;
    }

    public AddLanguagePage selectLanguage() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("English")).click();
        return this;
    }

    public AddLanguagePage checkLanguage() {
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("English")).shouldBe(visible);
        return this;
    }
}
