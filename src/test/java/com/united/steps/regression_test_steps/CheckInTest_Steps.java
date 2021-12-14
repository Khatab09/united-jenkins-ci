package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.CheckIn;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckInTest_Steps {
    @Given("click on check in link")
    public void click_on_check_in_link() {
        CheckIn checkIn = new CheckIn();
        checkIn.getCheckIn_link().click();
        Common.waitInSecond(1);
    }
    @And("click on check in search button")
    public void click_on_check_in_search_button() {
        CheckIn checkIn = new CheckIn();
        checkIn.getCheckInSearch_button().click();
        Common.waitInSecond(1);

    }
    @Then("verify that error message is appeared")
    public void verify_that_error_message_is_appeared() {
        CheckIn checkIn = new CheckIn();
        Assert.assertTrue(checkIn.getCheckIn_error().isDisplayed());
    }

    @Then("verify that link navigate to correct page")
    public void verify_that_link_navigate_to_correct_page() {
        CheckIn checkIn = new CheckIn();
        checkIn.getCheckInAndAirport_link().click();
        Common.waitInSecond(1);
        String text = checkIn.getCheckInOption_page().getText();
        Assert.assertTrue(text.contains("Check-in options"));

    }
    @Given("click on check in with your mile")
    public void click_on_check_in_with_your_mile() {
        CheckIn checkIn = new CheckIn();
        checkIn.getCheckInWithYour_mileLink().click();
        Common.waitInSecond(2);
    }
    @Then("verify that link take you to next page")
    public void verify_that_link_take_you_to_next_page() {
        CheckIn checkIn = new CheckIn();
        boolean displayed = checkIn.getCheckInWithYourMileLink_page().isDisplayed();
        Assert.assertFalse(displayed);


    }
}
