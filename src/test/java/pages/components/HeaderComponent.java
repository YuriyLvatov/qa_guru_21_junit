package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {


        SelenideElement
                loginError = $(".Login-error"),
                headerMenu = $(".Header-left"),
                loginHeader = $(".Login-header");

        public void checkHeaderLogin(String login) {
            loginHeader.shouldHave(text(login));
        }

        public void loginError(String errorText) {
            loginError.shouldHave(text(errorText));
        }


        public void clickHeaderMenu(String value) {
            headerMenu.$(byText(value)).click();
        }

    }

