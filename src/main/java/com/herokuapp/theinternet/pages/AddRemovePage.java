package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddRemovePage extends BasePageObject {
    private String url = "https://the-internet.herokuapp.com/";
    private By addElementButton = By.xpath("//button[text()='add element']");
    private By pageHeader = By.xpath("//h3[text()'Add remove elements']");


    public AddRemovePage(WebDriver driver, Logger log) {
        super(driver,log);
    }

    public void openPage(){
        log.info("opening page:" + url);
        openUrl(url);
        log.info("Page opened!");
    }
    public void verifyDriverIsAddRemovePage(){
        log.info("verifying if the driver is in add remove page");
        String expectedText = "Add/Remove Elements";
       // String actualResult = driver.findElement(pageHeader).getText();
        String actualResult = getText(pageHeader);
        Assert.assertEquals(expectedText,actualResult);
        log.info("Driver is in add remove page");
    }
    public void clickOnAddElementButton(){
        log.info("click button:" + addElementButton);
        click(addElementButton);
        log.info("clicked on button:" +addElementButton);

    }
}
