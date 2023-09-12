package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {
    public SearchPage clickSearch() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        return this;
    }

    public SearchPage setSearchValue() {
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("HTML");
        return this;
    }

    public SearchPage clickMenuButton() {
        $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        return this;
    }
}
