package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

import static com.united.base.Hooks.driver;

public class FlightResult_Page {
    @FindBy(xpath = "//*[@id=\"flightResults-content\"]/div[2]/div[1]/div")
    public WebElement flight_result;
    @FindBy(xpath = ("//*[@id=\"flightResults-content\"]/div[1]/div/div/div/div[1]"))
    private WebElement flight_info;


    public FlightResult_Page() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getFlight_result() {
        return flight_result;
    }

    public WebElement getFlight_info() {
        return flight_info;
    }
}
