package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    SearchPage searchPage = new SearchPage();

    @Test
    public void TestSearchForAProduct() {
        // Input value for search and click on search button
        searchPage.setProductInSearch("dell");
        searchPage.clickOnSearchButton();

        // Verify results are according to search value
        Assert.assertTrue(searchPage
                .getProductsLinkText()
                .toLowerCase()
                .contains("dell"));

        // Selecting an option from a drop-down list for sorting results
        searchPage.selectFilteringOption
                ("https://setec.mk/index.php?route=product/search&sort=p.price&order=DESC&search=dell");

        // Verifying results are sorted accordingly
        Assert.assertTrue(searchPage
                .getProductPriceText()
                .toLowerCase()
                .contains("59,999 ден."));

    }
    @Test
    public void testFilteringOnCheckbox() {
        // Input value for search and click on search button
        searchPage.setProductInSearch("dell");
        searchPage.clickOnSearchButton();

        // Selecting a checkbox for each filtering category
        searchPage.clickOnMemoryOptionCheckbox();
        searchPage.clickOnScreenResolutionCheckbox();
        searchPage.clickOnHardDiscCheckbox();
        searchPage.clickOnGraphicalCardCheckbox();
        searchPage.clickOnProcessorCheckbox();
        searchPage.clickOnStockStatusCheckbox();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Selecting the search result and navigating to the specification tab
        searchPage.clickOnProductResultButton();
 //       searchPage.clickOnSpecificationTab();

//        // Verifying the result is according to the filtering options selected
//        Assert.assertTrue(searchPage
//                .getScreenValueText()
//                .toLowerCase()
//                .contains( "13'' инчен"));
//
//        Assert.assertTrue(searchPage
//                .getProcessorValueText()
//                .toLowerCase()
//                .contains( "intel i7"));
//
//        Assert.assertTrue(searchPage
//                .getMemoryValueText()
//                .toLowerCase()
//                .contains( "16gb ram"));
//
//        Assert.assertTrue(searchPage
//                .getDiscValueText()
//                .toLowerCase()
//                .contains( "256gb ssd"));
//
//        Assert.assertTrue(searchPage
//                .getGraphicalCardValueText()
//                .toLowerCase()
//                .contains( "интегрирана"));
    }

}
