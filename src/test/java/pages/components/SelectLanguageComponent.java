package pages.components;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SelectLanguageComponent {
    public SelectLanguageComponent selectLanguage() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Deutsch")).click();
        return this;
    }
}
