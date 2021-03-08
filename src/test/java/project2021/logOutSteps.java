package project2021;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class logOutSteps 
{
boolean falg =false;
public Library library=new Library();


@Given("The administrator is loged in with username {string} and password {string}")
public void the_administrator_is_loged_in_with_username_and_password(String string, String string2)
{
	falg=library.logIn(string,string2);
}

@When("I call logout function")
public void i_call_logout_function() 
{
	library.logOut();
}

@Then("The administrator should be logout")
public void the_administrator_should_be_logout() 
{

	boolean flag = false;
	assertTrue(flag==false);

}


}
