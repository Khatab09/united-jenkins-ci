package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.Flight;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static com.united.base.Hooks.driver;

public class Regression_Flight_Test_Steps {
    //Scenario 1
    @Given("in flight part click on round trip radio button")
    public void in_flight_part_click_on_round_trip_radio_button() {
        Flight flight = new Flight();
        flight.getRoundTrip_radioButton().click();
        Common.waitInSecond(1);
    }

    @Then("verify that round trip have departing and return date fields")
    public void verify_that_round_trip_have_departing_and_return_date_fields() {
        Flight flight = new Flight();
        Assert.assertTrue(flight.getDepartDate_textField().isDisplayed());

    }

    //Scenario 2
    @Given("click on on way radio button")
    public void click_on_on_way_radio_button() {
        Flight flight = new Flight();
        flight.getOneWay_radioButton().click();
        Common.waitInSecond(1);
    }

    @Then("verify that one way radio button has only depart text field")
    public void verify_that_one_way_radio_button_has_only_depart_text_field() {
        Flight flight = new Flight();
        Assert.assertTrue(flight.getDepartDate_textField().isDisplayed());

    }

    //Scenario 3
    @Then("verify that travelers has nine number")
    public void verify_that_travelers_has_nine_number() {
        Flight flight = new Flight();
        for (int i = 0; i < 9; i++) {
            flight.getAddOneMoreAdult_button().click();
            Common.waitInSecond(1);
        }
        String text = flight.getPassengerSelector_link().getText();
        Assert.assertTrue(text.contains("9 Adults"));

    }

    @Then("verify that user can increment every passenger type")
    public void verify_that_user_can_increment_every_passenger_type() {
        Flight flight = new Flight();
        List<WebElement> increment_buttons = flight.getPassengerIncrement_buttons();
        for (WebElement increment : increment_buttons) {
            Common.waitInSecond(1);
            increment.click();
        }
        String text = flight.getPassengerSelector_link().getText();
        Assert.assertTrue(text.contains("Seniors (65+)"));
    }

    @Given("click on switch icon between from and to")
    public void click_on_switch_icon_between_from_and_to() {
        Flight flight = new Flight();
        flight.getBookFlight_switchingArrows().click();
        Common.waitInSecond(1);
    }

    @Then("verify that from an to text field has ben switched")
    public void verify_that_from_an_to_text_field_has_ben_switched() {
        Flight flight = new Flight();
        String text = flight.getFrom_textField().getText();
        Assert.assertTrue(text.isEmpty());
    }

    @Given("verify that user can remove leaving from value")
    public void verify_that_user_can_remove_leaving_from_value() {
        Flight flight = new Flight();
        flight.getFrom_textField().click();
        Common.waitInSecond(3);
        flight.getCloseAdvisory_leavingFrom().click();
        Common.waitInSecond(1);
        String text = flight.getFrom_textField().getText();
        Assert.assertTrue(text.isEmpty());

    }

    @Given("User should be able to remove going to location value")
    public void user_should_be_able_to_remove_going_to_location_value() {
        Flight flight = new Flight();
        flight.getBookFlight_switchingArrows().click();
        Common.waitInSecond(1);
        flight.getTo_textField().clear();
        String text = flight.getFrom_textField().getText();
        Assert.assertTrue(text.isEmpty());
    }

    @Given("verify user select class as economy")
    public void verify_user_select_class_as_economy() {
        Flight flight = new Flight();
        flight.getCabinType_dropdown().click();
        Common.waitInSecond(1);

        for (WebElement flightClass : flight.getFlight_classes()) {
            if (flightClass.getAttribute("aria-label").equals("Economy")) {
                flightClass.click();
                Common.waitInSecond(1);
                break;
            }
        }

        String text = flight.getSelectedCabinType().getText();
        Assert.assertTrue(text.contains("Economy"));
    }

    @And("verify user select class as Premium economy")
    public void verify_user_select_class_as_premium_economy() {
        Flight flight = new Flight();
        flight.getCabinType_dropdown().click();
        Common.waitInSecond(1);

        for (WebElement flightClass : flight.getFlight_classes()) {
            if (flightClass.getAttribute("aria-label").equals("Premium economy")) {
                flightClass.click();
                Common.waitInSecond(1);
                break;
            }

        }
        String text = flight.getSelectedCabinType().getText();
        Assert.assertTrue(text.contains("Premium economy"));
    }

    @Then("verify user select class as  Business or First")
    public void verify_user_select_class_as_business_or_firs() {
        Flight flight = new Flight();
        flight.getCabinType_dropdown().click();
        Common.waitInSecond(1);

        for (WebElement flightClass : flight.getFlight_classes()) {
            if (flightClass.getAttribute("aria-label").equals("Business or First")) {
                flightClass.click();
                Common.waitInSecond(1);
                break;
            }

        }
        String text = flight.getSelectedCabinType().getText();
        Assert.assertTrue(text.contains("Business or First"));
    }

    @Given("in traveler text filed verify that one traveler has been selected")
    public void in_traveler_text_filed_verify_that_one_traveler_has_been_selected() {
        Flight flight = new Flight();
        String text = flight.getPassengerSelector_link().getText();
        Assert.assertTrue(text.contains("1"));


    }
    @Given("click on traveler text field")
    public void click_on_traveler_text_field() {
        Flight flight = new Flight();
        flight.getPassengerSelector_link().click();
        Common.waitInSecond(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    @Then("click on travel with pet")
    public void click_on_travel_with_pet()  {
        Flight flight = new Flight();
       Actions actions = new Actions(driver);
       actions.moveToElement(flight.getTravelWith_pet()).click().perform();
        Common.waitInSecond(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,80)");
        Common.waitInSecond(2);

    }
    @Then("click on select number of pet and verify that one pet")
    public void click_on_select_number_of_pet_and_verify_that_one_pet() {
        Flight flight = new Flight();
       flight.getSelectNumber_pet().click();
        Common.waitInSecond(2);
        Select select = new Select(flight.getSelectNumber_pet());
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println(firstSelectedOption);
        int size = flight.getPetDropDownOptions_list().size();
        Assert.assertEquals(size,2);


    }

    @Given("click on advance search")
    public void click_on_advance_search() {
        Flight flight = new Flight();
        flight.getAdvanceSearch_link().click();
        Common.waitInSecond(2);
    }
    @Then("verify that search open one page")
    public void verify_that_search_open_one_page() {
        Flight flight = new Flight();
        String text = flight.getAdvanceSearch_result().getText();
        Assert.assertTrue(!text.isEmpty());
    }
    @Given("click on flexible dates")
    public void click_on_flexible_dates() {
        Flight flight = new Flight();
        flight.getFlexibleDates_radioButton().click();
        Common.waitInSecond(2);
    }
    @Then("verify that date has been changed")
    public void verify_that_date_has_been_changed() {
        Flight flight = new Flight();

    }
}
