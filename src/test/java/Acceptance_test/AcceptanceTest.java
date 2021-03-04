package Acceptance_test;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions; 

@RunWith (Cucumber.class)
@CucumberOptions (features = "uses-cases-features", plugin = {
		"html: target / cucumber / wikipedia.html"}, monochrome = true, snippets = SnippetType.CAMELCASE, glue = {
				"Acceptance_test"  }, strict = true)



public class AcceptanceTest 
{

}