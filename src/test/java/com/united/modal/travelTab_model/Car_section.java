package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Car_section {

    @FindBy(css = "[aria-controls='bookCarTab-panel']")
    private WebElement car_tab;

    @FindBy(id = "travelTab-panel")
    private WebElement carDropDown_area;
    @FindBy(xpath = "//span[text()='Book with miles']")
    private WebElement bookWithMile_checkBox;
    @FindBy(css = "[for='showDropOffLocation']")
    private WebElement returnCarTo_sameLocation;
    @FindBy(id = "bookCarDropoffInput")
    private List<WebElement> dropDownOffLocation_area;
    @FindBy(id = "bookCarDropoffInput")
    private WebElement dropDownOffLocation;
    @FindBy(css = "[placeholder='Pickup location*']")
    private WebElement pickUp_location;
    @FindBy(id = "hideAgeBox")
    private WebElement ageChek_box;
    @FindBy(id = "driversAge")
    private List<WebElement> driverAge;
    @FindBy(css = "[aria-label='Pickup']")
    private WebElement pickUpDate_textField;
    @FindBy(css = "[aria-label='Drop off']")
    private WebElement dropOffDate_textField;
    @FindBy(id = "pickupTime")
    private WebElement pickUp_time;
    @FindBy(id = "dropoffTime")
    private WebElement dropOff_time;
    @FindBy(xpath = "(//td[starts-with(@aria-label, 'Wednesday')])[1]")
    private WebElement pickUp_date;
    @FindBy(xpath = "(//td[starts-with(@aria-label, 'Saturday')])[1]")
    private WebElement dropOff_date;
    @FindBy(css = "[aria-label='Find cars button.']")
    private WebElement findCars_button;
    @FindBy(css = "[placeholder='Age*']")
    private WebElement age_textField;
    @FindBy(xpath = "//*[@id=\"bookCarPickupInput-menu-item-0\"]/button/div/div[1]")
    private WebElement pickUpLocation_dropDown;
    @FindBy(xpath = "//*[@id=\"bookCarDropoffInput-menu-item-0\"]/button/div/div[1]")
    private WebElement dropOffLocation_dropDown;
    @FindBy(css = "[ng-show='editMode']")
    private WebElement checkForm;
    @FindBy(xpath = "//*[@id=\"ct-availability-list-no-result\"]/div/div[2]/div[1]")
    private WebElement resultUnderAge;


    public WebElement getResultUnderAge() {
        return resultUnderAge;
    }

    public WebElement getCheckForm() {
        return checkForm;
    }

    public WebElement getDropOffLocation_dropDown() {
        return dropOffLocation_dropDown;
    }

    public WebElement getPickUpLocation_dropDown() {
        return pickUpLocation_dropDown;
    }

    public WebElement getAge_textField() {
        return age_textField;
    }

    public WebElement getBookWithMile_checkBox() {
        return bookWithMile_checkBox;
    }

    public WebElement getDropDownOffLocation() {
        return dropDownOffLocation;
    }

    public WebElement getPickUp_location() {
        return pickUp_location;
    }

    public WebElement getFindCars_button() {
        return findCars_button;
    }

    public WebElement getDropOff_date() {
        return dropOff_date;
    }

    public WebElement getPickUp_Time() {
        return pickUp_time;
    }

    public WebElement getPickUp_date() {
        return pickUp_date;
    }

    public WebElement getDropOff_time() {
        return dropOff_time;
    }

    public WebElement getPickUp_time() {
        return pickUp_time;
    }

    public WebElement getDropOffDate_textField() {
        return dropOffDate_textField;
    }

    public WebElement getPickUpDate_textField() {
        return pickUpDate_textField;
    }

    public List<WebElement> getDriverAge() {
        return driverAge;
    }

    public WebElement getAgeChek_box() {
        return ageChek_box;
    }

    public List<WebElement> getDropDownOffLocation_area() {
        return dropDownOffLocation_area;
    }

    public WebElement getReturnCarTo_sameLocation() {
        return returnCarTo_sameLocation;
    }

    public WebElement getCarDropDown_area() {
        return carDropDown_area;
    }

    public WebElement getCar_tab() {
        return car_tab;
    }

    public Car_section() {
        PageFactory.initElements(driver, this);
    }
}
