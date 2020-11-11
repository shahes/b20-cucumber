package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {
    //creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Given("User is on the google search page")
    public void user_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");

    }


    //Some other steps were also undefined:

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals("Verification failed", expectedTitle, actualTitle);

    }


    @When("User searches apple")
    public void userSearchesApple() {

        googleSearchPage.searchBox.sendKeys("apple", Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("User searches {string}")
    public void userSearches(String searchValue) {


    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String expectedTitle = searchValue + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Then("User should see all of them below")
    public void user_should_see_all_of_them_below(List<String> fruitlist) {
        System.out.println("fruitlist.size() = " + fruitlist.size());
        System.out.println(fruitlist);
    }


    @Then("user should be able to see the all footer links")
    public void user_should_be_able_to_see_the_all_footer_links(List<String> FooterLinks) {
        System.out.println("FooterLinks.size() = " + FooterLinks.size());
        int expectedSize = FooterLinks.size();
        System.out.println("FooterLinks = " + FooterLinks);
        int actualSize = googleSearchPage.footerLinks.size();
        Assert.assertTrue(actualSize==expectedSize);
    }

}