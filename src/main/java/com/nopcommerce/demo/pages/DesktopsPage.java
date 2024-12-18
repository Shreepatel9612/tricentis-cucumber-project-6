package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']/a")
    List<WebElement> productTitleList;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        Reporter.log("Get pageTitle text " + pageTitle.getText() + "<br>");
        log.info("Get pageTitle text " + pageTitle.getText());
        return message;
    }

    public void selectSortBy(String position) {
        selectByVisibleTextFromDropDown(sortBy, position);
        Reporter.log("Sort by '" + position + "' position <br>");
        log.info("Sort by '" + position + "' position");
    }

    public void selectDisplayPerPage(String number) {
        selectByVisibleTextFromDropDown(display, number);
        log.info("Display product '" + number + "' per page");
    }

    public void selectProduct(String productName) {
        for (WebElement product : productTitleList) {
            if (product.getText().equals(productName)) {
                Reporter.log("Click on product '" + productName + "' : " + product.getText() + "<br>");
                log.info("Click on product '" + productName + "' : " + product.getText());
                clickOnElement(product);
                break;
            }
        }
    }

}
