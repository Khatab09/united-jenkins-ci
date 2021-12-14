package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.FlightStatus;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FlightStatusTest_steps {

    @Given("click on flight status link")
    public void click_on_flight_status_link() {
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.getFlightStatus_link().click();
        Common.waitInSecond(1);
    }
    @And("fill iup the flight status drop down")
    public void fill_iup_the_flight_status_drop_down() {
        FlightStatus flightStatus = new FlightStatus();
        Common.waitInSecond(2);
        flightStatus.getTo_textField().sendKeys("New York/Newark, NJ, US (EWR - Liberty)");
        Common.waitInSecond(2);
        flightStatus.getFlightNumber_textField().sendKeys("3432");
        Common.waitInSecond(2);




    }
    @And("click on search button")
    public void click_on_search_button() {
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.getSearch_button().click();
        Common.waitInSecond(7);
    }

    @Then("verify that search flight status take you to destinations")
    public void verify_that_search_flight_status_take_you_to_destinations() {
        FlightStatus flightStatus = new FlightStatus();
        Assert.assertTrue(flightStatus.getFlightStatue_result().isDisplayed());
    }

    @Given("And fill iup the flight status drop down other than numbers")
    public void and_fill_iup_the_flight_status_drop_down_other_than_numbers() {
        FlightStatus flightStatus = new FlightStatus();
        Common.waitInSecond(2);
        flightStatus.getTo_textField().sendKeys("New York/Newark, NJ, US (EWR - Liberty)");
        Common.waitInSecond(2);
        flightStatus.getFlightNumber_textField().sendKeys("al");
        Common.waitInSecond(2);
    }
    @Then("verify that flight number field should not accept other than numbers")
    public void verify_that_flight_number_field_should_not_accept_other_than_numbers() {
        FlightStatus flightStatus = new FlightStatus();
        String text = flightStatus.getError_message().getText();
        Assert.assertTrue(text.contains("enter a valid"));

    }

}
