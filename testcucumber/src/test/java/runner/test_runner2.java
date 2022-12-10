package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/loginadmin/adminvalid.feature", glue= {"defination4"},tags ="@NegativeTesting")
public class test_runner2 extends AbstractTestNGCucumberTests{

}
