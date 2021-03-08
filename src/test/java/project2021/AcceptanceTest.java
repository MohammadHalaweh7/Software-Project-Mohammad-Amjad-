package project2021;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="html:webSiteTesting/webSiteOutput.html",features="use_cases" , glue="project2021")
public class AcceptanceTest {

}
