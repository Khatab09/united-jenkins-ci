package com.united.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Header_sections {
    @FindBy(id = "headerNav0")
    private WebElement header_BookTab;
    @FindBy(css = "[aria-describedby='headerNav0']")
    private WebElement header_bookTabDropDown;
    @FindBy(xpath = "//span[text()='MY TRIPS']")
    private WebElement header_myTripsTab;
    @FindBy(id = "headerNav1-panel")
    private WebElement header_myTripDropDown;
    @FindBy(xpath = "//span[text()='TRAVEL INFO']")
    private WebElement header_travelInfo;
    @FindBy(css = "[role=\"dialog\"]")
    private WebElement header_travelInfoDropDown;
    @FindBy(xpath = "//span[text()='MILEAGEPLUS® PROGRAM']")
    private WebElement header_mileagPlusProgram;
    @FindBy(xpath = "//*[@id=\"headerNav3-panel\"]/div")
    private WebElement header_mileagpulsDropDown;
    @FindBy(xpath = "//span[text()='DEALS']")
    private WebElement header_deal;
    @FindBy(xpath = "//*[@id=\"headerNav4-panel\"]/div")
    private WebElement header_dealLinkDropDown;
    @FindBy(xpath = "//span[text()='HELP']")
    private WebElement header_helpLink;
    @FindBy(xpath = "//*[@id=\"headerNav5-panel\"]/div")
    private WebElement header_helpLinkDropDown;
    @FindBy(css= "div>span a")
    private List<WebElement> advisoryLink_topOfHeader;


    public Header_sections() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderBook_tab() {
        return header_BookTab;
    }

    public WebElement getHeader_bookTabDropDown() {
        return header_bookTabDropDown;
    }

    public WebElement getHeader_myTripsTab() {
        return header_myTripsTab;
    }

    public WebElement getHeader_myTripDropDown() {
        return header_myTripDropDown;
    }

    public WebElement getHeader_travelInfo() {
        return header_travelInfo;
    }

    public WebElement getHeader_travelInfoDropDown() {
        return header_travelInfoDropDown;
    }


    public WebElement getHeader_mileagPlusProgram() {
        return header_mileagPlusProgram;
    }

    public WebElement getHeader_mileagpulsDropDown() {
        return header_mileagpulsDropDown;
    }

    public WebElement getHeader_deal() {
        return header_deal;
    }

    public WebElement getHeader_dealLinkDropDown() {
        return header_dealLinkDropDown;
    }

    public WebElement getHeader_helpLink() {
        return header_helpLink;
    }

    public WebElement getHeader_helpLinkDropDown() {
        return header_helpLinkDropDown;
    }

    public List<WebElement> getAdvisoryLink_topOfHeader() {
        return advisoryLink_topOfHeader;
    }
}
