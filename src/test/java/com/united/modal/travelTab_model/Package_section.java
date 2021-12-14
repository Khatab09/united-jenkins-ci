package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Package_section {
    @FindBy(id = "bookPackageTab")
    public WebElement packageTab_link;
    @FindBy(id = "radiofield-item-id-packageType-0")
    public WebElement flightAndHotel_radioButton;
    @FindBy(id = "radiofield-item-id-packageType-1")
    public WebElement flightAndHotelAndCar_radioButton;
    @FindBy(id = "radiofield-item-id-packageType-2")
    public WebElement flightAndCar_radioButton;
    @FindBy(id = "vacationOriginInput")
    public WebElement from_textField;
    @FindBy(id = "vacationDestinationInput")
    public WebElement leavingTo_TEXTField;
    @FindBy(xpath = "//*[@id=\"vacationOriginInput-menu-item-0\"]/button/div/span")
    public WebElement leavingFrom_dropDown;
    @FindBy(xpath = "//*[@id=\"vacationDestinationInput-menu-item-0\"]/button/div/span")
    public WebElement leavingTo_dropDown;
    @FindBy(css = "[aria-label='Departure']")
    public WebElement departDate_textField;
    @FindBy(css = "[aria-label='Return']")
    public WebElement returnDate_textField;
    @FindBy(css = "[aria-label='Tuesday, December 14, 2021']")
    public WebElement depart_date;
    @FindBy(css = "[aria-label=\"Friday, December 31, 2021\"]")
    public WebElement return_date;
    @FindBy(css = "[aria-haspopup=\"dialog\"]")
    public WebElement traveler_textField;
    @FindBy(css = "[aria-label='undefined Selected 1 room']")
    public WebElement room_textField;
    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[3]/button")
    public WebElement findTrip_button;
    @FindBy(css = "div [aria-labelledby='roomDescriptor']>li")
    public List<WebElement> room_dropDown;
    @FindBy(xpath = "//div[text()='4 rooms']")
    public WebElement room_three;
    @FindBy(css = "[data-testid=\"hotel-listing\"]>div")
    private List<WebElement> search_resultPage;
    @FindBy(css = "[aria-label=\"Substract one Adult\"]")
    public WebElement incrementTraveler;
    @FindBy(xpath = "//div[text()='4 adults, 4 rooms']")
    public WebElement resultPage_header;
    @FindBy(xpath = "//span[text()='Cruise']")
    private WebElement cruise_link;


    public WebElement getCruise_link() {
        return cruise_link;
    }

    public WebElement getResultPage_header() {
        return resultPage_header;
    }

    public WebElement getIncrementTraveler() {
        return incrementTraveler;
    }

    public List<WebElement> getSearch_resultPage() {
        return search_resultPage;
    }

    public WebElement getRoom_three() {
        return room_three;
    }

    public Package_section() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getPackageTab_link() {
        return packageTab_link;
    }

    public WebElement getFlightAndHotel_radioButton() {
        return flightAndHotel_radioButton;
    }

    public WebElement getFlightAndHotelAndCar_radioButton() {
        return flightAndHotelAndCar_radioButton;
    }

    public WebElement getFlightAndCar_radioButton() {
        return flightAndCar_radioButton;
    }

    public WebElement getFrom_textField() {
        return from_textField;
    }

    public WebElement getLeavingTo_TEXTField() {
        return leavingTo_TEXTField;
    }

    public WebElement getLeavingFrom_dropDown() {
        return leavingFrom_dropDown;
    }

    public WebElement getLeavingTo_dropDown() {
        return leavingTo_dropDown;
    }

    public WebElement getDepartDate_textField() {
        return departDate_textField;
    }

    public WebElement getReturnDate_textField() {
        return returnDate_textField;
    }

    public WebElement getDepart_date() {
        return depart_date;
    }

    public WebElement getReturn_date() {
        return return_date;
    }

    public WebElement getTraveler_textField() {
        return traveler_textField;
    }

    public WebElement getRoom_textField() {
        return room_textField;
    }

    public WebElement getFindTrip_button() {
        return findTrip_button;
    }

    public List<WebElement> getRoom_dropDown() {
        return room_dropDown;
    }
}
