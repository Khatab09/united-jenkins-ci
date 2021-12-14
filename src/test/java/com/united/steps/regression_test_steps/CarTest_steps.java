package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.Car_section;
import com.united.util.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hooks.driver;

public class CarTest_steps {
    @Given("click on car tab")
    public void click_on_car_tab() {
        Car_section car_section = new Car_section();
        car_section.getCar_tab().click();
        Common.waitInSecond(1);
    }

    @Then("verify that all drop down is displayed")
    public void verify_that_all_drop_down_is_displayed() {
        Car_section car_section = new Car_section();
        Assert.assertTrue(car_section.getCarDropDown_area().isDisplayed());
    }

    @Given("click on drop off location radio button")
    public void click_on_drop_off_location_radio_button() {
        Car_section car_section = new Car_section();
        car_section.getCar_tab().click();
        Common.waitInSecond(1);
        car_section.getReturnCarTo_sameLocation().click();
        Common.waitInSecond(1);
        int size = car_section.getDropDownOffLocation_area().size();
        Assert.assertEquals(size, 1);

    }

    @Then("verify that drop off location it disappeared")
    public void verify_that_drop_off_location_it_disappeared() {
        Car_section car_section = new Car_section();
        car_section.getReturnCarTo_sameLocation().click();
        Common.waitInSecond(1);
        int size = car_section.getDropDownOffLocation_area().size();
        Assert.assertEquals(size, 0);
    }
    @Given("click on Primary driver is {int} or older check box")
    public void click_on_primary_driver_is_or_older_check_box(Integer int1) {
        Car_section car_section = new Car_section();
        WebElement ageChek_box = car_section.getAgeChek_box();
        ageChek_box.click();
        Common.waitInSecond(1);
        int size = car_section.getDriverAge().size();
        Assert.assertEquals(size,1);
    }
    @Then("verify that age field disappeared")
    public void verify_that_age_field_disappeared() {
        Car_section car_section = new Car_section();
        WebElement ageChek_box = car_section.getAgeChek_box();
        ageChek_box.click();
        int size = car_section.getDriverAge().size();
        Assert.assertEquals(size,0);

    }


    @Given("fill up the car drop down form")
    public void fill_up_the_car_drop_down_form() {
        Common.waitInSecond(2);
        Car_section car_section = new Car_section();
        car_section.getCar_tab().click();
        Common.waitInSecond(1);
        car_section.getPickUp_location().click();
        Common.waitInSecond(1);
        car_section.getPickUp_location().sendKeys("Virgin");
        car_section.getPickUpLocation_dropDown().click();
        Common.waitInSecond(1);
        car_section.getReturnCarTo_sameLocation().click();
        Common.waitInSecond(2);
        car_section.getDropDownOffLocation().sendKeys("Marr");
        car_section.getDropOffLocation_dropDown().click();
        Common.waitInSecond(1);
        car_section.getPickUpDate_textField().click();
        Common.waitInSecond(1);
        car_section.getPickUp_date().click();
        Common.waitInSecond(1);
        car_section.getDropOffDate_textField().click();
        Common.waitInSecond(1);
        car_section.getPickUp_date().click();
        Common.waitInSecond(1);
        car_section.getAgeChek_box().click();
        Common.waitInSecond(1);
        car_section.getAge_textField().sendKeys("23");
        Common.waitInSecond(1);
        car_section.getPickUp_time().click();
        Common.waitInSecond(1);
        car_section.getPickUp_time().sendKeys("10:00 a.m.");
        Common.waitInSecond(1);



    }
    @Given("click on find car button")
    public void click_on_find_car_button() {
        Car_section car_section = new Car_section();
        car_section.getFindCars_button().click();
        Common.waitInSecond(1);
    }
    @Then("verify that navigate to a separate tab")
    public void verify_that_navigate_to_a_separate_tab() {
        Car_section car_section = new Car_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Common.waitInSecond(3);
     Assert.assertTrue(car_section.getCheckForm().isDisplayed());

    }

    @Given("click on book with mile check box")
    public void click_on_book_with_mile_check_box() {
        Car_section car_section = new Car_section();
        car_section.getBookWithMile_checkBox().click();
    }
    @Then("verify that result with only mile")
    public void verify_that_result_with_only_mile() {
        Car_section car_section = new Car_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Common.waitInSecond(3);
        Assert.assertTrue(car_section.getCheckForm().isDisplayed());

    }
    @Given("Given click on car tab")
    public void given_click_on_car_tab() {
        Car_section car_section = new Car_section();
        car_section.getCar_tab().click();
        Common.waitInSecond(1);
    }
    @Given("fill up the car drop down form with age less than {int}")
    public void fill_up_the_car_drop_down_form_with_age_less_than(Integer int1) {
        Common.waitInSecond(2);
        Car_section car_section = new Car_section();
        car_section.getCar_tab().click();
        Common.waitInSecond(1);
        car_section.getPickUp_location().click();
        Common.waitInSecond(1);
        car_section.getPickUp_location().sendKeys("Virgin");
        car_section.getPickUpLocation_dropDown().click();
        Common.waitInSecond(1);
        car_section.getReturnCarTo_sameLocation().click();
        Common.waitInSecond(2);
        car_section.getDropDownOffLocation().sendKeys("Marr");
        car_section.getDropOffLocation_dropDown().click();
        Common.waitInSecond(1);
        car_section.getPickUpDate_textField().click();
        Common.waitInSecond(1);
        car_section.getPickUp_date().click();
        Common.waitInSecond(1);
        car_section.getDropOffDate_textField().click();
        Common.waitInSecond(1);
        car_section.getPickUp_date().click();
        Common.waitInSecond(1);
        car_section.getAgeChek_box().click();
        Common.waitInSecond(1);
        car_section.getAge_textField().sendKeys("17");
        Common.waitInSecond(1);
        car_section.getPickUp_time().click();
        Common.waitInSecond(1);
        car_section.getPickUp_time().sendKeys("10:00 a.m.");
        Common.waitInSecond(1);
        car_section.getFindCars_button().click();
        Common.waitInSecond(4);
    }
    @Then("verify that no search result")
    public void verify_that_no_search_result() {
        Car_section car_section = new Car_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String text = car_section.getResultUnderAge().getText();
        System.out.println(text);

    }
}
