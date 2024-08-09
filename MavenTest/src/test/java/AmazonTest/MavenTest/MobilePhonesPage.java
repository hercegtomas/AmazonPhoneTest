package AmazonTest.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import org.openqa.selenium.WebElement;

public class MobilePhonesPage extends BasePage {

    private By brandFilter = By.xpath("//span[text()='Samsung']");
    private By cameraResolutionFilter = By.xpath("//span[text()='20 MP & above']");
    private By modelYearFilter = By.xpath("//span[text()='2023']");
    private By priceRangeMin = By.id("low-price");
    private By priceRangeMax = By.id("high-price");
    private By goButton = By.xpath("//input[@aria-labelledby='a-autoid-1-announce']");
    private By productList = By.cssSelector(".s-main-slot .s-result-item");

    public MobilePhonesPage(WebDriver driver) {
        super(driver);
    }

    public void applyFilters() {
        driver.findElement(brandFilter).click();
        driver.findElement(cameraResolutionFilter).click();
        driver.findElement(modelYearFilter).click();
        driver.findElement(priceRangeMin).sendKeys("50");
        driver.findElement(priceRangeMax).sendKeys("100");
        driver.findElement(goButton).click();
    }

    public List<WebElement> getSamsungPhones() {
        return driver.findElements(productList);
    }
}