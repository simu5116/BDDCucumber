package stepDefination;



import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class stepDefination {

    @Given("^User is on Net Banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
        System.out.println("i m in given");
    }

    @When("^User logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
      
    
    	System.out.println("i m in when");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("i m in then");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("i m in and");
    }

}
