package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class MainPage {

    SelenideElement
            loginHeader = $(".Login-header"),
            loginIcon = $(".Login-user .Icon"),
            loginInput = $(".login-form__login"),
            titleMain = $(".title__main"),
            searchInput = $(".Search-input"),
            searchResults = $(".search-results--search"),
            searchButton = $(".Search-submit"),
            passwordInput = $(".login-form__password");

    ElementsCollection
            titlesHome = $$(".Container .vue-horizontal .NewsItem__pic-wrapper"),
            episodeItem = $$(".Home-section .Grid-in");

    public MainPage openMyShows() {
        open("");
        episodeItem.get(7).shouldHave(visible, ofSeconds(5));
        loginIcon.shouldHave(visible, ofSeconds(25));
        titlesHome.get(1).shouldHave(visible, ofSeconds(25));
        return this;
    }

    public MainPage setLoginPassword(String login, String password) {
        loginInput.setValue(login);
        passwordInput.setValue(password).pressEnter();
        return this;
    }

    public MainPage clickLoginHeader() {
        loginHeader.shouldHave(visible).hover().click();
        return this;
    }

    public MainPage checkTitle(String value) {
        titleMain.shouldHave(text(value));
        return this;
    }

    public MainPage searchInput(String value) {
        searchInput.click();
        searchInput.setValue(value);
        return this;
    }

    public MainPage searchButtonClick() {
        searchButton.hover().click();
        return this;
    }

    public MainPage searchResults(String value) {
        searchResults.shouldHave(text(value));
        return this;
    }

}
