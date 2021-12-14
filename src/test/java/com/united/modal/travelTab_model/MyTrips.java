package com.united.modal.travelTab_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.IDataProviderAnnotation;

import static com.united.base.Hooks.driver;

public class MyTrips {
  @FindBy(id = "tripsTab")
  private WebElement myTrip_tab;
  @FindBy(css = "[aria-label='Find your travel credits']")
  private WebElement FindYourTravelCredits;
  @FindBy(id = "myTripsSubmitBtn")
  private WebElement myTripsSubmit_button;
  @FindBy(id = "myTripsLastName_aria")
  private WebElement errorMessage;
  @FindBy(css = "[aria-label=\"Looking for past or canceled flights?\"]")
  private WebElement findMyTrip_signInButton;


    public WebElement getFindMyTrip_signInButton() {
        return findMyTrip_signInButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getMyTripsSubmit_button() {
        return myTripsSubmit_button;
    }

    public WebElement getMyTrip_tab() {
        return myTrip_tab;
    }

    public WebElement getFindYourTravelCredits() {
        return FindYourTravelCredits;
    }

    public MyTrips() {
        PageFactory.initElements(driver,this);
    }
}
