package com.united.steps.sanity_test_steps;

import com.united.modal.travelTab_model.Flight;
import com.united.sections.Footer_Section;
import com.united.sections.Header_sections;
import com.united.sections.Top_headerSection;
import com.united.util.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Sanity_Test {

    @Given("verify that flight tabs displayed")
    public void verify_that_flight_tabs_displayed() {
        Flight flight = new Flight();
        int size = flight.getBookFlight_tabs().size();
        System.out.println(size);
    }

    //scenario 2
    @Given("click on globe Language icon")
    public void click_on_globe_language_icon() {
        Top_headerSection top_headerSection = new Top_headerSection();
        top_headerSection.getGlobeLanguage_icon().click();
        Common.waitInSecond(1);

    }

    @And("click on select language text field")
    public void click_on_select_language_text_field() {
        Top_headerSection top_headerSection = new Top_headerSection();
        top_headerSection.getSelectLanguage_textField().click();
        Common.waitInSecond(1);
    }

    @And("choose the language")
    public void choose_the_language() {
        Top_headerSection top_headerSection = new Top_headerSection();
        for (WebElement language : top_headerSection.getDropDown_language()) {
            if (language.getAttribute("aria-label").equals("Español")) {
                language.click();
                Common.waitInSecond(1);
            }

        }
        Common.waitInSecond(6);
    Common.highlight_element( top_headerSection.getSelectLanguage_textField());
    }

    @Then("verify that language has been change successfully")
    public void verify_that_language_has_been_change_successfully() {
        Top_headerSection top_headerSection = new Top_headerSection();
        String text = top_headerSection.getHomePage_language().getText();
        Assert.assertTrue(text.contains("Español"));

    }
//scenario 3

    @Given("in header click on book tab")
    public void in_header_click_on_book_tab() {
        Header_sections header_sections = new Header_sections();
        Common.waitInSecond(2);
        header_sections.getHeaderBook_tab().click();
        Common.waitInSecond(1);
    }

    @Then("verify that book tabs are displayed")
    public void verify_that_book_tabs_are_displayed() {
        Header_sections header_sections = new Header_sections();
        Assert.assertTrue(header_sections.getHeader_bookTabDropDown().isDisplayed());
        Common.waitInSecond(1);
    }

    @And("in header click on my trips tabs")
    public void in_header_click_on_my_trips_tabs() {
        Header_sections header_sections = new Header_sections();
        header_sections.getHeader_myTripsTab().click();
        Common.waitInSecond(1);
    }

    @Then("verify that my trips tabs is displayed")
    public void verify_that_my_trips_tabs_is_displayed() {
        Header_sections header_sections = new Header_sections();
        Assert.assertTrue(header_sections.getHeader_myTripDropDown().isDisplayed());
    }

    @And("click on travel info")
    public void click_on_travel_info() {
        Header_sections header_sections = new Header_sections();
        header_sections.getHeader_travelInfo().click();
        Common.waitInSecond(1);
    }

    @Then("verify that travel info is displayed")
    public void verify_that_travel_info_is_displayed() {
        Header_sections header_sections = new Header_sections();
        boolean result = header_sections.getHeader_travelInfoDropDown().isDisplayed();
        Assert.assertTrue(result);

    }

    @And("click on mealg plus program")
    public void click_on_mealg_plus_program() {
        Header_sections header_sections = new Header_sections();
        header_sections.getHeader_mileagPlusProgram().click();
        Common.waitInSecond(1);
    }

    @Then("verify that mealg plus program is displayed")
    public void verify_that_mealg_plus_program_is_displayed() {
        Header_sections header_sections = new Header_sections();
        boolean result = header_sections.getHeader_mileagpulsDropDown().isDisplayed();
        Assert.assertTrue(result);
    }

    @And("click deal link in header section")
    public void click_deal_link_in_header_section() {
        Header_sections header_sections = new Header_sections();
        header_sections.getHeader_deal().click();
        Common.waitInSecond(1);
    }

    @Then("verify that deal link has been displayed successfully")
    public void verify_that_deal_link_has_been_displayed_successfully() {
        Header_sections header_sections = new Header_sections();
        boolean result = header_sections.getHeader_dealLinkDropDown().isDisplayed();
        Assert.assertTrue(result);
    }

    @And("click on help link in header section")
    public void click_on_help_link_in_header_section() {
        Header_sections header_sections = new Header_sections();
        header_sections.getHeader_helpLink().click();
        Common.waitInSecond(1);
    }

    @Then("verify that help link is displayed")
    public void verify_that_help_link_is_displayed() {
        Header_sections header_sections = new Header_sections();
        boolean result = header_sections.getHeader_helpLinkDropDown().isDisplayed();
        Assert.assertTrue(result);
    }

    //scenario 4
    @Given("verify that advisory in top of home page is displayed")
    public void verify_that_advisory_in_top_of_home_page_is_displayed() {
        Header_sections header_sections = new Header_sections();
        List<WebElement> advisoryLink_topOfHeader = header_sections.getAdvisoryLink_topOfHeader();
        for (WebElement links : advisoryLink_topOfHeader) {
            links.isDisplayed();
            Common.waitInSecond(1);
        }
    }

    //Scenario 5
    @Given("in footer section verify that all links it's not broken")
    public void in_footer_section_verify_that_all_links_it_s_not_broken() {
        Footer_Section footer_section = new Footer_Section();
        List<WebElement> footer_links = footer_section.getFooter_links();
        for (WebElement link : footer_links) {
            String text = link.getAttribute("href");
            System.out.println(text);
            Assert.assertFalse(text.isEmpty());
        }
    }
}
