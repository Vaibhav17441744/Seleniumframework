package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features="src/test/resources/Features",
	glue="Stepdefinition",
	monochrome=true,
    plugin= {"html:target/cum1.html"}
	
		)

public class Testrunner extends AbstractTestNGCucumberTests {

}
