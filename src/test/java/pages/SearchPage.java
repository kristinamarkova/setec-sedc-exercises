package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;

public class SearchPage extends BaseTest {

    // Search page objects
    By searchInput = By.id("search_query");
    By searchButton = By.xpath("//*[@id=\"header-right\"]/div[1]/div[1]");

    // Product search results page objects
    By searchedProductsLinkText = By.xpath("//*[@id=\"mora_da_ima_prazno_mesto\"]/a");
    By filterByDropDownList = By.xpath
            ("//*[@id=\"mfilter-content-container\"]/div[1]/div[2]/div[1]/div/select");
    By priceOfProductText = By.xpath
            ("//*[@id=\"mfilter-content-container\"]/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]/span[2]");
    By secondMemoryCheckbox = By.id("mfilter-opts-attribs-34-79-08d0b9b13dcaba40ea0b159aa781239c"); // 16gb RAM option
    By screenResolutionCheckbox = By.id("mfilter-opts-attribs-34-77-5dfc0eff1844d4f0a1b74104c0834306"); // 13 inch option option
    By hardDiscCheckbox = By.id("mfilter-opts-attribs-34-85-dedd59852498c13e91e3d9d71b6614c1"); // 256 GB SSD option
    By graphicalCardCheckbox = By.id("mfilter-opts-attribs-34-86-d2191d7694a2406f7289c4f03bbf59ce"); // Integrated graphical car option
    By processorCheckbox = By.id("mfilter-opts-attribs-34-78-48b372dabca04eda5ee3aef504ddb684"); // Intel i7 option
    By stockStatusCheckbox = By.id("mfilter-opts-attribs-34-stock_status-5"); // In stock option
    By filteredResultContainer = By.xpath("//*[@id=\"mfilter-content-container\"]/div[2]/div/div/div/div[1]/div[2]/a/img");
    By specificationButton = By.xpath("//*[@id=\"tabs\"]/a[2]/text()");
    By screenValueText = By.xpath("//*[@id=\"tab-attribute\"]/table/tbody/tr[1]/td[2]");
    By processorValueText = By.xpath("//*[@id=\"tab-attribute\"]/table/tbody/tr[2]/td[2]");
    By memoryValueText = By.xpath("//*[@id=\"tab-attribute\"]/table/tbody/tr[3]/td[2]");
    By discValueText = By.xpath("//*[@id=\"tab-attribute\"]/table/tbody/tr[4]/td[2]");
    By graphicalCardValueText = By.xpath("//*[@id=\"tab-attribute\"]/table/tbody/tr[5]/td[2]");



    public void setProductInSearch (String product) {
        // Input data in the search input field
        driver.findElement(searchInput).sendKeys(product);
    }

    public void clickOnSearchButton () {
        // Clicking on the search button, in order to perform search
        driver.findElement(searchButton).click();
    }

    public String getProductsLinkText() {
        return driver.findElement(searchedProductsLinkText).getText();
    }

    public void selectFilteringOption(String filteringOption) {
        Select filterByDropDownList = new Select(driver.findElement(By.xpath
                ("//*[@id=\"mfilter-content-container\"]/div[1]/div[2]/div[1]/div/select")));
        filterByDropDownList.selectByValue(filteringOption);
    }

    public String getProductPriceText () {
        return driver.findElement(priceOfProductText).getText();
    }

    // Clicking on checkboxes for filtering results and navigating to result's specification
    public void clickOnMemoryOptionCheckbox() {
        driver.findElement(secondMemoryCheckbox).click();
    }

    public void clickOnScreenResolutionCheckbox() {
        driver.findElement(screenResolutionCheckbox).click();
    }

    public void clickOnHardDiscCheckbox() {
        driver.findElement(hardDiscCheckbox).click();
    }

    public void clickOnGraphicalCardCheckbox() {
        driver.findElement(graphicalCardCheckbox).click();
    }

    public void clickOnProcessorCheckbox() {
        driver.findElement(processorCheckbox).click();
    }

    public void clickOnStockStatusCheckbox() {
        driver.findElement(stockStatusCheckbox).click();
    }

    public void clickOnProductResultButton() {
        driver.findElement(searchedProductsLinkText).click();
    }

    public void clickOnSpecificationTab() {
        driver.findElement(specificationButton).click();
    }

    // Verifying the specification we selected is displayed
    public String getScreenValueText () {
        return driver.findElement(screenValueText).getText();
    }

    public String getProcessorValueText () {
        return driver.findElement(processorValueText).getText();
    }

    public String getMemoryValueText () {
        return driver.findElement(memoryValueText).getText();
    }

    public String getDiscValueText () {
        return driver.findElement(discValueText).getText();
    }

    public String getGraphicalCardValueText () {
        return driver.findElement(graphicalCardValueText).getText();
    }



}
