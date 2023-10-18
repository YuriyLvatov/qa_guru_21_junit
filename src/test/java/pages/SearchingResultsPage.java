package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static java.time.Duration.ofSeconds;

public class SearchingResultsPage {
    ElementsCollection
            resultList = $$("[data-tid=result]"),
            resultMoviesList = $$(".title__secondary");
    public SearchingResultsPage checkMoviesListResults(String value){
        resultMoviesList.get(1).shouldHave(visible, ofSeconds(5));
        resultMoviesList.get(1).click();
        resultList.shouldHave(texts(value));
        return this;
    }
}
