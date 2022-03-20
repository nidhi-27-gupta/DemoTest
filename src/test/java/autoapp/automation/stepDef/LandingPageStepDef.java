package autoapp.automation.stepDef;

import org.junit.Assert;

import autoapp.automation.pages.LandingPage;
import autoapp.automation.pages.SummerDressesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageStepDef {

    @Given("^Automation practice website is opened$")
    public void automation_practice_website_is_opened() throws Throwable {
        LandingPage.openApplicaiton();
    }

    @When("^I hover my mouse to megamenu item Dresses -> Summer dresses$")
    public void select_menu_item() throws Throwable {
        LandingPage.clickSummerDressesMenu();
    }

    @Then("^I should be able to view Summer dresses page$")
    public void view_selected_page() throws Throwable {
        Assert.assertEquals(true, SummerDressesPage.verifyCategoryName());
    }

}
