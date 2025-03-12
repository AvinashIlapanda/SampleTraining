package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\sample3.feature",
glue= {"StepDefinition","Hooks"},
plugin= {"pretty","html:target/cucumberreport/report2.html"},
//tags=("@SmokeTest or @SystemTest"),
monochrome=true)
public class Demong extends AbstractTestNGCucumberTests{
	

}
