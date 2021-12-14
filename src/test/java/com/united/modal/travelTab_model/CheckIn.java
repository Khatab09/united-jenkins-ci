package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hooks.driver;

public class CheckIn {
@FindBy(css = "[id=\"formSubmitBtn\"]")
private WebElement checkInSearch_button;
@FindBy(css = "[aria-controls=\"checkInTab-panel\"]")
private WebElement checkIn_link;
@FindBy(css = "[id=\"flightCheckInConfNumber_aria\"]")
private WebElement checkIn_error;
@FindBy(id = "check-in-opts")
private WebElement checkInOption_page;
@FindBy(xpath= "//a[text()='Check-in and Airport Processing Times']")
private WebElement CheckInAndAirport_link;
@FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[3]/button")
private WebElement checkInWithYour_mileLink;
@FindBy(xpath= "//label[text()='MileagePlus number*']")
private WebElement checkInWithYourMileLink_page;

    public WebElement getCheckInWithYourMileLink_page() {
        return checkInWithYourMileLink_page;
    }

    public WebElement getCheckInWithYour_mileLink() {
        return checkInWithYour_mileLink;
    }

    public WebElement getCheckInOption_page() {
        return checkInOption_page;
    }

    public WebElement getCheckInAndAirport_link() {
        return CheckInAndAirport_link;
    }

    public WebElement getCheckIn_error() {
        return checkIn_error;
    }

    public WebElement getCheckInSearch_button() {
        return checkInSearch_button;
    }

    public WebElement getCheckIn_link() {
        return checkIn_link;
    }

    public CheckIn() {
        PageFactory.initElements(driver,this);
    }
}
