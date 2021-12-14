package com.united.steps.regression_test_steps;

import com.united.modal.travelTab_model.Package_section;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.united.base.Hooks.driver;

public class PackageTest_Steps {

    @Given("click on package link")
    public void click_on_package_link() {
        Package_section package_section = new Package_section();
        package_section.getPackageTab_link().click();
        Common.waitInSecond(1);

    }

    @And("fill up package drop down form")
    public void fill_up_package_drop_down_form() {
        Package_section package_section = new Package_section();
        package_section.getFrom_textField().sendKeys("Wa");
        package_section.getLeavingFrom_dropDown().click();
        Common.waitInSecond(1);
        package_section.getLeavingTo_TEXTField().sendKeys("mi");
        Common.waitInSecond(1);
        package_section.getLeavingTo_dropDown().click();
        Common.waitInSecond(1);
        package_section.getDepartDate_textField().click();
        Common.waitInSecond(1);
        package_section.getDepart_date().click();
        Common.waitInSecond(1);
        package_section.getReturnDate_textField().click();
        Common.waitInSecond(1);
        package_section.getReturn_date().click();
        Common.waitInSecond(2);

    }

    @And("click on find trip button")
    public void click_on_find_trip_button() {
        Package_section package_section = new Package_section();
        package_section.getFindTrip_button().click();
        Common.waitInSecond(2);

    }

    @Then("verify that search result it's displayed")
    public void verify_that_search_result_it_s_displayed() {
        Package_section package_section = new Package_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        int size = package_section.getSearch_resultPage().size();
        Assert.assertEquals(size, 40);


    }


    @Given("choose at least four room")
    public void choose_at_least_four_room() {
        Package_section package_section = new Package_section();
        package_section.getTraveler_textField().click();
        Common.waitInSecond(1);
        for (int i = 0; i < 3; i++) {
            package_section.getIncrementTraveler().click();
            Common.waitInSecond(1);
        }

        package_section.getRoom_textField().click();
        Common.waitInSecond(1);
        List<WebElement> room_dropDown = package_section.getRoom_dropDown();
        selectFromListByAttribute(package_section.getRoom_dropDown(), "aria-label", "2 rooms");

        package_section.getFindTrip_button().click();
        Common.waitInSecond(4);

    }

    @Then("verify that four room has ben select")
    public void verify_that_four_room_has_ben_select() {
        Package_section package_section = new Package_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String text = package_section.getResultPage_header().getText();
        Assert.assertTrue(text.contains("4 rooms"));
    }

    @Given("choose more than one room")
    public void choose_more_than_one_room() {
        Package_section package_section = new Package_section();
        package_section.getRoom_textField().click();
        Common.waitInSecond(1);

        selectFromListByAttribute(package_section.getRoom_dropDown(), "aria-label", "4 rooms");

        Common.waitInSecond(2);
    }

    @Then("verify that room text field contain rooms")
    public void verify_that_room_text_field_contain_rooms() {
        Package_section package_section = new Package_section();
        String text = package_section.getRoom_three().getText();
        Assert.assertTrue(text.contains("rooms"));

    }
    @Given("click on cruise link")
    public void click_on_cruise_link() {
        Package_section package_section = new Package_section();
        package_section.getCruise_link().click();
        Common.waitInSecond(1);
    }
    @Then("verify that link navigate to united cruises page")
    public void verify_that_link_navigate_to_united_cruises_page() {
        Package_section package_section = new Package_section();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://cruises.united.com/"));

    }

    public void selectFromListByAttribute(List<WebElement> list, String attribute, String expected) {
        for (WebElement l : list) {
            if (l.getAttribute(attribute).equals(expected)) {
                l.click();
            }
        }
    }

}
