package Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/"},
		features = {"src/Cucumber/"}
		)


public class CucumberRunner {
	
}

//#http://thetestroom.com/webapp/