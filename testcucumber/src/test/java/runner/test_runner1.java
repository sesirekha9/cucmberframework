package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/loginadmin/user.feature",glue="defination3")

public class test_runner1 extends AbstractTestNGCucumberTests{

}
