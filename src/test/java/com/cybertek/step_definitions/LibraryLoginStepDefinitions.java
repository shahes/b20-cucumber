package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on the login page");
    }



    @When("user logs in as librarian")
    public void user_logs_in_as_librarian() {
        System.out.println("User logs in as librarian");
    }


    @Then("user should be able to see the dashboard")
    public void user_should_be_able_to_see_the_dashboard() {
        System.out.println("user should see the dashboard");

    }
    @When("user logs in as student")
    public void user_logs_in_as_student() {
        System.out.println("user logs in as student");
    }



    @When("user logs in as Admin")
    public void user_logs_in_as_admin() {
        System.out.println("user logs in as admin");
    }


}
