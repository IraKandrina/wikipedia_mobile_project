package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.*;
import pages.components.MenuComponent;
import pages.components.SelectLanguageComponent;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.*;

@Owner("IraKandrina")
@Epic(value = "Wikipedia mobile tests")
@Feature(value = "Wikipedia mobile site")
@Story("Main page")
@Tag("browserstack")
public class WikipediaTestsBrowserstack extends TestBase {
    SearchPage searchPage = new SearchPage();
    ResultsPage resultsPage = new ResultsPage();
    ErrorPage errorPage = new ErrorPage();
    MenuComponent menuComponent = new MenuComponent();
    SettingsPage settingsPage = new SettingsPage();
    SelectLanguageComponent selectLanguageComponent = new SelectLanguageComponent();

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
            resultsPage.checkResults();
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
            resultsPage.checkResults();
        });
        step("Открыть статью", () -> {
            resultsPage.selectArticle();
        });
        step("Проверить результаты", () -> {
            errorPage.checkErrorButton();
            errorPage.checkErrorText();
        });
    }

    @Severity(NORMAL)
    @Test
    @DisplayName("Выбор языка")
    void addLanguage() {
        step("Нажать на иконку меню с настройками", () -> {
            searchPage.clickMenuButton();
        });
        step("Выбрать пункт меню Настройки", () -> {
            menuComponent.clickSettingsButton();
        });
        step("Открыть панель выбора языка", () -> {
            settingsPage.clickLanguageField();
        });
        step("Выбрать язык", () -> {
            selectLanguageComponent.selectLanguage();
        });
        step("Проверить, что выбран новый язык", () -> {
            settingsPage.checkLanguage();
        });
    }
}
