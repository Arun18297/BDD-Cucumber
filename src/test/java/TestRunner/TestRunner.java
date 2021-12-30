package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = {"./src/test/java/Feature/CreateOrg.feature"}, //It will set the path of the feature file 
				glue = {"StepDefinetion_Org"}, //It will set the path of the step definition files.
				dryRun = true, //Cucumber will only check that every step in Feature File has corresponding code written in Step Definition file or not. In case any functions are missed in the Step Definition file, it will give us the message.
				monochrome = true, //used to display console output in color format.i.e., much more readable
				plugin = {"pretty"} // Pretty: Prints the Gherkin source with additional colors and stack traces for errors.
				)

public class TestRunner extends AbstractTestNGCucumberTests {

}