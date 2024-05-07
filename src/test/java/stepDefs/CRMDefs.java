package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMDefs {

	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User Logged in");
	}

	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User created new contact");
	}

	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view new contact");
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete new contact");
	}

	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("User create new deal");
	}

	@When("User view deal details")
	public void user_view_deal_details() {
		System.out.println("User View New Deal");
	}

	@When("User delete a deal")
	public void user_delete_a_deal() {
		System.out.println("User Delete the deal");
	}

	@When("User create a new task")
	public void user_create_a_new_task() {
		System.out.println("User created new task");
	}

	@When("User view task details")
	public void user_view_task_details() {
		System.out.println("User View new Task");
	}

	@When("User delete a task")
	public void user_delete_a_task() {
		System.out.println("User delete the task");
	}

}
