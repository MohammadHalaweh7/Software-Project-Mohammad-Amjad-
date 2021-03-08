package project2021;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addBookSteps {
	
	public Library library= new Library();

	@Given("the usear is already logged in")
	public void the_usear_is_already_logged_in() {
	   System.out.println("..");
	}

	@When("add a book with title {string} and isbn {string} and author {string} and Signature {string}")
	public void add_a_book_with_title_and_isbn_and_author_and_signature(String string, String string2, String string3, String string4) {
	     library.add(string, string2, string3, string4);
	}

	@Then("I will found the book in library with Signature {string}")
	public void i_will_found_the_book_in_library_with_signature(String string) {
	    assertTrue(library.get1(string)!=null);
	}
	
	
	@Given("the usear not logged in")
	public void the_usear_not_logged_in() {
		 System.out.println("..");
	}

	@When("I try to add a book with title {string} and isbn {string} and author {string} and Signature {string}")
	public void i_try_to_add_a_book_with_title_and_isbn_and_author_and_signature(String string, String string2, String string3, String string4) {
		 System.out.println("can't add"); }

	@Then("I can't found the book in library with Signature {string}")
	public void i_can_t_found_the_book_in_library_with_signature(String string) {
		  assertTrue(library.get1(string)!=null);
	}



	
	
	
	
	
	
	
	
	
	


}
