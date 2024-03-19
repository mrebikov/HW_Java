package test;

import driver.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class BaseConfig {
    public WebDriver driver;

    @BeforeAll
    public static void launchDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        this.driver = new DriverFactory().setUp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://msk.rt.ru/b2b");
    }

    @AfterEach
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
