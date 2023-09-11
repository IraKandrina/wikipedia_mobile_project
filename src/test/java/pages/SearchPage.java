package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SearchPage clickSearch() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        return this;
    }

    public SearchPage setSearchValue() {
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("HTML");
        return this;
    }

    public SearchPage clickMenuButton() {
        $(AppiumBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        return this;
    }
}
