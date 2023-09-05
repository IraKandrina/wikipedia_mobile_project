package tests;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.AddLanguagePage;
import pages.SearchPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.*;

@Owner("IraKandrina")
@Epic(value = "Wikipedia mobile tests")
@Feature(value = "St.Petersburg Website")
@Story("Main page")
public class WikipediaTests extends TestBase {
    SearchPage searchPage = new SearchPage();
    AddLanguagePage addLanguagePage = new AddLanguagePage();
    @Severity(CRITICAL)
    @Test
    @DisplayName("Отображение результатов поиска")
    void searchValueTest() {
        step("Нажать на строку ввода", () -> {
            searchPage.clickSearch();
        });
        step("Ввести значение в строку поиска", () -> {
            searchPage.setSearchValue();
        });
        step("Проверить отображение результатов поиска", () -> {
            searchPage.checkResults();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Открытие статьи")
    void successfulOpenArticleTest() {
        step("Нажать на строку ввода", () -> {
            searchPage.clickSearch();
        });
        step("Ввести значение в строку поиска", () -> {
            searchPage.setSearchValue();
        });
        step("Проверить отображение результатов поиска", () -> {
            searchPage.checkResults();
        });
        step("Открыть статью", () -> {
            searchPage.selectArticle();
        });
        step("Проверить результаты", () -> {
            searchPage.checkErrorButton();
            searchPage.checkErrorText();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Выбор языка")
    void addLanguage() {
        step("Нажать на иконку меню с настройками", () -> {
            addLanguagePage.clickMenuButton();
        });
        step("Выбрать пункт меню Настройки", () -> {
            addLanguagePage.clickSettingsButton();
        });
        step("Выбрать язык", () -> {
            addLanguagePage.clickLanguageField()
                    .selectLanguage();
        });
        step("Проверить, что выбран новый язык", () -> {
            addLanguagePage.checkLanguage();
        });
    }
}
