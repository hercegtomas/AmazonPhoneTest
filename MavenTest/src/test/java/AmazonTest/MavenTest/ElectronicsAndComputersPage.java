package AmazonTest.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsAndComputersPage extends BasePage {

    private By phonesAndAccessoriesLink = By.linkText("Phones & Accessories");

    public ElectronicsAndComputersPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPhonesAndAccessories() {
        driver.findElement(phonesAndAccessoriesLink).click();
    }
}