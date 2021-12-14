package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.MyTrips;
import com.united.util.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyTripsTest_steps {


    @Given("click on my tips")
    public void click_on_my_tips() {
        MyTrips myTrips = new MyTrips();
        myTrips.getMyTrip_tab().click();
        Common.waitInSecond(1);

    }
    @Then("verify that find travel link is present")
    public void verify_that_find_travel_link_is_present() {
        MyTrips myTrips = new MyTrips();
        boolean displayed = myTrips.getFindYourTravelCredits().isDisplayed();
        System.out.println(displayed);
    }

    @Given("click on my trip search button")
    public void click_on_my_trip_search_button() {
        MyTrips myTrips = new MyTrips();
        WebElement myTripsSubmit_button = myTrips.getMyTripsSubmit_button();
        myTripsSubmit_button.click();
        Common.waitInSecond(3);
        Common.highlight_element(myTripsSubmit_button);
        Common.waitInSecond(1);
    }
    @Then("error messages it's appear")
    public void error_messages_it_s_appear() {
        MyTrips myTrips = new MyTrips();
        boolean displayed = myTrips.getErrorMessage().isDisplayed();
        Assert.assertTrue(displayed);
    }
    @Then("verify that sign in button is displayed")
    public void verify_that_sign_in_button_is_displayed() {
        MyTrips myTrips = new MyTrips();
        Assert.assertTrue( myTrips.getFindMyTrip_signInButton().isEnabled());
    }
}
