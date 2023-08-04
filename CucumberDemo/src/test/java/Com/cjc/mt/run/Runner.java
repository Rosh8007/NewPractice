package Com.cjc.mt.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src/test/resources/features/login.feature"},
	glue = {"Com.cjc.mt.step"},tags = {"@Abc,@Xyz"},format = {"pretty","html:target/Destination"})
	public class Runner
	{
		
	}


