package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class FlightStatus {
    @FindBy(xpath = "//span[text()='Flight status']")
    private WebElement flightStatus_link;
    @FindBy(id = "flightStatusOriginInput")
    private WebElement from_textField;
    @FindBy(css = "#flightStatusDestinationInput")
    private WebElement to_textField;
    @FindBy(css = "[aria-label=\"Flight number\"]")
    private WebElement flightNumber_textField;
    @FindBy(id = "datesDropdown")
    private WebElement dateDropDown_textField;
    @FindBy(xpath = "//*[@id=\"flightStatusModel\"]/div/div[6]/div/div/ul/li")
    private List<WebElement> date_DropDown;
    @FindBy(css = "button[aria-label=\"Search\"]")
    private WebElement search_button;
    @FindBy(css = "[aria-label=\"New York/Newark, NJ, US (EWR - Liberty)\"]")
    private WebElement from_dropDown;
    @FindBy(css = "[aria-label=\"Miami, FL, US (MIA - All Airports)]")
    private WebElement to_dropDown;
    @FindBy(css = "[aria-label=\"Flight Status UA 3432\"]")
    private WebElement flightStatue_result;
    @FindBy(css = "[id=\"flightStatusModel.flightNumber_aria\"]")
    private WebElement error_message;

    public WebElement getError_message() {
        return error_message;
    }

    public WebElement getFlightStatue_result() {
        return flightStatue_result;
    }

    public WebElement getFrom_dropDown() {
        return from_dropDown;
    }

    public WebElement getTo_dropDown() {
        return to_dropDown;
    }

    public FlightStatus() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getFrom_textField() {
        return from_textField;
    }

    public WebElement getTo_textField() {
        return to_textField;
    }

    public WebElement getFlightNumber_textField() {
        return flightNumber_textField;
    }

    public WebElement getDateDropDown_textField() {
        return dateDropDown_textField;
    }

    public List<WebElement> getDate_DropDown() {
        return date_DropDown;
    }

    public WebElement getSearch_button() {
        return search_button;
    }

    public WebElement getFlightStatus_link() {
        return flightStatus_link;
    }
}
