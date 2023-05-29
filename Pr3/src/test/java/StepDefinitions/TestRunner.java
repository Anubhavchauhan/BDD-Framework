package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.core.cli.Main;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome= true,
//plugin = {"pretty", "html:target/HtmlReports/report.html"}
plugin = {"json:target/cucumber.json"},
//plugin = {"json", "target/JSONReports/report.json"
tags="@smoketest"
		
		)


public class TestRunner{
	
	
}
