package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ResultsPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;

@Owner("IraKandrina")
@Epic(value = "Wikipedia mobile tests")
@Feature(value = "Wikipedia mobile site")
@Story("Main page")
@Tag("local")
public class WikipediaTestsLocal extends TestBase {
    SearchPage searchPage = new SearchPage();
    ResultsPage resultsPage = new ResultsPage();

    @Severity(CRITICAL)
    @Test
    @DisplayName("Отображение результатов поиска")
    void searchValueTest() {
        step("Нажать кнопку назад", () -> {
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
