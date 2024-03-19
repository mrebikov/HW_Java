package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.RtPage;

public class MainPageTest extends BaseConfig {

    @Test
    @DisplayName("Тест 1")
    public void testRtOpenFeedback() {
        new RtPage(driver)
                .checkElementIsDisplayed();
        new RtPage(driver)
                .checkElementIsDisplayed();
        new RtPage(driver)
                .checkElementIsDisplayed();
        new RtPage(driver)
                .checkElementIsDisplayed();
    }
}
