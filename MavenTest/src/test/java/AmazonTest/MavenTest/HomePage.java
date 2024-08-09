package AmazonTest.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By electronicsAndComputersLink = By.linkText("Electronics & Computers");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnElectronicsAndComputers() {
        driver.findElement(electronicsAndComputersLink).click();
    }
}