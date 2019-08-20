package mystepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Demo_tags {

	@Given("Launch the Flipkart App")
	public void launch_the_Flipkart_App() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Launching the flipkart app");
	}

	@Given("Enter credentials")
	public void enter_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Enters credentials");
	}

	@Then("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Clicks on login");
	}

	@Given("User searching the product with code")
	public void user_searching_the_product_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Searching the product");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("add to cart");
	}

	@Given("user able to see the items count on cart")
	public void user_able_to_see_the_items_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Check items count on cart");
	}

	@Then("User decides to remove an  item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Remove an item");
	}

	@Given("User has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("active order");
	}

	@Then("User verifies the status of the order")
	public void user_verifies_the_status_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Verifies status");
	}

}
