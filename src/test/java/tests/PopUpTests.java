package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PopUpTests extends TestBase {

    @CsvSource({"Рик и Морти","Мстители","Чип и Дейл"})
    @ParameterizedTest(name = "Поиск по атрибуту: {0}")
    void positiveTest(String value) {
        mainPage.openMyShows().searchInput(value).searchResults(value);
    }

}
