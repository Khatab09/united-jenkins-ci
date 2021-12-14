package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Hotel {
    @FindBy(id = "bookHotelTab")
    private WebElement bookHotelTab;
    @FindBy(id = "bookHotelTab-panel")
    private WebElement bookHotelTab_panel;
    @FindBy(css = "[name=\"roomsDropdown\"]")
    private WebElement numberOfRoom_textField;
    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[2]/div[1]/div/div/ul/li")
    private List<WebElement> numberOfRoom_dropDown;
    @FindBy(id = "travelTab-panel")
    private WebElement hotelDropDown_area;
    @FindBy(css = "[aria-label=\"plus\"]")
    private List<WebElement> increment_button;
    @FindBy(css = "[aria-labelledby='bookHotelModel.passengersLabel']")
    private WebElement numberOF_travelers;
    @FindBy(css = "[aria-owns='bookHotelInput-menu']")
    private WebElement goingTo_textFiled;
    @FindBy(css = "[name='bookHotelCheckinDate']")
    private WebElement checkIn_textField;
    @FindBy(css = "[name='bookHotelCheckoutDate']")
    private WebElement checkOut_textField;
    @FindBy(css = "[aria-label='Tuesday, December 14, 2021']")
    private WebElement checkIn_date;
    @FindBy(css = "[aria-label='Tuesday, January 11, 2022']")
    private WebElement checkOut_date;
    @FindBy(css = "[aria-label='Find hotels button.']")
    private WebElement findHotel_button;
    @FindBy(css = "//*[@id=\"listings\"]/ol/li[1]/article/section/div")
    private WebElement hotelsSearch_result;

    public WebElement getHotelsSearch_result() {
        return hotelsSearch_result;
    }

    public WebElement getFindHotel_button() {
        return findHotel_button;
    }

    public WebElement getCheckOut_date() {
        return checkOut_date;
    }

    public WebElement getCheckIn_date() {
        return checkIn_date;
    }

    public WebElement getCheckOut_textField() {
        return checkOut_textField;
    }

    public WebElement getCheckIn_textField() {
        return checkIn_textField;
    }

    public WebElement getGoingTo_textFiled() {
        return goingTo_textFiled;
    }

    public WebElement getNumberOF_travelers() {
        return numberOF_travelers;
    }

    public List<WebElement> getIncrement_button() {
        return increment_button;
    }

    public WebElement getHotelDropDown_area() {
        return hotelDropDown_area;
    }

    public WebElement getNumberOfRoom_textField() {
        return numberOfRoom_textField;
    }

    public List<WebElement> getNumberOfRoom_dropDown() {
        return numberOfRoom_dropDown;
    }

    public Hotel() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getBookHotelTab_panel() {
        return bookHotelTab_panel;
    }

    public WebElement getBookHotelTab() {
        return bookHotelTab;
    }
}
