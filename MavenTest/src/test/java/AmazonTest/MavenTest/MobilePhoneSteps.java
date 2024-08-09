package AmazonTest.MavenTest;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import AmazonTest.*;

import java.util.List;

public class MobilePhoneSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ElectronicsAndComputersPage electronicsPage = new ElectronicsAndComputersPage(driver);
    PhonesAndAccessoriesPage phonesPage = new PhonesAndAccessoriesPage(driver);
    MobilePhonesPage mobilePhonesPage = new MobilePhonesPage(driver);

    @Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        driver.get("https://www.amazon.co.uk");
    }

    @When("I navigate to Mobile Phones section")
    public void i_navigate_to_mobile_phones_section() {
        homePage.clickOnElectronicsAndComputers();
        electronicsPage.clickOnPhonesAndAccessories();
        phonesPage.clickOnMobilePhones();
    }

    @And("I apply filters for Samsung phones with Camera Resolution 20 MP and above, Model Year 2023, and Price Range £50 - £100")
    public void i_apply_filters() {
        mobilePhonesPage.applyFilters();
    }

    @Then("I should see a list of Samsung phones matching the criteria")
    public void i_should_see_a_list_of_samsung_phones() {
        List<WebElement> phones = mobilePhonesPage.getSamsungPhones();
        Assert.assertTrue("No Samsung phones found with the given criteria.", phones.size() > 0);
    }
}