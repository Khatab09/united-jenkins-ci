package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.Hotel;
import com.united.util.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Hotel_Tests_steps {

    @Given("click on hotel link")
    public void click_on_hotel_link() {
        Hotel hotel = new Hotel();
         hotel.getBookHotelTab().click();
        Common.waitInSecond(1);

    }
    @Then("verify that all field are their")
    public void verify_that_all_field_are_their() {
        Hotel hotel = new Hotel();
        Assert.assertTrue( hotel.getBookHotelTab_panel().isDisplayed());
    }

    @Given("click on number of room text filed")
    public void click_on_number_of_room_text_filed() {
        Hotel hotel = new Hotel();
        hotel.getNumberOfRoom_textField().click();
        Common.waitInSecond(1);
    }
    @Then("verify that one room and one traveler they selected by defult")
    public void verify_that_one_room_and_one_traveler_they_selected_by_defult() {
        Hotel hotel = new Hotel();
        String text = hotel.getHotelDropDown_area().getText();
        Assert.assertTrue(text.contains("1 adult"));
        Assert.assertTrue(text.contains("1 room"));
    }

    @Then("verify that uer have maximum 8 rooms")
    public void verify_that_uer_have_maximum_8_rooms() {
        Hotel hotel = new Hotel();
        List<WebElement> numberOfRoom_dropDown = hotel.getNumberOfRoom_dropDown();
        for (WebElement room:numberOfRoom_dropDown){
            if (room.getAttribute("aria-label").equals("8 rooms")) {
                room.click();
                Common.waitInSecond(1);
                break;
            }
        }
        String text = hotel.getNumberOfRoom_textField().getText();
        Assert.assertTrue(text.contains("8 rooms"));
    }

    @Given("click on number of travelers text field")
    public void click_on_number_of_travelers_text_field() {
        Hotel hotel = new Hotel();
        hotel.getBookHotelTab().click();
        Common.waitInSecond(1);
        hotel.getNumberOF_travelers().click();
        Common.waitInSecond(1);
    }
    @Then("verify that eight adult and eight children has been selected")
    public void verify_that_eight_adult_and_eight_children_has_been_selected() {
        Hotel hotel = new Hotel();
        List<WebElement> increment_button = hotel.getIncrement_button();
        for (WebElement increment:increment_button) {
          for (int i=0;i<9;i++){
              increment.click();
              Common.waitInSecond(1);
          }

        }
        WebElement numberOF_travelers = hotel.getNumberOF_travelers();
        String value = numberOF_travelers.getAttribute("value");
        Assert.assertTrue(value.contains("16 travelers"));
    }

    @Given("choose more than one room in number of room text field")
    public void choose_more_than_one_room_in_number_of_room_text_field() {
        Hotel hotel = new Hotel();
        hotel.getBookHotelTab().click();
        Common.waitInSecond(1);
        hotel.getNumberOfRoom_textField().click();
        Common.waitInSecond(1);
        List<WebElement> numberOfRoom_dropDown = hotel.getNumberOfRoom_dropDown();
        for (WebElement room:numberOfRoom_dropDown){
            if (room.getAttribute("aria-label").equals("8 rooms")) {
                room.click();
                Common.waitInSecond(1);
                break;
            }
        }
    }
    @Then("verify that number of travelers field it disappeared")
    public void verify_that_number_of_travelers_field_it_disappeared() {
        Hotel hotel = new Hotel();
       Assert.assertFalse( hotel.getNumberOF_travelers().isDisplayed());

    }

    @Given("fill up hotel drop down form")
    public void fill_up_hotel_drop_down_form() {
        Hotel hotel = new Hotel();
        hotel.getGoingTo_textFiled().sendKeys("Miami Beach, Florida, United States of America");
        hotel.getCheckIn_textField().click();
        Common.waitInSecond(1);
        hotel.getCheckIn_date().click();
        Common.waitInSecond(1);
        hotel.getCheckOut_date().click();
        Common.waitInSecond(2);

    }
    @Given("click on find hotel button")
    public void click_on_find_hotel_button() {
        Hotel hotel = new Hotel();
        hotel.getFindHotel_button().click();
        Common.waitInSecond(4);

    }
    @Then("verify that all hotels result are displayed")
    public void verify_that_all_hotels_result_are_displayed() {
        Hotel hotel = new Hotel();
        String text = hotel.getHotelsSearch_result().getText();
        System.out.println(text);
    }
}
