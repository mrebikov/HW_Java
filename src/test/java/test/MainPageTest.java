package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.RtPage;

public class MainPageTest extends BaseConfig {

    @Test
    @DisplayName("Какая")
    public void testRtOpenFeedback() {
        new RtPage(driver)
                .checkElementIsDisplayed();
    }

    public void test() {}

    public void test1() {}

}
