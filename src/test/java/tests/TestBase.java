package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.MainPage;
import pages.SearchingResultsPage;
import pages.components.HeaderComponent;

public class TestBase {

    HeaderComponent headerComponent = new HeaderComponent();
    MainPage mainPage = new MainPage();
    SearchingResultsPage searchingResultsPage = new SearchingResultsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://myshows.me/";
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }

}
