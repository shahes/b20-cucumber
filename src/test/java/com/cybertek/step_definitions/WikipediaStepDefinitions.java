package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaStepDefinitions {
WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User enters a {string}  in the search box and clicks")
    public void userEntersAInTheSearchBoxAndClicks(String string) {
        wikipediaSearchPage.searchBox.sendKeys(string+ Keys.ENTER);

    }


    @Then("User sees {string} in the title of the page")
    public void user_sees_in_the_title_of_the_page(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        System.out.println(expectedInTitle);
    }


    @Then("User sees {string} in the main header")
    public void userSeesInTheMainHeader(String expected) {
String actualMainHeader = wikipediaSearchPage.mainHeader.getText();
Assert.assertTrue(actualMainHeader.contains(expected));
        System.out.println(expected);
    }


    @Then("User sees {string} in the image header")
    public void userSeesInTheImageHeader(String imageHeader) throws InterruptedException {

       String actualHeader = wikipediaSearchPage.imageHeader.getText();
       Thread.sleep(1000);
       Assert.assertTrue(actualHeader.contains(imageHeader));
        System.out.println(imageHeader);
    }
}
