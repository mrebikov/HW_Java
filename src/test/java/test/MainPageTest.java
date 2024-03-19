package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.RtPage;

public class MainPageTest extends BaseConfig {

    @Test
    @DisplayName("Какая то проверка")
    public void testRtOpenFeedback() {
        new RtPage(driver)
                .checkElementIsDisplayed();
    }
}
