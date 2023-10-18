package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchTests extends TestBase{

    @ParameterizedTest(name = "[{0}]")
    @ValueSource(strings = {
            "Симпсоны в кино", "Крепкий орешек", "Мстители", "Первый мститель",
            "Токийские мстители", "Мира"
    })
    void searchMoviesTest(String value) {
        mainPage.openMyShows().searchInput(value).searchButtonClick();
        searchingResultsPage.checkMoviesListResults(value);
    }

}
