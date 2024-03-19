package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.AbsPageObject;

public class RtPage extends AbsPageObject {
    public String rtkLogo = "body > div.main-wrapper > div > div > header > div.header__inner.main-navigation > div.header__p-top > div > div.header__p-top-menu > div.header__logo > div > a";
    public String forMeButton = "#block-b2bverkhneemenyusegmentovnovoe > div > div > div > div > div.rtk-links__list > a:nth-child(1) > span.rtk-links__item-title";
    public String forBusinessButton = "#block-b2bverkhneemenyusegmentovnovoe > div > div > div > div > div.rtk-links__list > a.rtk-links__item.is--active > span.rtk-links__item-title";
    public String exitButton = "#short-name-block-id > button > span";


    public RtPage(WebDriver driver) {
        super(driver);
    }

    public void checkElementIsDisplayed() {
        driver.findElement(By.cssSelector(rtkLogo)).isDisplayed();
        driver.findElement(By.cssSelector(forMeButton)).isDisplayed();
        driver.findElement(By.cssSelector(forBusinessButton)).isDisplayed();
        driver.findElement(By.cssSelector(exitButton)).isDisplayed();
    }
}
