package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    public SearchPage clickSearch() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        return this;
    }

    public SearchPage setSearchValue(String value) {
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys(value);
        return this;
    }

    public SearchPage checkResults() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchPage selectArticle() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/search_container")).first().click();
        return this;
    }

    public SearchPage checkErrorButton() {
        $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_button")).shouldBe(visible);
        return this;
    }

    public SearchPage checkErrorText() {
        $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldHave(text("An error occurred"));
        return this;
    }
}
