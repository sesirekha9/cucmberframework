package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login/login.feature"},dryRun = false ,glue= {"defination"}, tags ="@PositiveTesting")

public class test_runner extends AbstractTestNGCucumberTests{
	
	

}
