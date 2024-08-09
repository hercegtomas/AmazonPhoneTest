package AmazonTest.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhonesAndAccessoriesPage extends BasePage {

    private By mobilePhonesLink = By.linkText("Mobile Phones");

    public PhonesAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMobilePhones() {
        driver.findElement(mobilePhonesLink).click();
    }
}