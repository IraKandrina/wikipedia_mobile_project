package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ErrorPage;
import pages.ResultsPage;
import pages.SearchPage;
import pages.SettingsPage;
import pages.components.MenuComponent;
import pages.components.SelectLanguageComponent;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("IraKandrina")
@Epic(value = "Wikipedia mobile tests")
@Feature(value = "Wikipedia mobile site")
@Story("Main page")
@Tag("local")
public class WikipediaTestsLocal extends TestBase {
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
        step("Пропустить шаги", () -> {
            back();
        });
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



}
