package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
features = {"src\\test\\resources\\test_Folder\\Cucumber.feature"},	

glue = {"step"},

publish =true,

plugin = {"pretty"}
		)


public class Cucumber_Runner_Class  extends AbstractTestNGCucumberTests{
	
	

}
