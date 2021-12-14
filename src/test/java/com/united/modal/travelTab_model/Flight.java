package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Flight {

    @FindBy(css = "main[role='main'] div>div>ul> li[role='tab'] h2")
    private List<WebElement> travelTab_panel;

    @FindBy(xpath = "//span[text()='Roundtrip']")
    private WebElement roundTrip_radioButton;

    @FindBy(xpath = "//span[text()='One-way']")
    private WebElement oneWay_radioButton;

    @FindBy(id = "bookFlightOriginInput")
    private WebElement from_textField;

    @FindBy(xpath = "//span[text()='New York/Newark, NJ, US (']")
    private WebElement from_dropDown;

    @FindBy(css = "[placeholder='To*']")
    private WebElement to_textField;

    @FindBy(xpath = "//span[text()='hmond, VA, US (RIC)']")
    private WebElement to_dropDown;

    @FindBy(id = "DepartDate")
    private WebElement departDate_textField;

    @FindBy(xpath = "//td[starts-with(@aria-label,'Saturday, January 15, 2022')]")
    private WebElement oneWayTrip_date;

    @FindBy(css = "[aria-label='Tuesday, February 15, 2022']")
    private WebElement depart_date;

    @FindBy(css = "[aria-label='Move backward to switch to the previous month.']")
    private WebElement moveBack_arrow;

    @FindBy(id = "passengerSelector")
    private WebElement passengerSelector_link;

    @FindBy(css = "[aria-label='Substract one Adult']")
    private WebElement AddOneMoreAdult_button;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[3]/button[2]")
    private WebElement closePanel_button;

    @FindBy(id = "#ReturnDate")
    private WebElement return_textField;

    @FindBy(css = "[aria-label='Wednesday, March 30, 2022']")
    private WebElement return_date;

    @FindBy(css = "[aria-label=\"Find flights\"]")
    private WebElement findFlight_button;

    @FindBy(id = "bookFlightTab-panel input")
    private List<WebElement> bookFlight_tabs;

    @FindBy(css = "[class=\"DateRangePicker DateRangePicker_1\"]")
    private WebElement departAndReturn;

    @FindBy(xpath = "//div/div/div/button[text()='+']")
    private List<WebElement> passengerIncrement_buttons;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/button/img")
    private WebElement bookFlight_switchingArrows;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[1]/div/button[2]")
    private WebElement closeAdvisory_leavingFrom;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[4]/div[1]/div/div/ul/li")
    private List<WebElement> flight_classes;

    @FindBy(id = "cabinType")
    private WebElement cabinType_dropdown;

    @FindBy(css = "#cabinType > div")
    private WebElement selectedCabinType;

    @FindBy(css = "button[aria-label=\"Travel with a pet. This link would take you to the advance search page in the section to select the number of pets and flights.\"]")
    private WebElement travelWith_pet;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    private WebElement selectNumber_pet;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin'] option")
    private List<WebElement> petDropDownOptions_list;

    @FindBy(xpath = "//span[text()='Advanced search']")
    private WebElement advanceSearch_link;

    @FindBy(css = "[class=\"atm-c-btn atm-c-show-hide__btn atm-c-btn--link\"]")
    private WebElement advanceSearch_result;

    @FindBy(css = "[for=\"flexibleDates\"]")
    private WebElement flexibleDates_radioButton;


    public WebElement getFlexibleDates_radioButton() {
        return flexibleDates_radioButton;
    }

    public WebElement getAdvanceSearch_result() {
        return advanceSearch_result;
    }

    public WebElement getAdvanceSearch_link() {
        return advanceSearch_link;
    }

    public WebElement getSelectNumber_pet() {
        return selectNumber_pet;
    }
    public WebElement getTravelWith_pet() {
        return travelWith_pet;
    }
    public WebElement getSelectedCabinType() {
        return selectedCabinType;
    }

    public WebElement getCabinType_dropdown() {
        return cabinType_dropdown;
    }

    public List<WebElement> getFlight_classes() {
        return flight_classes;
    }

    public WebElement getCloseAdvisory_leavingFrom() {
        return closeAdvisory_leavingFrom;
    }

    public Flight() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getBookFlight_switchingArrows() {
        return bookFlight_switchingArrows;
    }

    public List<WebElement> getPassengerIncrement_buttons() {
        return passengerIncrement_buttons;
    }

    public List<WebElement> getTravelTab_panel() {
        return travelTab_panel;
    }

    public WebElement getRoundTrip_radioButton() {
        return roundTrip_radioButton;
    }

    public WebElement getFrom_textField() {
        return from_textField;
    }

    public WebElement getTo_textField() {
        return to_textField;
    }

    public WebElement getFindFlight_button() {
        return findFlight_button;
    }

    public WebElement getFrom_dropDown() {
        return from_dropDown;
    }

    public WebElement getTo_dropDown() {
        return to_dropDown;
    }

    public WebElement getOneWay_radioButton() {
        return oneWay_radioButton;
    }

    public WebElement getDepartDate_textField() {
        return departDate_textField;
    }

    public WebElement getOneWayTrip_date() {
        return oneWayTrip_date;
    }

    public WebElement getMoveBack_arrow() {
        return moveBack_arrow;
    }

    public WebElement getDepart_date() {
        return depart_date;
    }

    public WebElement getPassengerSelector_link() {
        return passengerSelector_link;
    }

    public WebElement getAddOneMoreAdult_button() {
        return AddOneMoreAdult_button;
    }

    public WebElement getClosePanel_button() {
        return closePanel_button;
    }


    public WebElement getReturn_date() {
        return return_date;
    }

    public List<WebElement> getBookFlight_tabs() {
        return bookFlight_tabs;
    }

    public List<WebElement> getPetDropDownOptions_list() {
        return petDropDownOptions_list;
    }
}
