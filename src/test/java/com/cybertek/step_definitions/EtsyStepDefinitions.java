package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is  on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://www.etsy.com/");


        Driver.getDriver().manage().window().maximize();
    }


    @Then("User should see the title is as expected")
    public void user_should_see_the_title_is_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @When("User searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchValue) {
etsySearchPage.searchBox.sendKeys(searchValue);
    }

    @And("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
etsySearchPage.searchButton.click();
    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }






}
