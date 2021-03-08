package project2021;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	

	public Library library=new Library();
	
	@Given("there is already username {string} and password {string}")
	public void thier_is_already_username_and_password(String string, String string2) 
	{
		library.logIn(string,string2);

	}
	

	@When("the user try to login with username {string} and password {string}")
	public void the_user_try_to_login_with_username_and_password(String string, String string2) {
		library.addAdmin(string,string2);
	}

	@Then("the user will login")
	public void the_user_will_login()
	{
		assertTrue(library.logIn(null, null)==true);
	}
	

	
	
	
	@Then("the user will not login")
	public void the_user_will_not_login() 
	{

		assertTrue(library.logIn(null, null)!=true);
	}

	

}
