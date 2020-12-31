package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations",
		format= {"pretty","junit:junit_xml_output/cucumber.xml"},
		monochrome=true
		)
public class TestRunner {
	
}
	
	
	

