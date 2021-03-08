package project2021;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchBookSteps {
	
	public Library library= new Library();
    public Book result;
	
	@Given("there is a book with title {string}")
	public void there_is_a_book_with_title(String string) 
	{
     System.out.println("...");
	}

	@When("I search with {string}")
	public void i_search_with(String string) 
	{
	  result= library.search_title(string);
	}

	@Then("{int} book should have been found with title {string}")
	public void book_should_have_been_found_with_title(Integer int1, String string)
	{
		assertTrue(result.getTitle().equals(string));
	}


@Given("there is a book with author {string}")
public void there_is_a_book_with_author(String string)
{
	System.out.println("..");
}

@When("I search withh {string}")
public void i_search_withh(String string) 
{
  result= library.search_author(string);
}

@Then("{int} book should have been found with author {string}")
public void book_should_have_been_found_with_author(Integer int1, String string) 
{
	assertTrue(result.getAouther().equals(string));
}





@Given("there is a book with ISBN {string}")
public void there_is_a_book_with_isbn(String string)
{
	System.out.println("..");

}

@When("I search with ISBN {string}")
public void i_search_with_isbn(String string) 
{
	  result= library.search_ISBN(string);
}



@Then("{int} book should have been found with ISBN {string}")
public void book_should_have_been_found_with_isbn(Integer int1, String string) 
{
	assertTrue(result.getISBN().equals(string));
}

	


@Given("the usear is already logged in with username {string} and password {string}")
public void the_usear_is_already_logged_in_with_username_and_password(String string, String string2)
{
  library.logIn(string,string2);
}

@When("I try to Search a book with title {string} and isbn {string} and author {string} and Signature {string}")
public void i_try_to_search_a_book_with_title_and_isbn_and_author_and_signature(String string, String string2, String string3, String string4) 
{
	library.searchBook(string,string2,string3,string4);
}

@Then("I will found the book in library with Signature {string}")
public void i_will_found_the_book_in_library_with_signature(String string)
{
    assertTrue(library.get1(string)!=null);
}






	
	
	
	
	
	

}
