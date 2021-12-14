package com.united.steps.smoke_test_steps;
import com.united.pages.FlightResult_Page;
import com.united.modal.travelTab_model.Flight;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class Smoke_Tests_Steps {

      //Scenario 1
    @Given("verify app load with booking window tabs")
    public void verify_app_load_with_booking_window_tabs() {
        Common.waitInSecond(2);
        Flight flight = new Flight();
        List<WebElement> travelTab_panel = flight.getTravelTab_panel();
        int size = travelTab_panel.size();
        Common.waitInSecond(2);
        Assert.assertEquals(size,4);
    }
    //Scenario 2
    @Given("click on round trip button")
    public void click_on_round_trip_button() {
        Flight flight = new Flight();
        WebElement roundTrip_radioButton = flight.getRoundTrip_radioButton();
        roundTrip_radioButton.click();
    }

    @Then("fill up from and to text field")
    public void fill_up_from_and_to_text_field() {
        Flight flight = new Flight();
        flight.getFrom_textField().clear();
        flight.getFrom_textField().sendKeys("EWR");
        Common.highlight_element(flight.getFrom_textField());
        flight.getFrom_dropDown().click();
        flight.getTo_textField().clear();
        flight.getTo_textField().sendKeys("RIC");
        Common.highlight_element( flight.getTo_textField());
        flight.getTo_dropDown().click();
        Common.waitInSecond(2);
    }

    @And("click on find flight button")
    public void click_on_find_flight_button() {
        Flight flight = new Flight();
        Common.waitInSecond(1);
        flight.getFindFlight_button().click();
        Common.waitInSecond(1);



    }

    @Then("verify that flight is displayed")
    public void verify_that_flight_is_displayed() {
        FlightResult_Page flightResult_page = new FlightResult_Page();
       Assert.assertTrue( flightResult_page.getFlight_result().isDisplayed());
    }
    //Scenario 3
    @Given("click on one way radio button")
    public void click_on_one_way_radio_button() {
        Flight flight = new Flight();
        flight.getOneWay_radioButton().click();
    }

    @Then("click on date text field and choose date")
    public void click_on_date_text_field_and_choose_date() {
        Flight flight = new Flight();
        flight.getDepartDate_textField().clear();
        flight.getDepartDate_textField().click();
        Common.waitInSecond(1);
        flight.getMoveBack_arrow().click();
        Common.waitInSecond(1);
        flight.getOneWayTrip_date().click();
        Common.waitInSecond(1);
    }

    @Then("verify that one way flight ticket has been checked out")
    public void verify_that_one_way_flight_ticket_has_been_checked_out() {
        FlightResult_Page flightResult_page = new FlightResult_Page();
        String text = flightResult_page.getFlight_info().getText();
        Assert.assertTrue(text.contains("Jan 15, 2022"));
    }

    //scenario 4
    @Given("click on round trip radio button")
    public void click_on_round_trip_radio_button() {
        Flight flight = new Flight();
        flight.getRoundTrip_radioButton().click();
    }

    @And("click on date text field and choose date above in this scenario")
    public void click_on_date_text_field_and_choose_date_above_in_this_scenario() {
        Flight flight = new Flight();
        flight.getDepartDate_textField().clear();
         flight.getDepartDate_textField().click();
         flight.getDepart_date().click();
        flight.getReturn_date().click();
    }

    @And("click on travelers text field")
    public void click_on_travelers_text_field() {
        Flight flight = new Flight();
        flight.getPassengerSelector_link().click();
    }

    @And("click on addition twice")
    public void click_on_addition_twice() {
        Flight flight = new Flight();
        for (int i=0; i<2;i++){
            flight.getAddOneMoreAdult_button().click();
           Common.waitInSecond(1);
        }
        flight.getClosePanel_button().click();
        Common.waitInSecond(2);
    }

    @Then("verify that round trip flight has been checked out")
    public void verify_that_round_trip_flight_has_been_checked_out() {
        FlightResult_Page flightResult_page = new FlightResult_Page();
        String text = flightResult_page.getFlight_info().getText();
        Assert.assertTrue(text.contains("Feb 15, 2022"));
    }
}
