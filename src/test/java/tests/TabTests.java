package tests;

import data.TabsPagesData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class TabTests extends TestBase {

    @ParameterizedTest
    @EnumSource(value = TabsPagesData.class)
    void tabsTests(TabsPagesData tabsPages) {
        mainPage.openMyShows();
        headerComponent.clickHeaderMenu(tabsPages.getCategory());
        mainPage.checkTitle(tabsPages.getTittle());
    }

}
