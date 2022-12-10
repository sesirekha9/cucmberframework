package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/loginadmin/logina.feature"},glue= {"defination5"}, tags ="@PositiveTesting")
public class test_runner3 extends AbstractTestNGCucumberTests{

}
