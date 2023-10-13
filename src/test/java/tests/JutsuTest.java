package tests;

import com.codeborne.selenide.Configuration;
import data.ElementsAndUnClasses;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JutsuTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }


    @EnumSource(value= ElementsAndUnClasses.class)

    @ParameterizedTest
    @DisplayName("Проверка отображения типов техник в всплывающем окне 'Типы' ")
    void typeTabTest(ElementsAndUnClasses elementsAndUnClasses) {
        open("https://jut.su/");
        $(".header .top_nav").$(byText(elementsAndUnClasses.getElement())).hover();
        //$(byText(elementsAndUnClasses.getElement())).sibling(0).closest("ul").shouldHave();

        //$$x("//a[contains(text(),'"+elementsAndUnClasses.getElement()+"')]//following-sibling::ul//li")
              // .shouldHave(texts(elementsAndUnClasses.getUnClasses()));


    }


}
