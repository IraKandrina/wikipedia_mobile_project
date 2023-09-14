package pages;

import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {
    public ResultsPage checkResults() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        return this;
    }

    public ResultsPage selectArticle() {
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description")).first().click();
        return this;
    }

    public ResultsPage checkArticleIsVisible() {
        $(AppiumBy.id("org.wikipedia.alpha:id/page_web_view")).shouldBe(visible);
        return this;
    }
}
